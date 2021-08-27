package business;

import initialprocess.Appointment;
import initialprocess.InPatient;
import initialprocess.Patients;
import initialprocess.VisitingInformation;
import utility.PatientType;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 */
public class ReportBO {
  /*  The following reports are need
      Display patient details for the patient name/id
      Display the list of visit for the patient id
      Display the visit details for given date range
      Display the list of patient who needs the followup visit
      Display the list of patient by doctor id
      Display all patient who are in-patient
      Display only the out-patient
      Display the today’s visited patient  */

    public void displayPatientDetails(Map<Long, Patients> patientsMap, Long patientId, String patientsName) {
        System.out.println("-------------------Display  patient details for the patient name/id------------------");
        Patients patients;
        if (!patientsMap.isEmpty()) {
            if (patientsMap.containsKey(patientId)) {
                patients = patientsMap.get(patientId);
                System.out.println("Patients details by id :" + patients);
            } else {
                System.out.println("patient details is not available for given patient id");
            }
            if (patientsName != null && patientsName != "") {
                boolean isPatientNameAvailable = false;
                Iterator<Long> patientItr = patientsMap.keySet().iterator();
                while (patientItr.hasNext()) {
                    patients = patientsMap.get(patientItr.next());
                    if (patients.getPatientName().equals(patientsName)) {
                        isPatientNameAvailable = true;
                        System.out.println("patient details :" + patients);
                    }
                }
                if (!isPatientNameAvailable)   // isPatientNameAvailable == false
                    System.out.println("patient name is not available for given patient details");
            }
        }
    }

    public void displayListOfVisitForPatientId(Map<Long, VisitingInformation> visitingInformationDetails, Long patientId) {
        System.out.println("-----------------Display the list of visit for the patient id----------------");
        VisitingInformation visitingInformation;
        if (!visitingInformationDetails.isEmpty() && visitingInformationDetails.containsKey(patientId)) {
            visitingInformation = visitingInformationDetails.get(patientId);
            System.out.println("visits details:" + visitingInformation);
        } else {
            System.out.println("list of visit for patientId and also visiting information details are not available");
        }
    }

    public void displayPatientsForPatientsId(Map<Long, Patients> patientsMap, Long patientId) {
        System.out.println("-----------------Display the list of patients Id----------------");
        Patients patients;
        if (!patientsMap.isEmpty() && patientsMap.containsKey(patientId)) {
            patients = patientsMap.get(patientId);
            System.out.println("Patients id is :" + patients.getPatientId());
        } else {
            System.out.println("patients id is not available for the given patients :");
        }
    }

    public void displayPatientsForDoctorId(Map<Long, Appointment> appointmentMap, Long doctorId) {
        System.out.println("-----------------Display the list of patient by doctor id----------------");
        Appointment appointment;
        if (!appointmentMap.isEmpty() && appointmentMap.containsKey(doctorId)) {
            appointment = appointmentMap.get(doctorId);
            System.out.println("Doctor detail is :" + appointment.getDoctor());
            System.out.println("Doctor id is :" + doctorId);
        } else {
            System.out.println("Doctor id and also doctor details are not available :");
        }
    }

    public void displayOutPatientDetails(Map<Long, Patients> patientsMap) {
        System.out.println("-----------------Display only the out-patient----------------");
        Patients patients;
        boolean outPatientIsAvailable = false;
        for (Long patient : patientsMap.keySet()) {
            patients = patientsMap.get(patient);
            if (patients.getPatientType().equals(PatientType.OUTPATIENT.getType())) {
                outPatientIsAvailable = true;
                System.out.println("out patient details :" + patients);
            }
        }
        if (!outPatientIsAvailable) {
            System.out.println("outpatient details is not available");
        }
    }

    public void displayInPatientDetails(Map<Long, InPatient> inPatientMap) {
        System.out.println("----------------Display all patient who are in-patient--------------");
        InPatient inPatient;
        boolean inPatientIsAvailable = false;
        for (Long inPatients : inPatientMap.keySet()) {
            inPatientIsAvailable = true;
            inPatient = inPatientMap.get(inPatients);
            if (inPatient.getPatients().getPatientType().equalsIgnoreCase(PatientType.INPATIENT.getType()))
                System.out.println("Inpatient details :" + inPatient);
        }
        if (!inPatientIsAvailable) {
            System.out.println("Inpatient detail is not available");
        }
    }

    public void displayTheListOfPatientWhoNeedsTheFollowUpVisit(Map<Long, VisitingInformation> visitingInformationMap) {
        System.out.println("-----------------Display the list of patient who needs the followup visit---------------");
        Iterator<Long> itr = visitingInformationMap.keySet().iterator();
        boolean isFollowUpNeed = false;
        while (itr.hasNext()) {
            VisitingInformation visitingInformation = visitingInformationMap.get(itr.next());
            if (!visitingInformationMap.isEmpty() && visitingInformation.getFollowUpNeed() != null && visitingInformation.getFollowUpNeed()) {
                isFollowUpNeed = true;
                System.out.println("patients followUp details :" + visitingInformation.getAppointment().getPatients());
            }
        }
        if (isFollowUpNeed == false) {
            System.out.println("patient followup not need: ");
        }
    }

    public void displayTodayVisitedPatientDetails(Map<Long, VisitingInformation> visitingInformationMap, Map<Long, Appointment> appointmentMap) throws ParseException {
        System.out.println("-----------------Display the today’s visited patient Detail---------------");
        VisitingInformation visitingInformation;
        Appointment appointment;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        for (Long visitId : appointmentMap.keySet()) {
            appointment = appointmentMap.get(visitId);
            Date dates = appointment.getDateOfVisit();
            String date1 = simpleDateFormat.format(dates);
            String date2 = simpleDateFormat1.format(Calendar.getInstance().getTime());
            if (date1.equals(date2)) {
                System.out.println(appointment.getPatients());
            }
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/YYYY");
        Iterator<Long> itr = visitingInformationMap.keySet().iterator();
        while (itr.hasNext()) {
            visitingInformation = visitingInformationMap.get(itr.next());
            date = visitingInformation.getAppointment().getDateOfVisit();
           /* Date date1 = simpleDateFormat2.parse(simpleDateFormat2.format(date));
            if (date.equals(date1)) {
                System.out.println(date);
            }*/
            Date visitingDate = simpleDateFormat2.parse(simpleDateFormat2.format(date));
            Date startDate = new SimpleDateFormat("dd/MM/YYYY").parse("2021/1/1");
            Date endDate = new SimpleDateFormat("dd/MM/YYYY").parse("2021/4/4");
            if (startDate.equals(endDate)) {
                System.out.println(visitingInformation.getAppointment().getPatients());
            }
            System.out.println(visitingDate);
        }
        /* visitingInformationMap.get(calenderMap.get(new Date()));
                if (!calenderMap.isEmpty() && calenderMap.containsKey(visitingInformation.getAppointment().getPatients())) {
                    simpleDateFormat.format(DateFormat.getDateInstance());
                }
                System.out.println(calenderMap);*/

    }

}













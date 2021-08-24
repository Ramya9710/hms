package business;

import initialprocess.Appointment;
import initialprocess.InPatient;
import initialprocess.Patients;
import initialprocess.VisitingInformation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

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
                System.out.println("patients details by id :" + patientsMap.get(patientId));
                patients = patientsMap.get(patientId);
                System.out.println("Patients details by id :" + patients);
            } else {
                System.out.println("patient details is not available for given patient id");
            }
            if (patientsName != null && patientsName != "") {
                Iterator<Long> patientItr = patientsMap.keySet().iterator();
                while (patientItr.hasNext()) {
                    patients = patientsMap.get(patientItr.next());
                    if (patients.getPatientName().equals(patientsName)) {
                        System.out.println("patient details :" + patients);
                    }
                }
            }
            System.out.println("patient Id is :" + patientId);
        }
    }

    public void displayListOfVisitForPatientId(Map<Long, VisitingInformation> visitingInformationDetails, Long
            patientId) {
        System.out.println("-----------------Display the list of visit for the patient id----------------");
        VisitingInformation visitingInformation;
        if (!visitingInformationDetails.isEmpty() && visitingInformationDetails.containsKey(patientId)) {
            visitingInformation = visitingInformationDetails.get(patientId);
            System.out.println("visits details:" + visitingInformation);
            System.out.println("patient ID is :" + patientId);
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
        Iterator<Long> iterator = patientsMap.keySet().iterator();
        while (iterator.hasNext()) {
            patients = patientsMap.get(iterator.next());
            if (!patientsMap.isEmpty() && patients.getPatientType().equals("op")) {
                System.out.println("Out patient details :" + patients.getPatientType().equals("op"));
            } else {
                System.out.println("outpatient detail is not available ");
            }
        }
    }

    public void displayInPatientDetails(Map<Long, InPatient> inPatientMap) {
        System.out.println("----------------Display all patient who are in-patient--------------");
        InPatient inPatient;
        Iterator<Long> patientItr = inPatientMap.keySet().iterator();
        while (patientItr.hasNext()) {
            inPatient = inPatientMap.get(patientItr.next());
            if (!inPatientMap.isEmpty() && inPatient.getPatients().getPatientType().equals("ip")) {
                System.out.println("In patient details :" + inPatient.getPatients().getPatientType().equals(inPatient));
            } else {
                System.out.println("inpatient details is not available");
            }
        }
    }

    public void displayTheListOfPatientWhoNeedsTheFollowUpVisit(Map<Long, VisitingInformation> visitingInformationMap) {
        System.out.println("-----------------Display the list of patient who needs the followup visit---------------");
        Iterator<Long> itr = visitingInformationMap.keySet().iterator();
        while (itr.hasNext()) {
            VisitingInformation followUpNeed = visitingInformationMap.get(itr.next());
            if (!visitingInformationMap.isEmpty() && followUpNeed.getFollowUpNeed()) {
                System.out.println("patients follow up need details :" + followUpNeed);
            } else {
                System.out.println("patients follow up need details not available");
            }
        }
    }

    public void displayTodayVisitedPatientDetails(Map<Long, VisitingInformation> visitingInformationMap, Map<Long, Appointment> appointmentMap) throws Exception {
        System.out.println("-----------------Display the today’s visited patient-------------");
        if (visitingInformationMap.isEmpty()) {
            throw new Exception("no visiting details today");
        }
        VisitingInformation visitingInformation;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/YYYY");
        Date date;
        Iterator<Long> itr = visitingInformationMap.keySet().iterator();
        while (itr.hasNext()) {
            visitingInformation = visitingInformationMap.get(itr.next());
            date = visitingInformation.getAppointment().getDateOfVisit();

            Date date1 = simpleDateFormat2.parse(simpleDateFormat2.format(date));
            if (date.equals(date1)) {
                System.out.println(date);
            }
            Date visitingDate = simpleDateFormat2.parse(simpleDateFormat2.format(date));
            Date startDate = new SimpleDateFormat("dd/MM/YYYY").parse("2020/1/1");
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
        Appointment appointment;
        for (Long visitId : appointmentMap.keySet()) {
            appointment = appointmentMap.get(visitId);
            Date dates = appointment.getDateOfVisit();
            String date1 = simpleDateFormat.format(dates);
            String date2 = simpleDateFormat1.format(Calendar.getInstance().getTime());
            if (date1.equals(date2)) {
                System.out.println(appointment.getPatients());
            }
        }
    }

}













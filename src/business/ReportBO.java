package business;

import initialprocess.Appointment;
import initialprocess.InPatient;
import initialprocess.Patients;
import initialprocess.VisitingInformation;
import utility.PatientType;
import utility.SampleDate;

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
        VisitingInformation visitingInformation;
        boolean isFollowUpNeedIsMust = false;
        for (Long visits : visitingInformationMap.keySet()) {
            isFollowUpNeedIsMust = true;
            visitingInformation = visitingInformationMap.get(visits);
            if (visitingInformation.getFollowUpNeed())
                System.out.println("Follow up need details:" + visitingInformation);
        }
        if (!isFollowUpNeedIsMust) {
            System.out.println("Follow up need not necessary");
        }

    }

    public void displayTodayVisitedPatientDetails(Map<Long, VisitingInformation> visitingInformationMap) {
        System.out.println("-----------------Display the today’s visited patient Detail---------------");
        VisitingInformation visitingInformation;
        for (Long visits : visitingInformationMap.keySet()) {
            visitingInformation = visitingInformationMap.get(visits);
            Date currentDate = covertDateFormat(new Date());
            Date visitedDate = covertDateFormat(visitingInformation.getAppointment().getDateOfVisit());
            if (visitedDate.equals(currentDate)) {
                System.out.println("Today's visited date:" + visitedDate);
                System.out.println("today's visited patient details:" + visitingInformation.getAppointment().getPatients());
            }
        }
    }

    public void displayVisitedPatientDateRange(Map<Long, VisitingInformation> visitingInformationMap) {
        System.out.println("---------------Display visited patient date range-----------------");
        VisitingInformation visitingInformation;
        for (Long visitsCheck : visitingInformationMap.keySet()) {
            visitingInformation = visitingInformationMap.get(visitsCheck);
            Date visitDate = covertDateFormat(visitingInformation.getAppointment().getDateOfVisit());
            Date startDate = covertDateFormat(new Date());
            Date endDate = covertDateFormat(new Date(2021 / 12 / 31));
            // Date endDate = covertDateFormat(visitDate);
            if (visitDate.equals(startDate) || visitDate.equals(endDate) || (visitDate.after(startDate) && visitDate.before(endDate))) {
                System.out.println("Display visited patient date range:" + visitDate);
            }
        }
    }

    public Date covertDateFormat(Date date) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.format(date);
            return dateFormat.parse(dateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}















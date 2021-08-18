package business;

import initialprocess.Appointment;
import initialprocess.InPatient;
import initialprocess.Patients;
import initialprocess.VisitingInformation;

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

    public void displayPatientDetails(Map<Long, Patients> patientsMap, Long patientId) throws Exception {
        Patients patients = null;
        if (patientsMap.isEmpty()) {
            throw new Exception("patients is not available");
        }
        if (patientId == null && patientId == 0) {
            throw new Exception("patientId is not there");
        }
        if (patientsMap.containsKey(patients)) {
            patients = patientsMap.get(patientId);
            System.out.println("Patients details :" + patients);
        }
    }

    public void displayListOfVisitForPatientId(Map<Long, VisitingInformation> visitingInformationDetails, Long patientId) throws Exception {

        VisitingInformation visitingInformation;
        if (visitingInformationDetails.isEmpty()) {
            throw new Exception("no patients is there");
        }
        if (patientId == null && patientId == 0) {
            throw new Exception("patient id is wrong");
        }
        if (visitingInformationDetails.containsKey(patientId)) {
            visitingInformation = visitingInformationDetails.get(patientId);
            System.out.println("visits details:" + visitingInformation);
        }
    }

    public void displayPatientsForPatientsId(Map<Long, Patients> patientsMap, Long patientId) throws Exception {
        Patients patients;
        if (patientsMap.isEmpty()) {
            throw new Exception("patient detail is not");
        }
        if (patientId == null && patientId == 0) {
            throw new Exception("patient id is wrong");
        }
        if (patientsMap.containsKey(patientId)) {
            patients = patientsMap.get(patientId);
            System.out.println("Patients Id is :" + patients.getPatientId());
        }
      /*  Iterator<Long> iterator = patientsMap.keySet().iterator();
        while (iterator.hasNext()) {
            patients = patientsMap.get(iterator.next());
            if (patients.getPatientId() == patientId) {
                System.out.println("List of patient ID :" + patients.getPatientId());
                if (patients.getPatientName().equals(patientsMap)) {
                    System.out.println("List of patient Name" + patients.getPatientName());
                }
            }
        }*/
    }

    public void displayPatientsForDoctorId(Map<Long, Appointment> appointmentMap, Long doctorId) throws Exception {
        Appointment appointment;
        if (appointmentMap.isEmpty()) {
            throw new Exception("Appointment is not there");
        }
        if (doctorId == null && doctorId == 0) {
            throw new Exception("Doctor id is not there");
        }
        if (appointmentMap.containsKey(doctorId)) {
            appointment = appointmentMap.get(doctorId);
            System.out.println("Doctor Id is :" + appointment);
        }
    }

    public void displayTheListOfPatientWhoNeedsTheFollowUpVisit(Map<Long, VisitingInformation> visitingInformationMap, Boolean followUpNeed) throws Exception {
        VisitingInformation visitingInformation;
        if (visitingInformationMap.isEmpty()) {
            throw new Exception("visiting details is not there");
        }
        if (followUpNeed == true) {
            throw new Exception("Not need to followUp");
        }
        if (visitingInformationMap.containsKey(followUpNeed.equals(true))) {
            visitingInformation = visitingInformationMap.get(followUpNeed.equals(true));
            System.out.println("Follow up need :" + visitingInformation);
        }
    }

    public void displayInPatientDetails(Map<Long, InPatient> inPatientMap) throws Exception {
        InPatient inPatient = null;
        if (inPatientMap.isEmpty()) {
            throw new Exception("Inpatient is not there");
        }
        if (inPatientMap.containsKey(inPatient)) {
            inPatientMap.get(inPatient.getIpIdentificationNumber());
            System.out.println("In Patient Details :" + inPatient.getPatients());
        }
    }

    public void displayOutPatientDetails(Map<Long, Patients> patientsMap) throws Exception {
        Patients patients = new Patients();
        if (patientsMap.isEmpty()) {
            throw new Exception("outpatient is not there ");
        }
        if (patientsMap.containsKey(patients)) {
            patientsMap.get(patients.getPatientId());
            patientsMap.get(patients.getPatientType().equals("OutPatient"));
            System.out.println("OutPatient details :" + patients);
        }
    }

}



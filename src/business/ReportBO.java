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

    public void displayPatientDetails(Map<Long, Patients> patientsMap, Long patientId ,String patientsName) throws Exception {
        if (patientId == null && patientId == 0) {
            throw new Exception("patientId is not there");
        }
        if (patientsName == null) {
            throw  new Exception("Patient name is not there");
        }
        Patients patients;
        if (!patientsMap.isEmpty() && patientsMap.containsKey(patientId)) {
            patients = patientsMap.get(patientId);
            System.out.println("Patients details :" + patients);
        } else {
            System.out.println("Patient is not available");
        }
    }
    public void displayListOfVisitForPatientId(Map<Long, VisitingInformation> visitingInformationDetails, Long patientId) throws Exception {
        if (patientId == null && patientId == 0) {
            throw new Exception("patient id is wrong");
        }
        VisitingInformation visitingInformation;
        if (!visitingInformationDetails.isEmpty() && visitingInformationDetails.containsKey(patientId)) {
            visitingInformation = visitingInformationDetails.get(patientId);
            System.out.println("visits details:" + visitingInformation);
        } else {
            System.out.println("visiting details is not available");
        }
    }
    public void displayPatientsForPatientsId(Map<Long, Patients> patientsMap, Long patientId) throws Exception {
        if (patientId == null && patientId == 0) {
            throw new Exception("patient id is wrong");
        }
        Patients patients;
        if (!patientsMap.isEmpty() && patientsMap.containsKey(patientId)) {
            patients = patientsMap.get(patientId);
            System.out.println("Patients Id is :" + patients.getPatientId());
        } else {
            System.out.println("Patient Id is not available");
        }
    }
    public void displayPatientsForDoctorId(Map<Long, Appointment> appointmentMap, Long doctorId) throws Exception {
        if (doctorId == null && doctorId == 0) {
            throw new Exception("Doctor id is not there");
        }
        Appointment appointment;
        if (!appointmentMap.isEmpty() && appointmentMap.containsKey(doctorId)) {
            appointment = appointmentMap.get(doctorId);
            System.out.println("Doctor Id is :" + appointment.getDoctor());
        } else {
            System.out.println("Doctor Id is not available");
        }
    }
    public void displayOutPatientDetails(Map<Long, Patients> patientsMap)  {
        Patients patients;
          Iterator<Long> iterator = patientsMap.keySet().iterator();
        while (iterator.hasNext()) {
            patients = patientsMap.get(iterator.next());
            if (!patientsMap.isEmpty() && patientsMap.containsKey(patients.getPatientType().equals("op"))){
                System.out.println("Out patient details :" + patients);
            } else {
                System.out.println("outpatient is not available :");
            }
        }
    }
    public void displayInPatientDetails(Map<Long, InPatient> inPatientMap) {
        InPatient inPatients;
        Iterator<Long> iterator = inPatientMap.keySet().iterator();
        while (iterator.hasNext()) {
            inPatients = inPatientMap.get(iterator.next());
            if (!inPatientMap.isEmpty() && inPatientMap.containsKey(inPatients.getPatients().getPatientType().equals("Ip"))){
                System.out.println("In patient details :" + inPatients);
            } else {
                System.out.println("Inpatient is not available :");
            }
        }
    }
    public void displayTheListOfPatientWhoNeedsTheFollowUpVisit(Map<Long, VisitingInformation> visitingInformationMap, Boolean followUpNeed) throws Exception {
        if (followUpNeed) {
            throw new Exception("Not need to followUp");
        }
        VisitingInformation visitingInformation = null;
        if (!visitingInformationMap.isEmpty() && visitingInformationMap.containsKey(visitingInformation.getFollowUpNeed())) {
            visitingInformation = visitingInformationMap.get(visitingInformation.getFollowUpNeed());
            System.out.println("Follow up need :" + visitingInformation);
        } else {
            System.out.println("visiting details is not");
        }
    }


}



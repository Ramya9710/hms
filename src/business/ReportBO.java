package business;

import initialprocess.Appointment;
import initialprocess.InPatient;
import initialprocess.Patients;
import initialprocess.VisitingInformation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public void displayPatientDetails(Map<Long, Patients> patientsMap, Long patientId, String patientsName) throws Exception {
        System.out.println(".........Display  patient details for the patient name/id..........");
        if (patientId == null && patientId == 0) {
            throw new Exception("patientId is not there");
        }
        if (patientsName == null) {
            throw new Exception("Patient name is not there");
        }
        Patients patients;
        if (!patientsMap.isEmpty() && patientsMap.containsKey(patientId)) {
            patientsMap.get(patientId);
            System.out.println("Patients details :" + patientsMap);
            System.out.println("patient name :" + patientsName);
            System.out.println("patient Id is :" + patientId);
            Iterator<Long> patientItr = patientsMap.keySet().iterator();
            while (patientItr.hasNext()) {
                patients = patientsMap.get(patientItr.next());
                if (patients.getPatientName().equals(patientsName)) {
                    return;
                }
            }
        }

    }
    public void displayListOfVisitForPatientId(Map<Long, VisitingInformation> visitingInformationDetails, Long patientId) throws Exception {
        System.out.println("........Display the list of visit for the patient id.........");
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
        System.out.println("......... Display the list of patients Id.........");
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
        System.out.println("..........Display the list of patient by doctor id..........");
        if (doctorId == null && doctorId == 0) {
            throw new Exception("Doctor id is not there");
        }
        Appointment appointment;
        if (!appointmentMap.isEmpty() && appointmentMap.containsKey(doctorId)) {
            appointment = appointmentMap.get(doctorId);
            System.out.println("Doctor detail is :" + appointment.getDoctor());
            System.out.println("Doctor ID is:" + doctorId);
        } else {
            System.out.println("Doctor Id is not available");
        }
    }

    public void displayOutPatientDetails(Map<Long, Patients> patientsMap) throws Exception {
        System.out.println("..........Display only the out-patient..........");
        if (patientsMap.isEmpty()) {
            throw new Exception("patient detail is not available");
        }
        Patients patients;
        Iterator<Long> iterator = patientsMap.keySet().iterator();
        while (iterator.hasNext()) {
            patients = patientsMap.get(iterator.next());
            if (patients.getPatientType().equals("op")) {
                System.out.println("Out patient details :" + patients);
            } else {
                System.out.println("outpatient is not available");
            }
        }
    }

    public void displayInPatientDetails(Map<Long ,Patients> patientsMap) throws Exception {
        System.out.println("..........Display all patient who are in-patient..........");
        if (patientsMap.isEmpty()){
            throw new Exception("In Patient is not available");
        }
        Patients patients;
        Iterator<Long> patientItr = patientsMap.keySet().iterator();
        while (patientItr.hasNext()) {
            patients = patientsMap.get(patientItr.next());
            if (patients.getPatientType().equals("IP")) {
                System.out.println("patient name :" + patients);
            } else {
                System.out.println("Inpatient is not available :");
            }
        }
    }

    public void displayTheListOfPatientWhoNeedsTheFollowUpVisit(Map<Long, VisitingInformation> visitingInformationMap) {
        System.out.println(".........Display the list of patient who needs the followup visit.........");
        Iterator<Long> itr = visitingInformationMap.keySet().iterator();
        while (itr.hasNext()) {
            VisitingInformation followUpNeed = visitingInformationMap.get(itr.next());
            if (!visitingInformationMap.isEmpty() == followUpNeed.getFollowUpNeed()) {
                visitingInformationMap.get(followUpNeed);
                System.out.println("patients follow up need details :" + followUpNeed);
            } else {
                System.out.println("patients follow up need not required");
            }
        }
    }

    public void displayTodayVisitedPatientDetails(Map<Long,VisitingInformation> visitingInformationMap,Map<Long,Appointment> appointmentMap) throws ParseException {
        System.out.println(".........Display the today’s visited patient..........");
        Appointment appointment = null;
        VisitingInformation visitingInformation = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Iterator<Long> iterator = visitingInformationMap.keySet().iterator();
        String sDate = "31/01/2021";
        while (iterator.hasNext()) {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
            if(date.equals(date)) {
                System.out.println(visitingInformation.getVisitId());
            }
        }
       Iterator<Long> iterator1 = appointmentMap.keySet().iterator();
        while (iterator1.hasNext()) {
            Date date1 = new SimpleDateFormat("dd/mm/yyyy").parse(simpleDateFormat.format(DateFormat.getDateInstance()));
            if (date1.equals(date1)) {
                System.out.println(appointment.getPatients());
            }
        }
    }


}



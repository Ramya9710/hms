package business;

import initialprocess.Appointment;
import initialprocess.Medicine;
import initialprocess.Patients;
import initialprocess.VisitingInformation;
import utility.FindLatestNumberUtil;

import java.util.*;

public class VisitingInformationBO {

    public void createVisitingInformation(Long appointmentId, Map<Long, Appointment> appointments,
                                          List<Medicine> medicineList, String doctorRecommendation, Boolean followUpNeed,
                                          Map<Long, VisitingInformation> visits, Map<Long, Patients> patientsDetails) {
        //visitingInformation created
        VisitingInformation visitingInformation = new VisitingInformation();
        visitingInformation.setVisitId(FindLatestNumberUtil.getLatestId(new ArrayList<>()));
        visitingInformation.setAppointment(appointments.get(appointmentId));
        visitingInformation.setListOfMedicine(medicineList);
        visitingInformation.setFollowUpNeed(followUpNeed);
        visitingInformation.setDoctorRecommendation(doctorRecommendation);

        Patients patients = null;
        Appointment appointment = null;
        if (appointments.containsKey(appointmentId)) {
            appointment = appointments.get(appointmentId);
            patients = appointment.getPatients();
        }


        //A patient has more than 3 visits update the patient type as InPatient.
        Boolean patientIsIP = isIpPatient(visits, patients.getPatientId());
        patientIsIP.equals(true);
        patientsDetails.put(patients.getPatientId(), patients);
        visits.put(visitingInformation.getVisitId(), visitingInformation);

    }

    public boolean isIpPatient(Map<Long, VisitingInformation> visits, Long patientID) {
        int noOfVisit = 0;
        VisitingInformation visitingInformation;
        Patients patients = new Patients();

        Iterator<Long> iterator = visits.keySet().iterator();
        while (iterator.hasNext()) {
            visitingInformation = visits.get(iterator.next());
            if (visitingInformation.getAppointment().getPatients().getPatientId() == patientID) {
                noOfVisit++;
            }
        }
        if (noOfVisit >= 3) {
            System.out.println(noOfVisit);
            patients.setPatientType("IP");
            System.out.println("The patient type is IP or OP:" + patients.getPatientType());
            return true;
        }
        return false;
    }

}




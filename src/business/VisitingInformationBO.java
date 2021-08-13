package business;

import separateobject.Appointment;
import separateobject.Medicine;
import separateobject.Patients;
import separateobject.VisitingInformation;

import java.util.*;

public class VisitingInformationBO {
    public static Long generateNewId(List<Long> VisitId) {
        Long visitNewId = 0l;
        Collections.sort(VisitId);
        visitNewId = VisitId.get(VisitId.size() - 1);
        visitNewId++;
        return visitNewId;
    }

    public void createVisitingInformation(Long appointmentId, Map<Long, Appointment> appointments,
                                          List<Medicine> medicineList, String doctorRecommendation, Boolean followUpNeed,
                                          Map<Long, VisitingInformation> visits, Map<Long, Patients> patientsDetails) {
        //visitingInformation created
        VisitingInformation visitingInformation = new VisitingInformation();
        Patients patients = new Patients();

        Appointment appointment = null;
        if (appointments.containsKey(appointmentId)) {
            appointment = appointments.get(appointmentId);
            patients = appointment.getPatients();
        }
        visitingInformation.setAppointment(appointments.get(appointmentId));
        visitingInformation.setVisitId(VisitingInformationBO.generateNewId(new ArrayList<>(visits.keySet())));
        visitingInformation.setListOfMedicine(medicineList);
        visitingInformation.setFollowUpNeed(followUpNeed);
        visitingInformation.setDoctorRecommendation(doctorRecommendation);

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




package MainReport;

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
                                          Map<Long, VisitingInformation> visitingInformationMap) {
        //visitingInformation created
        VisitingInformation visitingInformation = new VisitingInformation();
        visitingInformation.setAppointment(appointments.get(appointmentId));
        visitingInformation.setVisitId(VisitingInformationBO.generateNewId(new ArrayList<>(visitingInformationMap.keySet())));
        visitingInformation.setListOfMedicine(medicineList);
        visitingInformation.setFollowUpNeed(followUpNeed);
        visitingInformation.setDoctorRecommendation(doctorRecommendation);

        Appointment appointment = appointments.get(appointmentId);
        Patients patients = appointment.getPatients();

        //A patient has more than 3 visits update the patient type as InPatient.
        boolean isInPatientLogic = isInPatientLogic(visitingInformationMap,patients.getPatientId());
            patients.put(patients.getPatientId(), patients);

        visitingInformationMap.put(visitingInformation.getVisitId(), visitingInformation);

    }

    private boolean isInPatientLogic(Map<Long, VisitingInformation> visits, Long patientID) {
        int noOfVisit = 0;

        VisitingInformation visitingInformation ;

        Iterator<Long> iterator = visits.keySet().iterator();
        while (iterator.hasNext()) {
            visitingInformation = visits.get(iterator.next());

            if (visitingInformation.getAppointment().getPatients().getPatientId() == patientID) {
                noOfVisit++;
                if (noOfVisit >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
}




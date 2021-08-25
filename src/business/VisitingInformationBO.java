package business;

import initialprocess.Appointment;
import initialprocess.Medicine;
import initialprocess.Patients;
import initialprocess.VisitingInformation;
import utility.FindLatestNumberUtil;

import java.util.*;

public class VisitingInformationBO {
    public VisitingInformation createVisit(Map<Long, VisitingInformation> visitingInformationMap,
                                           Appointment appointment, List<Medicine> medicineList) {

        VisitingInformation visitingInformation = new VisitingInformation();
        visitingInformation.setVisitId(FindLatestNumberUtil.getLatestId(new ArrayList<>(visitingInformationMap.keySet())));
        visitingInformation.setFollowUpNeed(true);
        visitingInformation.setDoctorRecommendation("Take Rest");
        visitingInformation.setListOfMedicine(medicineList);
        visitingInformation.setAppointment(appointment);
        visitingInformationMap.put(visitingInformation.getVisitId(), visitingInformation);
        System.out.println(visitingInformation);
        boolean patientIsIp = isIpPatient(visitingInformationMap, appointment.getPatients().getPatientId());
        if (patientIsIp) {
            appointment.getPatients().setPatientType("Inpatient");
            //patientsMap.put(appointment.getPatients().getPatientId(), appointment.getPatients());
        }
        visitingInformationMap.put(visitingInformation.getVisitId(), visitingInformation);
        return visitingInformation;
    }

    public boolean isIpPatient(Map<Long, VisitingInformation> visitingInformationMap, Long patientId) {
        int noOfVisit = 0;
        VisitingInformation visitingInformation;
        Iterator<Long> iterator = visitingInformationMap.keySet().iterator();
        while (iterator.hasNext()) {
            visitingInformation = visitingInformationMap.get(iterator.next());
            if (visitingInformation.getAppointment().getPatients().getPatientId() == patientId) {
                noOfVisit++;
                break;
            }
        }
        if (noOfVisit >= 3) {
            return true;
        }
        return false;
    }

}




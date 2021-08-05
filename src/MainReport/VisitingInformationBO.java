package MainReport;

import separateobject.Appointment;
import separateobject.Medicine;
import separateobject.VisitingInformation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class VisitingInformationBO {
    public static Long generateNewId(List<Long> VisitId) {
        Long visitNewId = 0l;
        Collections.sort(VisitId);
        visitNewId = VisitId.get(VisitId.size() - 1);
        visitNewId++;
        return visitNewId;
    }

    public void createVisitingInformationBO(Long appointmentId, Map<Long, Appointment> appointments,
                                            List<Medicine> medicineList, String doctorRecommendation, Boolean followUpNeed,
                                            Map<Long, VisitingInformation> visitingInformationMap) {
        //visitingInformation created
        VisitingInformation visitingInformation = new VisitingInformation();
        visitingInformation.setAppointment(appointments.get(appointmentId));
        visitingInformation.setVisitId(generateNewId(new ArrayList<>(visitingInformationMap.keySet())));
        visitingInformation.setListOfMedicine(medicineList);
        visitingInformation.setFollowUpNeed(true);
    }
}

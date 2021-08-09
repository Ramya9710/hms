package MainReport;

import separateobject.Bed;
import separateobject.Patients;

import java.util.Collections;
import java.util.List;

public class BedObject {
    public static Long generateNewId(List<Long> BedId) {
        Long bedNewId = 0l;
        Collections.sort(BedId);
        bedNewId = BedId.get(BedId.size() - 1);
        bedNewId++;
        return bedNewId;
    }

    public void creteBedFacility(Bed bedMap, Long BedId) {
        Bed bed = new Bed();
        bed.setRoomName("A");
        bed.setBedType("Special Bed");
        bed.setBedId(1l);

        Patients patients = new Patients();
        patients.setPatientType("IP");

        if (patients.getPatientType() == bed.getBedType()) {
            System.out.println(bedMap);
        }



    }
}

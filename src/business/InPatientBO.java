package business;

import initialprocess.*;
import utility.FindLatestNumberUtil;

import java.util.*;

public class InPatientBO {

    public InPatient createIp(Patients patients, Map<Long, InPatient> inPatientMap, Map<Long, Bed> bedMap) {
        InPatient inPatient = new InPatient();
        try {
            inPatient.setPatients(patients);
            inPatient.setIpIdentificationNumber(FindLatestNumberUtil.getLatestId(new ArrayList<>(inPatientMap.keySet())));
            if (!bedMap.isEmpty() && bedMap.containsKey(1l)) {
                inPatient.setBed(bedMap.get(1l));
            } else {
                throw new Exception("the bed is not available for outpatient");
            }
            inPatientMap.put(patients.getPatientId(), inPatient);
            System.out.println(inPatient);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return inPatient;
    }

}



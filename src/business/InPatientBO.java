package business;

import initialprocess.*;
import utility.FindLatestNumberUtil;

import java.util.*;

public class InPatientBO {


    public InPatient createIp(Patients patients, Map<Long, InPatient> inPatientMap, Map<Long, Bed> bedMap) throws Exception {

        InPatientBO inPatientBO = new InPatientBO();

        if (patients == null) {
            throw new Exception("OutPatient is not available");
        }
        if (inPatientMap.isEmpty()) {
            throw new Exception("Inpatient is not available");
        }
        if (bedMap.isEmpty()) {
            throw new Exception("Bed is not available for the patients");
        }
       /* if (inPatientMap != null && inPatientMap.containsKey(patients.getPatientId())) {
            inPatientBO.getBed(1l,bedMap);
        } else {
            throw  new Exception("the patient is OP");
        }*/
        try {
            inPatientBO.allocateBedForIpPatients(inPatientMap, patients, bedMap);
            System.out.println(allocateBedForIpPatients(inPatientMap, patients, bedMap));
            System.out.println(inPatientBO);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
    public InPatient allocateBedForIpPatients(Map<Long, InPatient> inPatientMap, Patients patients,
                                              Map<Long, Bed> bedMap) throws Exception {
        InPatient inPatient = new InPatient();
        if (patients != null && patients.getPatientType().equals("InPatients"))
            if (patients.equals("InPatients")) {
                inPatient = null;
                inPatient.setBed(getBed(2l, bedMap));
                inPatient.setPatients(patients);
                inPatient.setIpIdentificationNumber(FindLatestNumberUtil.getLatestId(new ArrayList<>()));
                inPatientMap.put(inPatient.getIpIdentificationNumber(), inPatient);
            }
        return inPatient;
    }

    public Bed getBed(Long bedId, Map<Long, Bed> bedMap) throws Exception {
        Bed bed = null;
        if (bedMap.containsKey(bed.getBedId())) {
        }
        if (bedId != null && bedId == 0) {
            throw new Exception("Bed is not available for In Patient");
        }
        return bed;
    }

}



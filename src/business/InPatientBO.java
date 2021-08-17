package business;

import initialprocess.Bed;
import initialprocess.InPatient;
import initialprocess.Patients;
import utility.FindLatestNumberUtil;

import java.util.*;

public class InPatientBO {


    public InPatient createIp(Map<Long ,Patients> patientsMap, Map<Long, InPatient> inPatientMap, Map<Long, Bed> bedMap) throws Exception {
        InPatientBO inPatientBO = new InPatientBO();
        Patients patients = new Patients();
        InPatient inPatient = inPatientBO.allocateBedForIpPatients(inPatientMap, patientsMap,bedMap,25l);
        inPatient.equals(true);
        inPatientMap.put(inPatient.getIpIdentificationNumber(), inPatient);

        if ( patientsMap == null && inPatientMap.isEmpty()) {
            throw new Exception("patient ID is not there");
        }
        if (inPatientMap.isEmpty()) {
            throw new Exception("patient is not available");
        }
        if (bedMap.isEmpty()) {
            throw new Exception("bed is not available");
        }
        return inPatient;
    }

    public InPatient allocateBedForIpPatients(Map<Long, InPatient> inPatientMap, Map<Long,Patients> patientsMap, Map<Long, Bed> bedMap, Long bedId) throws Exception {
        InPatient inPatient = new InPatient();

        if (patientsMap != null && patientsMap.equals("InPatients")) {
            inPatient = null;
            inPatient.setBed(inPatient.getBed());
            inPatient.setPatients(patientsMap.get(inPatient));
            inPatient.setIpIdentificationNumber(FindLatestNumberUtil.getLatestId(new ArrayList<>(inPatientMap.keySet())));
            inPatientMap.put(inPatient.getIpIdentificationNumber(), inPatient);
            Bed bed = null;
            if (bedMap.containsKey(bed.getBedId())) {
            }
            if (bedMap != null  && bedId == null && bedId == 0 && bedMap.isEmpty()) {
                throw new Exception("Bed is not available for In Patient");
            }
        }
        return inPatient;
    }


}


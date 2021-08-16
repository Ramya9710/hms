package business;

import initialprocess.Bed;
import initialprocess.InPatient;
import initialprocess.Patients;
import utility.FindLatestNumberUtil;

import java.util.*;

public class InPatientBO {

    public void createIp(Long patientId, Map<Long, Patients> patientsMap, Map<Long, Bed> bedMap, Long bedId,
                         Long ipIdentificationNumber, Map<Long, InPatient> inPatientMap) throws Exception {
        InPatient inPatientObject = new InPatient();
        inPatientObject.setBed(bedMap.get(bedId));
        inPatientObject.setPatients(patientsMap.get(patientId));
        inPatientObject.setIpIdentificationNumber(FindLatestNumberUtil.getLatestId(new ArrayList<>(bedMap.keySet())));

        if (patientId == null && patientsMap.containsKey(patientId)) {
            throw new Exception("patient is op");
        }
        if (bedId == null && patientsMap.containsKey(bedId)) {
            throw new Exception("no need of bed");
        }
        if (ipIdentificationNumber == null && patientsMap.containsKey(ipIdentificationNumber)) {
            throw new Exception("");
        }
        if (inPatientMap == null && patientsMap.isEmpty()) {
            throw new Exception("");
        }
        bedMap.put(inPatientObject.getIpIdentificationNumber(), inPatientObject.getBed());
    }
}


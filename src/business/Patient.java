package business;

import separateobject.Bed;
import separateobject.IpObject;
import separateobject.Patients;

import java.util.*;

public class Patient {

    private Long ipIdentificationNumber;
    private Map<Long, Bed> bedMap;
    private Bed Bed;
    private Bed IpObject;

    public Patient() {
    }

    public static Long generateNewId(List<Long> BedId) {
        Long bedNewId = 0l;
        Collections.sort(BedId);
        bedNewId = BedId.get(BedId.size() - 1);
        bedNewId++;
        return bedNewId;
    }

    public Bed createIp(Long patientId, Map<Long, Patients> patientsMap, Map<Long, Bed> bedMap, Long BedId,
                        Long ipIdentificationNumber) {
        IpObject ipObject = new IpObject();
        ipObject.setBed(bedMap.get(BedId));
        ipObject.setPatients(patientsMap.get(patientId));
        ipObject.setIpIdentificationNumber(1l);

        if (patientsMap != null && patientsMap.containsKey(patientId)) {
            ipObject.setPatients(patientsMap.get(patientId));
        } else {
            patientsMap.put(patientId, patientsMap.get(patientId));
        }
        ipObject.setPatients(patientsMap.get(patientId));
        ipObject.setIpIdentificationNumber(1l);
        ipObject.setPatients(patientsMap.get(BedId));
        ipObject.setPatients(patientsMap.get(ipIdentificationNumber));

        bedMap.put(ipObject.getIpIdentificationNumber(), ipObject.getBed());

        Iterator<Long> itr = bedMap.keySet().iterator();
        Long bedNewId = 0l;
        IpObject ipObject1 = new IpObject();

        while (itr.hasNext()) {
            bedNewId = itr.next();
            IpObject = bedMap.get(bedNewId);
            if (ipObject1.getIpIdentificationNumber() != null && ipObject.getPatients().getPatientType() == Bed.getBedType()) {
                ipObject1.setBed(bedMap.get(bedNewId));
                System.out.println("the patient is OP");
            } else {
                ipObject.setBed(bedMap.get(bedNewId));
                System.out.println("the patient is IP");
            }
        }
        return IpObject;
    }
}
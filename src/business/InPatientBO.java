package business;

import initialprocess.Bed;
import initialprocess.InPatient;
import initialprocess.Patients;

import java.util.*;

public class InPatientBO {

    private Long ipIdentificationNumber;
    private Map<Long, Bed> bedMap;
    private Bed Bed;
    private Bed IpObject;

    public InPatientBO() {
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
        InPatient inPatientObject = new InPatient();
        inPatientObject.setBed(bedMap.get(BedId));
        inPatientObject.setPatients(patientsMap.get(patientId));
        inPatientObject.setIpIdentificationNumber(1l);

        if (patientsMap != null && patientsMap.containsKey(patientId)) {
            inPatientObject.setPatients(patientsMap.get(patientId));
        } else {
            patientsMap.put(patientId, patientsMap.get(patientId));
        }
        inPatientObject.setPatients(patientsMap.get(patientId));
        inPatientObject.setIpIdentificationNumber(1l);
        inPatientObject.setPatients(patientsMap.get(BedId));
        inPatientObject.setPatients(patientsMap.get(ipIdentificationNumber));

        bedMap.put(inPatientObject.getIpIdentificationNumber(), inPatientObject.getBed());

        Iterator<Long> itr = bedMap.keySet().iterator();
        Long bedNewId = 0l;
        InPatient inPatientObject1 = new InPatient();

        while (itr.hasNext()) {
            bedNewId = itr.next();
            IpObject = bedMap.get(bedNewId);
            if (inPatientObject1.getIpIdentificationNumber() != null && inPatientObject.getPatients().getPatientType() == Bed.getBedType()) {
                inPatientObject1.setBed(bedMap.get(bedNewId));
                System.out.println("the patient is OP");
            } else {
                inPatientObject.setBed(bedMap.get(bedNewId));
                System.out.println("the patient is IP");
            }
        }
        return IpObject;
    }
}
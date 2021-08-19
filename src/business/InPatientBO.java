package business;

import initialprocess.*;
import utility.FindLatestNumberUtil;

import java.util.*;

public class InPatientBO {


    public InPatient createIp(Patients patients, Map<Long, InPatient> inPatientMap, Map<Long, Bed> bedMap, Long bedId) throws Exception {

        InPatient inPatient = new InPatient();
        if (patients == null) {
            throw new Exception("OutPatient is not available");
        }
        try {
            inPatient.setPatients(patients);
            inPatient.setIpIdentificationNumber(FindLatestNumberUtil.getLatestId(new ArrayList<>()));
            if (!inPatientMap.isEmpty() && inPatientMap.containsKey(patients.getPatientType())) {
                inPatient.setPatients(allocateBedForIpPatients(patients, bedMap));
            } else {
                throw new Exception("Inpatient is not available");
            }
            if (!bedMap.isEmpty() && bedMap.containsKey(inPatient.getBed())) {
                inPatient.setBed(getBed(1l,bedMap));
            } else {
                throw new Exception("the bed is not available");
            }
            inPatient.setPatients(allocateBedForIpPatients(patients, bedMap));
            inPatientMap.put(inPatient.getIpIdentificationNumber(), inPatient);
            System.out.println(inPatient);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Patients allocateBedForIpPatients(Patients patients, Map<Long, Bed> bedMap) throws Exception {
        if (bedMap.isEmpty()) {
            throw new Exception("bed details is empty");
        }
        InPatient inPatient = null;
        if (patients != null && patients.getPatientType().equals("InPatients"))
            if (patients.equals(inPatient.getPatients())) {
                //inPatient.setBed(bedMap.get(bedId));
               /* inPatient.setBed(getBed(2l, bedMap));
                inPatient.setPatients(patients);
                inPatient.setIpIdentificationNumber(FindLatestNumberUtil.getLatestId(new ArrayList<>()));*/

            }
        return patients;
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



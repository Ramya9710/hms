package business;

import initialprocess.Doctor;
import initialprocess.Patients;
import utility.FindLatestNumberUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class CommonBO {
    protected Patients createPatient(Map<Long, Patients> patientsMap) {
        Patients patients = new Patients();
        patients.setPatientName("Joy");
        patients.setPatientId(FindLatestNumberUtil.getLatestId(new ArrayList<>(patientsMap.keySet())));
        patients.setPatientAddress("chennai");
        patients.setDate_of_birth(new Date());
        patients.setPatientPhoneNumber("9854512120");
        patients.setPatientType("In Patient");
        patientsMap.put(patients.getPatientId(), patients);
        return patients;
    }

    protected Doctor createDoctor(Map<Long, Doctor> doctorMap) {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(FindLatestNumberUtil.getLatestId(new ArrayList<>()));
        doctor.setDoctorName("Dr.Bala");
        doctor.setDoctorSpecialisation("General doctor");
        doctorMap.put(doctor.getDoctorId(),doctor);
        return doctor;
    }
}

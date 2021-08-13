package business;

import initialprocess.Appointment;
import initialprocess.Doctor;
import initialprocess.Patients;
import utility.FindLatestNumberUtil;

import java.util.*;

public class AppointmentBO {

    public Appointment createAppointment(Long patientId, Map<Long, Patients> patientsMap,
                                         Map<Long, Appointment> appointmentMap,
                                         String purposeOfVisit, Long doctorId, Map<Long, Doctor> doctorMap) {

        Appointment appointment = new Appointment();
        appointment.setPurposeOfVisit(purposeOfVisit);
        appointment.setAppointmentId(FindLatestNumberUtil.getLatestId(new ArrayList<>(appointmentMap.keySet())));
        appointment.setDateOfVisit(new Date());
        if (doctorMap != null && doctorMap.containsKey(doctorId)) {
            appointment.setDoctor(doctorMap.get(doctorId));
        } else
            appointment.setDoctor(createDoctor(doctorMap));
        if (patientsMap != null && patientsMap.containsKey(patientId)) {
            appointment.setPatients(patientsMap.get(patientId));
        } else
            appointment.setPatients(createPatient(patientsMap));
        appointmentMap.put(appointment.getAppointmentId(), appointment);
        appointment.setFirstVisit(verifyPatientAlreadyVisited(appointmentMap, patientId));
        return appointment;
    }

    private boolean verifyPatientAlreadyVisited(Map<Long, Appointment> appointmentMap, Long patientId) {
        Iterator<Long> appointMap = appointmentMap.keySet().iterator();
        while (appointMap.hasNext()) {
            Appointment appointment = appointmentMap.get(appointMap.next());
            if (appointment.getPatients() != null && appointment.getPatients().getPatientId() == patientId) {
                return false;
            }
        }
        return true;
    }
    private Patients createPatient(Map<Long, Patients> patientsMap) {
        Patients patients = new Patients();
        patients.setPatientName("Joy");
        patients.setPatientId(FindLatestNumberUtil.getLatestId(new ArrayList<>(patientsMap.keySet())));
        patients.setPatientAddress("chennai");
        patients.setDate_of_birth(new Date());
        patients.setPatientPhoneNumber("9854512120");
        patients.setPatientType("IP");
        patientsMap.put(patients.getPatientId(), patients);
        return patients;
    }

    private Doctor createDoctor(Map<Long, Doctor> doctorMap) {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(FindLatestNumberUtil.getLatestId(new ArrayList<>()));
        doctor.setDoctorName("Dr.Bala");
        doctor.setDoctorSpecialisation("General doctor");
        doctorMap.put(doctor.getDoctorId(),doctor);
        return doctor;
    }
}



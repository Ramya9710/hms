package business;

import separateobject.Appointment;
import separateobject.Doctor;
import separateobject.Patients;
import utility.FindLatestNumberUtil;

import java.util.*;

public class AppointmentBO {

    public Appointment createAppointment(Long patientId, Map<Long, Patients> patientsMap,
                                         Map<Long, separateobject.Appointment> appointmentMap,
                                         String purposeOfVisit, Long doctorId, Map<Long, Doctor> doctorMap) {

        Appointment appointment = new Appointment();
        appointment.setPatients(createAppointment(patientId, patientsMap));
        appointment.setDoctor(doctorMap.get(doctorId));
        appointment.setPurposeOfVisit(purposeOfVisit);
        appointment.setAppointmentId(FindLatestNumberUtil.getLatestId(new ArrayList<>(appointmentMap.keySet())));
        appointment.setFirstVisit(true);
        appointment.setDateOfVisit(new Date());
        if (patientsMap != null && patientsMap.containsKey(patientId)) {
            appointment.setPatients(patientsMap.get(patientId));
        } else
            patientsMap.put(patientId, createAppointment(patientId,patientsMap));

        appointmentMap.put(appointment.getAppointmentId(), appointment);

        Iterator<Long> appointMap = appointmentMap.keySet().iterator();
        while (appointMap.hasNext()) {
            if (appointment.getPatients() != null && appointment.getPatients().getPatientId() == patientId) {
                appointment.setFirstVisit(false);
                break;
            } else {
                appointment.setFirstVisit(true);
            }
        }
        return appointment;
    }

    private Patients createAppointment(Long patientId ,Map<Long ,Patients> patientsMap) {
        Patients patients =new Patients();
        patients.setPatientName("Durga");
        patients.setPatientId(patientId);
        patients.setPatientAddress("chennai");
        patients.setDate_of_birth(new Date());
        patients.setPatientPhoneNumber("9854512120");
        patients.setPatientType("IP");
        return patients;
    }


}



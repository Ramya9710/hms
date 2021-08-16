package business;

import initialprocess.Appointment;
import initialprocess.Doctor;
import initialprocess.Patients;
import utility.FindLatestNumberUtil;

import java.util.*;

public class AppointmentBO extends CommonBO {

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

}



package MainReport;

import separateobject.Appointment;
import separateobject.Doctor;
import separateobject.Patients;

import java.util.*;

public class AppointmentBusinessObject {

    public static Long generateNewId(List<Long> appointmentID) {
        Long appointmentNewId = 0l;
        Collections.sort(appointmentID);
        appointmentNewId = appointmentID.get(appointmentID.size() - 1);
        appointmentNewId++;
        return appointmentNewId;
    }

    public Appointment createAppointment(Long patientId, Map<Long, Patients> patientsMap,
                                     Map<Long, Appointment> appointmentMap,
                                     String purposeOfVisit, Long doctorId, Map<Long, Doctor> doctorMap) {

        Appointment appointmentNew = new Appointment();
        appointmentNew.setPatients(patientsMap.get(patientId));
        appointmentNew.setDoctor(doctorMap.get(doctorId));
        appointmentNew.setPurposeOfVisit(purposeOfVisit);
        appointmentNew.setAppointmentId(generateNewId(new ArrayList<>(appointmentMap.keySet())));

        appointmentMap.put(appointmentNew.getAppointmentId(), appointmentNew);

        Iterator<Long> itr = appointmentMap.keySet().iterator();
        Long appointmentNewId = 0l;
        Appointment appointment ;


        while (itr.hasNext()) {
            appointmentNewId = itr.next();
            appointment = appointmentMap.get(appointmentNewId);

            if (appointment.getPatients() != null && appointment.getPatients().getPatientId() == patientId) {
                appointment.setFirstVisit(false);
            } else {
                appointmentNew.setFirstVisit(true);
            }
        }
        return appointmentNew;
    }


}



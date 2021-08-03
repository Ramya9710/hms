package MainReport;

import separateobject.Appointment;
import separateobject.Doctor;
import separateobject.Patients;

import java.util.Map;

public class AppointmentBusinessObject {
    public void createAppointment(Map<Long, Appointment> appointmentMap, Map<Long, Patients> patientsMap, Map<Long, Doctor> doctorMap) {
        for (Map.Entry<Long, Appointment> entry : appointmentMap.entrySet()) ;
    }
}

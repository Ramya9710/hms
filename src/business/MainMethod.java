package business;

import initialprocess.Appointment;
import initialprocess.VisitingInformation;

import static business.AllDetails.*;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("========================Hospital Management System==========================");
        System.out.println("Hospital Details :" + hospitalDetails);
        populateVisitingInformation();
        Appointment appointment = createAppointment();
        VisitingInformation visitingInformation = createVisitingInformation(appointment);
        createInPatientInformation(visitingInformation);
        System.out.println("==========================Hospital Management All Details Report==========================");
        allReport();

        /*   AppointmentBO appointmentBO = new AppointmentBO();
        VisitingInformationBO visitingInformationBO = new VisitingInformationBO();
        InPatientBO inPatientBO = new InPatientBO();
        VisitingInformation visitingInformation = null;
        System.out.println("========================Hospital Management System==========================");
        System.out.println("Hospital Details :" + hospitalDetails);
        Appointment appointment = appointmentBO.createAppointment(2l, patientsDetails, appointmentDetails,
                " headache ", 2l, doctorDetails);
        if (appointment != null) {
            visitingInformation = visitingInformationBO.createVisit(visitingInformationDetails,
                    appointment, medicineList);
        }
        if (visitingInformation.getAppointment().getPatients() != null && visitingInformation.getAppointment().getPatients().getPatientType() != null && visitingInformation.getAppointment().getPatients().getPatientType().equals(PatientType.INPATIENT.getType())) {
            inPatientBO.createIp(visitingInformation.getAppointment().getPatients(), inPatientDetails, bedMap);
        }*/
    }
}

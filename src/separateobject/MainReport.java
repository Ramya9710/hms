package separateobject;

import java.util.*;


public class MainReport {

    private static Map<Long, Hospital> hospitalDetails;
    private static Hospital hospital;

    private static Map<Long, Doctor> doctorDetails;
    private static Doctor neurologistDoctor;
    private static Doctor psychiatrist;
    private static Doctor cardiologist;

    private static Map<Long, Patients> patientsDetails;
    private static Patients patientsRose;
    private static Patients patientsLily;
    private static Patients patientsTommy;

    private static Map<Long,Appointment> appointmentDetails;
    private static Appointment appointment1;
    private static Appointment appointment2;
    private static Appointment appointment3;

    private static Map<Long,Medicine> medicineDetails;
    private static Medicine medicine;

    static {

        Hospital hospital = new Hospital();
        hospital.setHospitalName("Apollo");
        hospital.setHospitalId(8888881l);
        hospital.setHospitalLocation("Chennai");

        hospitalDetails = new HashMap<>();
        hospitalDetails.put(121251l, hospital);

        neurologistDoctor = new Doctor();
        neurologistDoctor.setDoctorId(01l);
        neurologistDoctor.setDoctorName(" Dr.Ronald roy ");
        neurologistDoctor.setDoctorSpecialisation(" Neurologist ");

        psychiatrist = new Doctor();
        psychiatrist.setDoctorId(02l);
        psychiatrist.setDoctorName(" Dr.Vijay Kumar ");
        psychiatrist.setDoctorSpecialisation(" Psychiatrist ");

        cardiologist = new Doctor();
        cardiologist.setDoctorId(03l);
        cardiologist.setDoctorName(" Dr.Rama Chandra ");
        cardiologist.setDoctorSpecialisation(" Cardiologist ");

        doctorDetails = new HashMap<>();
        doctorDetails.put(neurologistDoctor.getDoctorId(), neurologistDoctor);
        doctorDetails.put(psychiatrist.getDoctorId(), psychiatrist);
        doctorDetails.put(cardiologist.getDoctorId(), cardiologist);

        patientsRose = new Patients();
        patientsRose.setPatientName("Rose");
        patientsRose.setDate_of_birth(new Date(1990, 12, 10));
        patientsRose.setPatientAddress("52A Main Road jkm");
        patientsRose.setPatientId(101l);
        patientsRose.setPatientPhoneNumber("9525264410");
        patientsRose.setPatientType(" out Patient ");

        patientsLily = new Patients();
        patientsLily.setPatientName("Lily");
        patientsLily.setDate_of_birth(new Date(1985, 05, 25));
        patientsLily.setPatientAddress("45A2 CrossRoad Ariyalur");
        patientsLily.setPatientId(102l);
        patientsLily.setPatientPhoneNumber("9585124512");
        patientsLily.setPatientName(" out Patient");

        patientsTommy = new Patients();
        patientsTommy.setPatientName("Tommy");
        patientsTommy.setDate_of_birth(new Date(1998, 05, 19));
        patientsTommy.setPatientAddress("25A3 near by bus stop  Perambalur");
        patientsTommy.setPatientId(103l);
        patientsTommy.setPatientPhoneNumber("9854561214");
        patientsTommy.setPatientType(" out patient");

        patientsDetails = new HashMap<>();
        patientsDetails.put(patientsRose.getPatientId(), patientsRose);
        patientsDetails.put(patientsLily.getPatientId(), patientsLily);
        patientsDetails.put(patientsTommy.getPatientId(), patientsTommy);


        appointment1 = new Appointment();
        appointment1.setAppointmentId(1l);
        appointment1.setDoctor(neurologistDoctor);
        appointment1.setPatients(patientsRose);
        appointment1.setFirstVisit(true);
        appointment1.setPurposeOfVisit("Headaches");
        appointment1.setBp(120.00);
        appointment1.setTemperature(36.01);
        appointment1.setDateOfVisit(new Date(2021,10,21));

        appointment2 = new Appointment();
        appointment2.setAppointmentId(2l);
        appointment2.setDoctor(psychiatrist);
        appointment2.setPatients(patientsLily);
        appointment2.setFirstVisit(true);
        appointment2.setPurposeOfVisit("Memory Loss");
        appointment2.setBp(115.00);
        appointment2.setTemperature(36.15);
        appointment2.setDateOfVisit(new Date(2021,8,2));

        appointment3 = new Appointment();
        appointment3.setAppointmentId(3l);
        appointment3.setDoctor(cardiologist);
        appointment3.setPatients(patientsTommy);
        appointment3.setFirstVisit(true);
        appointment3.setPurposeOfVisit("Chest Pain");
        appointment3.setBp(136.15);
        appointment3.setTemperature(37.12);
        appointment3.setDateOfVisit(new Date(2021,7,12));

        appointmentDetails = new HashMap<>();
        appointmentDetails.put(appointment1.getAppointmentId(),appointment1);
        appointmentDetails.put(appointment2.getAppointmentId(),appointment2);
        appointmentDetails.put(appointment3.getAppointmentId(),appointment3);





    }

}


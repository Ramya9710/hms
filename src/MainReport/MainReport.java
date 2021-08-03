package MainReport;

import separateobject.*;

import java.util.*;


public class MainReport {

    private static Map<Long, Hospital> hospitalDetails;
    private static Hospital hospital;

    private static Map<Long, Doctor> doctorDetails;
    private static Doctor neurologist;
    private static Doctor psychiatrist;
    private static Doctor cardiologist;

    private static Map<Long, Patients> patientsDetails;
    private static Patients patientsRose;
    private static Patients patientsLily;
    private static Patients patientsTommy;

    private static Map<Long, Appointment> appointmentDetails;
    private static Appointment appointmentOne;
    private static Appointment appointmentTwo;
    private static Appointment appointmentThree;
    private static Appointment appointmentFour;
    private static Appointment appointmentFive;
    private static Appointment appointmentSix;
    private static Appointment appointmentSeven;
    private static Appointment appointmentEight;
    private static Appointment appointmentNine;
    private static Appointment appointmentTen;

    private static Map<Long, Medicine> medicineDetails;
    private static Medicine neurologistMedicine;
    private static Medicine psychiatristMedicine;
    private static Medicine cardiologistMedicine;

    private static Map<Long, VisitingInformation> visitingInformationDetails;
    private static VisitingInformation nervesCheckUp;
    private static VisitingInformation mentalCheckUp;
    private static VisitingInformation heartCheckUp;

    private static List<Medicine> medicineList;
    private static Medicine medicine;
    private static Object AppointmentBusinessObject;

    private Date date = new Date();

    static {

        Hospital hospital = new Hospital();
        hospital.setHospitalName("Apollo");
        hospital.setHospitalId(2525l);
        hospital.setHospitalLocation("Chennai");

        hospitalDetails = new HashMap<>();
        hospitalDetails.put(2525l, hospital);

        neurologist = new Doctor();
        neurologist.setDoctorId(01l);
        neurologist.setDoctorName(" Dr.Ronald roy ");
        neurologist.setDoctorSpecialisation(" Neurologist ");

        psychiatrist = new Doctor();
        psychiatrist.setDoctorId(02l);
        psychiatrist.setDoctorName(" Dr.Vijay Kumar ");
        psychiatrist.setDoctorSpecialisation(" Psychiatrist ");

        cardiologist = new Doctor();
        cardiologist.setDoctorId(03l);
        cardiologist.setDoctorName(" Dr.Rama Chandra ");
        cardiologist.setDoctorSpecialisation(" Cardiologist ");

        doctorDetails = new HashMap<>();
        doctorDetails.put(neurologist.getDoctorId(), neurologist);
        doctorDetails.put(psychiatrist.getDoctorId(), psychiatrist);
        doctorDetails.put(cardiologist.getDoctorId(), cardiologist);

        patientsRose = new Patients();
        patientsRose.setPatientName("Rose");
        patientsRose.setDate_of_birth(new Date(1990 / 12 / 10));
        patientsRose.setPatientAddress("Coimbatore");
        patientsRose.setPatientId(101l);
        patientsRose.setPatientPhoneNumber("9525264410");
        patientsRose.setPatientType(" out Patient ");

        patientsLily = new Patients();
        patientsLily.setPatientName("Lily");
        patientsLily.setDate_of_birth(new Date(1981 / 10 / 25));
        patientsLily.setPatientAddress("Chennai");
        patientsLily.setPatientId(102l);
        patientsLily.setPatientPhoneNumber("9585124512");
        patientsLily.setPatientName(" out Patient");

        patientsTommy = new Patients();
        patientsTommy.setPatientName("Tommy");
        patientsTommy.setDate_of_birth(new Date(1998 / 05 / 19));
        patientsTommy.setPatientAddress("Madurai");
        patientsTommy.setPatientId(103l);
        patientsTommy.setPatientPhoneNumber("9854561214");
        patientsTommy.setPatientType("out patient");

        patientsDetails = new HashMap<>();
        patientsDetails.put(patientsRose.getPatientId(), patientsRose);
        patientsDetails.put(patientsLily.getPatientId(), patientsLily);
        patientsDetails.put(patientsTommy.getPatientId(), patientsTommy);

        appointmentOne = new Appointment();
        appointmentOne.setAppointmentId(1l);
        appointmentOne.setDoctor(doctorDetails.get(1l));
        appointmentOne.setPatients(patientsDetails.get(1l));
        appointmentOne.setFirstVisit(true);
        appointmentOne.setPurposeOfVisit("Headaches");
        appointmentOne.setBp(120.00);
        appointmentOne.setTemperature(36.01);
        appointmentOne.setDateOfVisit(new Date(2021 / 10 / 11));

        appointmentTwo = new Appointment();
        appointmentTwo.setAppointmentId(2l);
        appointmentTwo.setDoctor(doctorDetails.get(2l));
        appointmentTwo.setPatients(patientsDetails.get(2l));
        appointmentTwo.setFirstVisit(true);
        appointmentTwo.setPurposeOfVisit("Memory Loss");
        appointmentTwo.setBp(115.00);
        appointmentTwo.setTemperature(36.15);
        appointmentTwo.setDateOfVisit(new Date(2021 / 01 / 06));

        appointmentThree = new Appointment();
        appointmentThree.setAppointmentId(3l);
        appointmentThree.setDoctor(doctorDetails.get(3l));
        appointmentThree.setPatients(patientsDetails.get(3l));
        appointmentThree.setFirstVisit(true);
        appointmentThree.setPurposeOfVisit("Chest Pain");
        appointmentThree.setBp(136.15);
        appointmentThree.setTemperature(37.2);
        appointmentThree.setDateOfVisit(new Date(2021 / 07 / 12));

        appointmentFour = new Appointment();
        appointmentFour.setAppointmentId(4l);
        appointmentFour.setDoctor(doctorDetails.get(1l));
        appointmentFour.setPatients(patientsDetails.get(1l));
        appointmentFour.setFirstVisit(false);
        appointmentFour.setPurposeOfVisit("Headaches");
        appointmentFour.setBp(110.00);
        appointmentFour.setTemperature(36.02);
        appointmentFour.setDateOfVisit(new Date(2021 / 10 / 18));

        appointmentFive = new Appointment();
        appointmentFive.setAppointmentId(5l);
        appointmentFive.setDoctor(doctorDetails.get(1l));
        appointmentFive.setPatients(patientsDetails.get(1l));
        appointmentFive.setFirstVisit(false);
        appointmentFive.setPurposeOfVisit("Headaches");
        appointmentFive.setBp(110.00);
        appointmentFive.setTemperature(36.01);
        appointmentFive.setDateOfVisit(new Date(2021 / 10 / 27));

        appointmentSix = new Appointment();
        appointmentSix.setAppointmentId(6l);
        appointmentSix.setDoctor(doctorDetails.get(1l));
        appointmentSix.setPatients(patientsDetails.get(1l));
        appointmentSix.setFirstVisit(false);
        appointmentSix.setPurposeOfVisit("Headaches");
        appointmentSix.setBp(120.00);
        appointmentSix.setTemperature(36.01);
        appointmentSix.setDateOfVisit(new Date(2021 / 11 / 7));

        appointmentSeven = new Appointment();
        appointmentSeven.setAppointmentId(7l);
        appointmentSeven.setDoctor(doctorDetails.get(2l));
        appointmentSeven.setPatients(patientsDetails.get(2l));
        appointmentSeven.setFirstVisit(false);
        appointmentSeven.setPurposeOfVisit("Memory Loss");
        appointmentSeven.setBp(125.00);
        appointmentSeven.setTemperature(36.05);
        appointmentSeven.setDateOfVisit(new Date(2021 / 01 / 12));

        appointmentEight = new Appointment();
        appointmentEight.setAppointmentId(8l);
        appointmentEight.setDoctor(doctorDetails.get(2l));
        appointmentEight.setPatients(patientsDetails.get(2l));
        appointmentEight.setFirstVisit(false);
        appointmentEight.setPurposeOfVisit("Memory Loss");
        appointmentEight.setBp(110.00);
        appointmentEight.setTemperature(36.15);
        appointmentSeven.setDateOfVisit(new Date(2021 / 01 / 18));

        appointmentNine = new Appointment();
        appointmentNine.setAppointmentId(9l);
        appointmentNine.setDoctor(doctorDetails.get(2l));
        appointmentNine.setPatients(patientsDetails.get(2l));
        appointmentNine.setFirstVisit(false);
        appointmentNine.setPurposeOfVisit("Memory Loss");
        appointmentNine.setBp(110.00);
        appointmentNine.setTemperature(36.15);
        appointmentNine.setDateOfVisit(new Date(2021 / 01 / 28));

        appointmentTen = new Appointment();
        appointmentTen.setAppointmentId(10l);
        appointmentTen.setDoctor(doctorDetails.get(3l));
        appointmentTen.setPatients(patientsDetails.get(3l));
        appointmentTen.setFirstVisit(false);
        appointmentTen.setPurposeOfVisit("Chest Pain");
        appointmentTen.setBp(136.15);
        appointmentTen.setTemperature(37.2);
        appointmentTen.setDateOfVisit(new Date(2021 / 07 / 25));


        appointmentDetails = new HashMap<>();
        appointmentDetails.put(appointmentOne.getAppointmentId(), appointmentOne);
        appointmentDetails.put(appointmentTwo.getAppointmentId(), appointmentTwo);
        appointmentDetails.put(appointmentThree.getAppointmentId(), appointmentThree);
        appointmentDetails.put(appointmentFour.getAppointmentId(), appointmentFour);
        appointmentDetails.put(appointmentFive.getAppointmentId(), appointmentFive);
        appointmentDetails.put(appointmentSix.getAppointmentId(), appointmentSix);
        appointmentDetails.put(appointmentSeven.getAppointmentId(), appointmentSeven);
        appointmentDetails.put(appointmentEight.getAppointmentId(), appointmentEight);
        appointmentDetails.put(appointmentNine.getAppointmentId(), appointmentThree);
        appointmentDetails.put(appointmentTen.getAppointmentId(), appointmentTen);

        neurologistMedicine = new Medicine();
        neurologistMedicine.setMedicineId(121l);
        neurologistMedicine.setPatchNumber("B.NO.1080053");
        neurologistMedicine.setExpiryDate(new Date(2023 / 04 / 01));
        neurologistMedicine.setPurposeOfMedicine("used to prevent disease");
        neurologistMedicine.setMedicineName("Beta 0.5mg");

        psychiatristMedicine = new Medicine();
        psychiatristMedicine.setMedicineId(122l);
        psychiatristMedicine.setPatchNumber("B.NO.1200052");
        psychiatristMedicine.setExpiryDate(new Date(2024 / 02 / 12));
        psychiatristMedicine.setPurposeOfMedicine("used to prevent illness");
        psychiatristMedicine.setMedicineName("Ativan 2mg");

        cardiologistMedicine = new Medicine();
        cardiologistMedicine.setMedicineId(123l);
        cardiologistMedicine.setPatchNumber("B.NO.1502514");
        cardiologistMedicine.setExpiryDate(new Date(2024 / 03 / 15));
        cardiologistMedicine.setPurposeOfMedicine("used to prevent the illness issues");
        cardiologistMedicine.setMedicineName(" Asprin 2mg");
        medicineDetails = new HashMap<>();
        medicineDetails.put(neurologistMedicine.getMedicineId(), neurologistMedicine);
        medicineDetails.put(psychiatristMedicine.getMedicineId(), psychiatristMedicine);
        medicineDetails.put(cardiologistMedicine.getMedicineId(), cardiologistMedicine);

    }

    public static List<Medicine> getMedicine() {
        medicineList = new ArrayList<>();
        Random random = new Random();
        int randomNumber;
        for (int i = 0; i < 3; i++) {
            randomNumber = (random.nextInt(5));
            if (medicineDetails.containsKey(randomNumber))
                medicineList.add(medicineDetails.get(randomNumber));
        }

        for (Map.Entry<Long, Medicine> entry : medicineDetails.entrySet()) {
            medicine = entry.getValue();
            medicineList.add(medicine);
        }
        return medicineList;
    }

    public static void populateVisitingInformation() {

        nervesCheckUp = new VisitingInformation();
        nervesCheckUp.setVisitId(01l);
        nervesCheckUp.setAppointment(appointmentDetails.get(1l));
        nervesCheckUp.setDoctorRecommendation("You facing stroke immediately visit again");
        nervesCheckUp.setFollowUpNeed(true);
        nervesCheckUp.setListOfMedicine(getMedicine());

        mentalCheckUp = new VisitingInformation();
        mentalCheckUp.setVisitId(02l);
        mentalCheckUp.setAppointment(appointmentDetails.get(2l));
        mentalCheckUp.setDoctorRecommendation("you losing sensory sills visit again take medicine regularly");
        mentalCheckUp.setFollowUpNeed(true);
        mentalCheckUp.setListOfMedicine(getMedicine());

        heartCheckUp = new VisitingInformation();
        heartCheckUp.setVisitId(03l);
        heartCheckUp.setAppointment(appointmentDetails.get(3l));
        heartCheckUp.setDoctorRecommendation("you facing continues pain again visit then check and test X-RAY");
        heartCheckUp.setFollowUpNeed(true);
        heartCheckUp.setListOfMedicine(getMedicine());

        visitingInformationDetails = new HashMap<>();
        visitingInformationDetails.put(nervesCheckUp.getVisitId(), nervesCheckUp);
        visitingInformationDetails.put(mentalCheckUp.getVisitId(), mentalCheckUp);
        visitingInformationDetails.put(heartCheckUp.getVisitId(), heartCheckUp);


    }

    public static void main(String[] args) {
        populateVisitingInformation();
        System.out.println(getMedicine());
        AppointmentBusinessObject businessObject = new AppointmentBusinessObject();
        businessObject.createAppointment(appointmentDetails, patientsDetails, doctorDetails);
        System.out.println(AppointmentBusinessObject);
    }
}

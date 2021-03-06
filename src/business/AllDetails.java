package business;

import initialprocess.*;
import utility.PatientDiseases;
import utility.PatientType;

import java.util.*;
public class AllDetails extends CommonBO {
    static Map<Long, Hospital> hospitalDetails;

    private static Map<Long, Doctor> doctorDetails;
  /* private static Doctor neurologist;
    private static Doctor psychiatrist;
    private static Doctor cardiologist;*/

    private static Map<Long, Patients> patientsDetails;
   /* private static Patients patientsRose;
    private static Patients patientsLily;
    private static Patients patientsTommy;*/

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

    private static Map<Long, Bed> bedMap;
    private static Bed bedNoOne;
    private static Bed bedNoTwo;
    private static Bed bedNoThree;

    private static Map<Long, InPatient> inPatientDetails;
    private static InPatient inPatientOne;
    private static InPatient inPatientTwo;
    private static InPatient inPatientThree;

    static {
        Hospital hospital = new Hospital();
        hospital.setHospitalName("Apollo");
        hospital.setHospitalId(101l);
        hospital.setHospitalLocation("Chennai");
        hospitalDetails = new HashMap<>();
        hospitalDetails.put(2525l, hospital);

        Doctor doctor = new Doctor();
        doctor.setDoctorId(1l);
        doctor.setDoctorName("Dr.Ronald roy");
        doctor.setDoctorSpecialisation("Neurologist");
        doctorDetails = new HashMap<>();
        doctorDetails.put(doctor.getDoctorId(), doctor);

        Doctor doctor1 = new Doctor();
        doctor1.setDoctorId(2l);
        doctor1.setDoctorName("Dr.Vijay Kumar");
        doctor1.setDoctorSpecialisation("Psychiatrist");
        doctorDetails = new HashMap<>();
        doctorDetails.put(doctor1.getDoctorId(), doctor1);

        Doctor doctor2 = new Doctor();
        doctor2.setDoctorId(3l);
        doctor2.setDoctorName("Dr.Rama Chandra");
        doctor2.setDoctorSpecialisation("Cardiologist");

        doctorDetails = new HashMap<>();
        doctorDetails.put(doctor2.getDoctorId(), doctor2);

        /*  neurologist = new Doctor();
        neurologist.setDoctorId(1l);
        neurologist.setDoctorName(" Dr.Ronald roy ");
        neurologist.setDoctorSpecialisation(" Neurologist ");

        psychiatrist = new Doctor();
        psychiatrist.setDoctorId(2l);
        psychiatrist.setDoctorName(" Dr.Vijay Kumar ");
        psychiatrist.setDoctorSpecialisation(" Psychiatrist ");

        cardiologist = new Doctor();
        cardiologist.setDoctorId(3l);
        cardiologist.setDoctorName(" Dr.Rama Chandra ");
        cardiologist.setDoctorSpecialisation(" Cardiologist ");

        doctorDetails = new HashMap<>();
        doctorDetails.put(neurologist.getDoctorId(), neurologist);
        doctorDetails.put(psychiatrist.getDoctorId(), psychiatrist);
        doctorDetails.put(cardiologist.getDoctorId(), cardiologist);*/

        Patients patients = new Patients();
        patients.setPatientName("Rose");
        patients.setDate_of_birth(new Date(1990 / 12 / 10));
        patients.setPatientAddress("Coimbatore");
        patients.setPatientId(1l);
        patients.setPatientPhoneNumber("9525264410");
        patients.setPatientType(PatientType.OUTPATIENT.getType());
        patientsDetails = new HashMap<>();
        patientsDetails.put(patients.getPatientId(), patients);

        Patients patients1 = new Patients();
        patients1.setPatientName("Lily");
        patients1.setDate_of_birth(new Date(1981 / 10 / 25));
        patients1.setPatientAddress("Chennai");
        patients1.setPatientId(2l);
        patients1.setPatientPhoneNumber("9585124512");
        patients1.setPatientType(PatientType.INPATIENT.getType());
        patientsDetails = new HashMap<>();
        patientsDetails.put(patients1.getPatientId(), patients1);

        Patients patients2 = new Patients();
        patients2.setPatientName("Tommy");
        patients2.setDate_of_birth(new Date(1998 / 05 / 19));
        patients2.setPatientAddress("Madurai");
        patients2.setPatientId(3l);
        patients2.setPatientPhoneNumber("9854561214");
        patients2.setPatientType(PatientType.OUTPATIENT.getType());
        patientsDetails = new HashMap<>();
        patientsDetails.put(patients2.getPatientId(), patients2);

        /*  patientsRose = new Patients();
        patientsRose.setPatientName("Rose");
        patientsRose.setDate_of_birth(new Date(1990 / 12 / 10));
        patientsRose.setPatientAddress("Coimbatore");
        patientsRose.setPatientId(1l);
        patientsRose.setPatientPhoneNumber("9525264410");
        patientsRose.setPatientType(PatientType.OUTPATIENT.getType());

        patientsLily = new Patients();
        patientsLily.setPatientName("Lily");
        patientsLily.setDate_of_birth(new Date(1981 / 10 / 25));
        patientsLily.setPatientAddress("Chennai");
        patientsLily.setPatientId(2l);
        patientsLily.setPatientPhoneNumber("9585124512");
        patientsLily.setPatientType(PatientType.INPATIENT.getType());

        patientsTommy = new Patients();
        patientsTommy.setPatientName("Tommy");
        patientsTommy.setDate_of_birth(new Date(1998 / 05 / 19));
        patientsTommy.setPatientAddress("Madurai");
        patientsTommy.setPatientId(3l);
        patientsTommy.setPatientPhoneNumber("9854561214");
        patientsTommy.setPatientType(PatientType.OUTPATIENT.getType());

        patientsDetails = new HashMap<>();
        patientsDetails.put(patientsRose.getPatientId(), patientsRose);
        patientsDetails.put(patientsLily.getPatientId(), patientsLily);
        patientsDetails.put(patientsTommy.getPatientId(), patientsTommy);
*/
        appointmentOne = new Appointment();
        appointmentOne.setAppointmentId(1l);
        appointmentOne.setDoctor(doctorDetails.get(1l));
        appointmentOne.setPatients(patientsDetails.get(1l));
        appointmentOne.setFirstVisit(false);
        appointmentOne.setPurposeOfVisit(PatientDiseases.PATIENT_DISEASES.getDiseases());
        appointmentOne.setBp(120.00);
        appointmentOne.setTemperature(36.01);
        appointmentOne.setDateOfVisit(getDateFormat("2021/09/13"));

        appointmentTwo = new Appointment();
        appointmentTwo.setAppointmentId(2l);
        appointmentTwo.setDoctor(doctorDetails.get(2l));
        appointmentTwo.setPatients(patientsDetails.get(2l));
        appointmentTwo.setFirstVisit(false);
        appointmentTwo.setPurposeOfVisit(PatientDiseases.PATIENT_DISEASES1.getDiseases());
        appointmentTwo.setBp(115.00);
        appointmentTwo.setTemperature(36.15);
        appointmentTwo.setDateOfVisit(getDateFormat("2021/04/03"));

        appointmentThree = new Appointment();
        appointmentThree.setAppointmentId(3l);
        appointmentThree.setDoctor(doctorDetails.get(3l));
        appointmentThree.setPatients(patientsDetails.get(3l));
        appointmentThree.setFirstVisit(true);
        appointmentThree.setPurposeOfVisit(PatientDiseases.PATIENT_DISEASES2.getDiseases());
        appointmentThree.setBp(136.15);
        appointmentThree.setTemperature(37.2);
        appointmentThree.setDateOfVisit(getDateFormat("2021/05/06"));

        appointmentFour = new Appointment();
        appointmentFour.setAppointmentId(4l);
        appointmentFour.setDoctor(doctorDetails.get(1l));
        appointmentFour.setPatients(patientsDetails.get(3l));
        appointmentFour.setFirstVisit(false);
        appointmentFour.setPurposeOfVisit(PatientDiseases.PATIENT_DISEASES.getDiseases());
        appointmentFour.setBp(110.00);
        appointmentFour.setTemperature(36.02);
        appointmentFour.setDateOfVisit(getDateFormat("2021/05/20"));

        appointmentFive = new Appointment();
        appointmentFive.setAppointmentId(5l);
        appointmentFive.setDoctor(doctorDetails.get(2l));
        appointmentFive.setPatients(patientsDetails.get(2l));
        appointmentFive.setFirstVisit(false);
        appointmentFive.setPurposeOfVisit(PatientDiseases.PATIENT_DISEASES1.getDiseases());
        appointmentFive.setBp(110.00);
        appointmentFive.setTemperature(36.01);
        appointmentFive.setDateOfVisit(getDateFormat("2021/07/08"));

        appointmentSix = new Appointment();
        appointmentSix.setAppointmentId(6l);
        appointmentSix.setDoctor(doctorDetails.get(1l));
        appointmentSix.setPatients(patientsDetails.get(3l));
        appointmentSix.setFirstVisit(false);
        appointmentSix.setPurposeOfVisit(PatientDiseases.PATIENT_DISEASES.getDiseases());
        appointmentSix.setBp(120.00);
        appointmentSix.setTemperature(36.01);
        appointmentSix.setDateOfVisit(getDateFormat("2021/04/06"));

        appointmentSeven = new Appointment();
        appointmentSeven.setAppointmentId(7l);
        appointmentSeven.setDoctor(doctorDetails.get(2l));
        appointmentSeven.setPatients(patientsDetails.get(2l));
        appointmentSeven.setFirstVisit(true);
        appointmentSeven.setPurposeOfVisit(PatientDiseases.PATIENT_DISEASES1.getDiseases());
        appointmentSeven.setBp(125.00);
        appointmentSeven.setTemperature(36.05);
        appointmentSeven.setDateOfVisit(new Date(2021 / 05 / 12));

        appointmentEight = new Appointment();
        appointmentEight.setAppointmentId(8l);
        appointmentEight.setDoctor(doctorDetails.get(2l));
        appointmentEight.setPatients(patientsDetails.get(2l));
        appointmentEight.setFirstVisit(false);
        appointmentEight.setPurposeOfVisit(PatientDiseases.PATIENT_DISEASES1.getDiseases());
        appointmentEight.setBp(110.00);
        appointmentEight.setTemperature(36.15);
        appointmentSeven.setDateOfVisit(new Date(2021 / 07 / 18));

        appointmentNine = new Appointment();
        appointmentNine.setAppointmentId(9l);
        appointmentNine.setDoctor(doctorDetails.get(3l));
        appointmentNine.setPatients(patientsDetails.get(3l));
        appointmentNine.setFirstVisit(false);
        appointmentNine.setPurposeOfVisit(PatientDiseases.PATIENT_DISEASES2.getDiseases());
        appointmentNine.setBp(110.00);
        appointmentNine.setTemperature(36.15);
        appointmentNine.setDateOfVisit(new Date(2021 / 03 / 28));

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

        bedNoOne = new Bed();
        bedNoOne.setBedId(1l);
        bedNoOne.setBedType("superBed");
        bedNoOne.setRoomName("specialWard");

        bedNoTwo = new Bed();
        bedNoTwo.setBedId(2l);
        bedNoTwo.setBedType("superBed");
        bedNoTwo.setRoomName("specialWard");

        bedNoThree = new Bed();
        bedNoThree.setBedId(3l);
        bedNoThree.setBedType("superBed");
        bedNoThree.setRoomName("specialWard");

        bedMap = new HashMap<>();
        bedMap.put(bedNoOne.getBedId(), bedNoOne);
        bedMap.put(bedNoTwo.getBedId(), bedNoTwo);
        bedMap.put(bedNoThree.getBedId(), bedNoThree);

        inPatientOne = new InPatient();
        inPatientOne.setPatients(patientsDetails.get(patients.getPatientId()));
        inPatientOne.setBed(bedMap.get(1l));
        inPatientOne.setIpIdentificationNumber(1l);

        inPatientTwo = new InPatient();
        inPatientTwo.setPatients(patientsDetails.get(patients1.getPatientId()));
        inPatientTwo.setBed(bedMap.get(2l));
        inPatientTwo.setIpIdentificationNumber(2l);

        inPatientThree = new InPatient();
        inPatientThree.setPatients(patientsDetails.get(patients2.getPatientId()));
        inPatientThree.setBed(bedMap.get(3l));
        inPatientThree.setIpIdentificationNumber(3l);

        inPatientDetails = new HashMap<>();
        inPatientDetails.put(inPatientOne.getIpIdentificationNumber(), inPatientOne);
        inPatientDetails.put(inPatientTwo.getIpIdentificationNumber(), inPatientTwo);
        inPatientDetails.put(inPatientThree.getIpIdentificationNumber(), inPatientThree);
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

    public static Map<Long, VisitingInformation> populateVisitingInformation() {

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

        return null;
    }

    public static void allReport() {
        ReportBO reportBo = new ReportBO();
        try {
            reportBo.displayPatientDetails(patientsDetails, 2l, "Jack");
            reportBo.displayListOfVisitForPatientId(visitingInformationDetails, 2l);
            reportBo.displayPatientsForPatientsId(patientsDetails, 2l);
            reportBo.displayPatientsForDoctorId(appointmentDetails, 1l);
            reportBo.displayOutPatientDetails(patientsDetails);
            reportBo.displayInPatientDetails(inPatientDetails);
            reportBo.displayTheListOfPatientWhoNeedsTheFollowUpVisit(visitingInformationDetails);
            reportBo.displayTodayVisitedPatientDetails(visitingInformationDetails);
            reportBo.displayVisitedPatientDateRange(visitingInformationDetails);
           // reportBo.displayVisitedPatientDateRangeTest(visitingInformationDetails);
        } catch (Exception e) {
            System.out.println("All reports throws exception:" + e.getMessage());
        }
    }

    public static Appointment createAppointment() {
        AppointmentBO appointmentBO = new AppointmentBO();
        Appointment appointment = null;
        try {
            appointment = appointmentBO.createAppointment(2l, patientsDetails, appointmentDetails,
                    " headache ", 2l, doctorDetails);
        } catch (Exception e) {
            System.out.println("this is appointment detail exception:" + e.getMessage());
        }
        return appointment;
    }

    public static VisitingInformation createVisitingInformation(Appointment appointment) {
        VisitingInformationBO visitingInformationBO = new VisitingInformationBO();
        VisitingInformation visitingInformation = null;
        try {
            if (appointment != null) {
                visitingInformation = visitingInformationBO.createVisit(visitingInformationDetails,
                        appointment, medicineList);
            }
        } catch (Exception e) {
            System.out.println("this is visiting information detail exception:" + e.getMessage());
        }
        return visitingInformation;
    }

    public static void createInPatientInformation(VisitingInformation visitingInformation) {
        InPatientBO inPatientBO = new InPatientBO();
        try {
            if (visitingInformation.getAppointment().getPatients() != null && visitingInformation.getAppointment().getPatients().getPatientType() != null && visitingInformation.getAppointment().getPatients().getPatientType().equals(PatientType.INPATIENT.getType())) {
                inPatientBO.createIp(visitingInformation.getAppointment().getPatients(), inPatientDetails, bedMap);
            }
        } catch (Exception e) {
            System.out.println("this is inpatient information detail exception:" + e.getMessage());
        }
    }
}

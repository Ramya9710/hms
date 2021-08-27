package utility;

public enum PatientDiseases {
    PATIENT_DISEASES("headache"), PATIENT_DISEASES1("memory loss"), PATIENT_DISEASES2("chest pain");

    PatientDiseases(String diseases) {
        Diseases = diseases;
    }

    private String Diseases;

    public String getDiseases() {
        return Diseases;
    }
}

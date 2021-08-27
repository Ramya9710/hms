package utility;

public enum PatientType {
    INPATIENT("IP"), OUTPATIENT("OP");

    PatientType(String type) {
        this.type = type;
    }

    private String type;

    public String getType() {
        return type;
    }
}

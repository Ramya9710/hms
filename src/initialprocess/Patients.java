package initialprocess;

import java.util.Date;

public class Patients {
    private String patientName;
    private Long patientId;
    private Date dob;
    private String patientAddress;
    private String patientType;
    private String patientPhoneNumber;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public Date getDate_of_birth() {
        return dob;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.dob = date_of_birth;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "patientName='" + patientName + '\'' +
                ", patientId=" + patientId +
                ", dob=" + dob +
                ", patientAddress='" + patientAddress + '\'' +
                ", patientType='" + patientType + '\'' +
                ", patientPhoneNumber='" + patientPhoneNumber + '\'' +
                '}';
    }


    public void put(long patientId, Patients patients1) {
        Patients patients = new Patients();
        patients.setPatientName("Durga");
        patients.setPatientId(patientId);
        patients.setPatientAddress("chennai");
        patients.setDate_of_birth(new Date());
        patients.setPatientPhoneNumber("9854512120");
    }
}

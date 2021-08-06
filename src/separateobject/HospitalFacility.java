package separateobject;

public class HospitalFacility {
    private Patients patients;
    private Long identificationNumber;
    private Long bedId;
    private String bedType;
    private Long rooNo;

    public Long getBedId() {
        return bedId;
    }

    public void setBedId(Long bedId) {
        this.bedId = bedId;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public Long getRooNo() {
        return rooNo;
    }

    public void setRooNo(Long rooNo) {
        this.rooNo = rooNo;
    }

    public Patients getPatients() {
        return patients;
    }

    public void setPatients(Patients patients) {
        this.patients = patients;
    }

    public Long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(Long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
}

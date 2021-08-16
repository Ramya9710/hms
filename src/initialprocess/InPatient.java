package initialprocess;

public class InPatient {
    private Long ipIdentificationNumber;
    private Patients patients;
    private Bed bed;


    public Long getIpIdentificationNumber() {
        return ipIdentificationNumber;
    }

    public void setIpIdentificationNumber(Long ipIdentificationNumber) {
        this.ipIdentificationNumber = ipIdentificationNumber;
    }

    public Patients getPatients() {
        return patients;
    }

    public void setPatients(Patients patients) {
        this.patients = patients;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        return "InPatient{" +
                "ipIdentificationNumber=" + ipIdentificationNumber +
                ", patients=" + patients +
                ", bed=" + bed +
                '}';
    }
}

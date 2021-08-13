package initialprocess;

public class Hospital {

    private Long hospitalId;
    private String hospitalLocation;
    private String hospitalName;

    public Long getHospitalId(Hospital hospital) {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalLocation='" + hospitalLocation + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                '}';
    }
}

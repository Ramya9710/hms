package separateobject;

public class Doctor {
    private Long doctorId;
    private String doctorName;
    private String doctorSpecialisation;

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSpecialisation() {
        return doctorSpecialisation;
    }

    public void setDoctorSpecialisation(String doctorSpecialisation) {
        this.doctorSpecialisation = doctorSpecialisation;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", doctorSpecialisation='" + doctorSpecialisation + '\'' +
                '}';
    }
}

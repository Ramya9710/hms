package separateobject;

import java.util.List;

public class VisitingInformation {
    private Long visitId;
    private Appointment appointment;
    private String doctorRecommendation;
    private List<Medicine> listOfMedicine;
    private Boolean followUpNeed;

    public Long getVisitId() {
        return visitId;
    }

    public void setVisitId(Long visitId) {
        this.visitId = visitId;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public String getDoctorRecommendation() {
        return doctorRecommendation;
    }

    public void setDoctorRecommendation(String doctorRecommendation) {
        this.doctorRecommendation = doctorRecommendation;
    }

    public List<Medicine> getListOfMedicine() {
        return listOfMedicine;
    }

    public void setListOfMedicine(List<Medicine> listOfMedicine) {
        this.listOfMedicine = listOfMedicine;
    }

    public Boolean getFollowUpNeed() {
        return followUpNeed;
    }

    public void setFollowUpNeed(Boolean followUpNeed) {
        this.followUpNeed = followUpNeed;
    }

    @Override
    public String toString() {
        return "VisitingInformation{" +
                "visitId=" + visitId +
                ", appointment=" + appointment +
                ", doctorRecommendation='" + doctorRecommendation + '\'' +
                ", listOfMedicine=" + listOfMedicine +
                ", followUpNeed=" + followUpNeed +
                '}';
    }
}

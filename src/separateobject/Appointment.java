package separateobject;

import javax.xml.bind.DataBindingException;
import java.util.Date;

public class Appointment {
    private Long appointmentId;
    private Doctor doctor;
    private Patients patients;
    private Date dateOfVisit;
    private String purposeOfVisit;
    private Boolean isFirstVisit;
    private Double bp;
    private Double temperature;

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patients getPatients() {
        return patients;
    }

    public void setPatients(Patients patients) {
        this.patients = patients;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getPurposeOfVisit() {
        return purposeOfVisit;
    }

    public void setPurposeOfVisit(String purposeOfVisit) {
        this.purposeOfVisit = purposeOfVisit;
    }

    public Boolean getFirstVisit() {
        return isFirstVisit;
    }

    public void setFirstVisit(Boolean firstVisit) {
        isFirstVisit = firstVisit;
    }

    public Double getBp() {
        return bp;
    }

    public void setBp(Double bp) {
        this.bp = bp;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "AppointmentBO{" +
                "appointmentId=" + appointmentId +
                ", doctor=" + doctor +
                ", patients=" + patients +
                ", dateOfVisit=" + dateOfVisit +
                ", purposeOfVisit='" + purposeOfVisit + '\'' +
                ", isFirstVisit=" + isFirstVisit +
                ", bp=" + bp +
                ", temperature=" + temperature +
                '}';
    }
}

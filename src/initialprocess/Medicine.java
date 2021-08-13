package initialprocess;

import java.util.Date;

public class Medicine {
    private Long medicineId;
    private String medicineName;
    private Date expiryDate;
    private String patchNumber;
    private String purposeOfMedicine;

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getPatchNumber() {
        return patchNumber;
    }

    public void setPatchNumber(String patchNumber) {
        this.patchNumber = patchNumber;
    }

    public String getPurposeOfMedicine() {
        return purposeOfMedicine;
    }

    public void setPurposeOfMedicine(String purposeOfMedicine) {
        this.purposeOfMedicine = purposeOfMedicine;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineId=" + medicineId +
                ", medicineName='" + medicineName + '\'' +
                ", expiryDate=" + expiryDate +
                ", patchNumber='" + patchNumber + '\'' +
                ", purposeOfMedicine='" + purposeOfMedicine + '\'' +
                '}';
    }
}
package business;

import separateobject.Patients;
import separateobject.VisitingInformation;

import java.util.Iterator;
import java.util.Map;

/**
 *
 */
public class Report {

    private Map<Long, VisitingInformationBO> visitingInformationBOMap;
    private Long patientId;


    public void displayListOfVisitForPatient() {
        displayListOfVisitForPatient(visitingInformationBOMap, patientId);
    }

    public void displayListOfVisitForPatient(Map<Long, VisitingInformationBO> visitingInformationBOMap, Long patientId) {
        this.visitingInformationBOMap = visitingInformationBOMap;
        this.patientId = patientId;

        VisitingInformationBO visitingInformationBO = null;
        if (visitingInformationBOMap.isEmpty()) {
        }
        if (patientId == null && patientId == 0) {
        }
        VisitingInformation visitingInformation = null;
        Iterator<Long> iterator = visitingInformationBOMap.keySet().iterator();

        while (iterator.hasNext()) {
            visitingInformationBO = visitingInformationBOMap.get(iterator.next());
            if (visitingInformation.getAppointment().getPatients().getPatientId() == patientId) {
                System.out.println(" List of the Patients is:" + visitingInformationBO);
            }
        }

    }


    public void displayPatientsForPatientsNameAndId(Map<Long, AppointmentBO> appointmentBusinessObjectMap) {
        Map<Long, Patients> patientsMap = null;
        displayPatientsForPatientsId(patientsMap, patientId);
    }

    public void displayPatientsForPatientsId(Map<Long, Patients> patientsMap, Long patientId) {
        Patients patients = null;
        if (patientsMap.isEmpty()) {
        }
        if (patientId == null && patientId == 0) {
        }

        Iterator<Long> iterator = patientsMap.keySet().iterator();
        while (iterator.hasNext()) {
            patients = patientsMap.get(iterator.next());
            if (patients.getPatientId() == patientId) {
                System.out.println("List of patient ID :" + patients.getPatientId());
                if (patients.getPatientName().equals(patientsMap)) {
                    System.out.println("List of patient Name" + patients.getPatientName());
                }
            }
        }
    }
    public void DisplayTheListOfPatientWhoNeedsTheFollowUpVisit(Map<Long , VisitingInformation> visitingInformationMap ) {
        visitingInformationMap = null;
        if (visitingInformationMap.isEmpty()) {
        }

    }


}
package business;

import initialprocess.Appointment;
import initialprocess.Medicine;
import initialprocess.Patients;
import initialprocess.VisitingInformation;
import utility.FindLatestNumberUtil;

import java.util.*;

public class VisitingInformationBO  {
    //visitingInformation

    public VisitingInformation createVisit(Long patientID, Map<Long, Patients> patientsMap, Long doctorId, Map<Long, VisitingInformation> visitingInformationMap,
                                           Long visitId, Map<Long, Appointment> appointmentMap, Long appointmentId,
                                           List<Medicine> medicineList) throws Exception {

        if (patientID == null)
            throw new Exception("patient Id is null");
        if (visitId == null)
            throw new Exception("visit Id is null");
        if (doctorId == null)
            throw new Exception("doctor Id is null");
        Patients patients = null;
        Appointment appointment;

        VisitingInformation visitingInformation = new VisitingInformation();
        visitingInformation.setVisitId(FindLatestNumberUtil.getLatestId(new ArrayList<>(visitingInformationMap.keySet())));
        visitingInformation.setFollowUpNeed(true);
        visitingInformation.setDoctorRecommendation("Take Rest");
        visitingInformation.setListOfMedicine(medicineList);
        visitingInformation.setAppointment(appointmentMap.get(appointmentId));
        visitingInformationMap.put(visitingInformation.getVisitId(), visitingInformation);

        if (appointmentMap != null && appointmentMap.containsKey(appointmentId)) {
            visitingInformation.setAppointment(appointmentMap.get(appointmentId));
            appointment = appointmentMap.get(appointmentId);
            patients = appointment.getPatients();
        } else {
            visitingInformation.setAppointment(createAppointment(appointmentMap));
        }

        Boolean patientIsIp = isIpPatient(visitingInformationMap, patients.getPatientId());
        patientIsIp.equals(true);
        patientsMap.put(patients.getPatientId(), patients);
        visitingInformationMap.put(visitingInformation.getVisitId(), visitingInformation);

        return visitingInformation;
    }
    public boolean isIpPatient(Map<Long, VisitingInformation> visitingInformationMap, Long patientId) {
        int noOfVisit = 0;
        VisitingInformation visitingInformation;
        Patients patients = null;

        Iterator<Long> iterator = visitingInformationMap.keySet().iterator();
        while (iterator.hasNext()) {
            visitingInformation = visitingInformationMap.get(iterator.next());
            if (visitingInformation.getAppointment().getPatients().getPatientId() == patientId) {
                noOfVisit++;
            }
        }
        if (noOfVisit >= 3) {
            System.out.println(noOfVisit);
            patients.setPatientType("IP");
            System.out.println("InPatientBO type is IP or OP :" + patients.getPatientType());

        }
        return false;
    }

    private Appointment createAppointment(Map<Long, Appointment> appointmentMap) {
        Appointment appointment = null;
        appointment.setDoctor(appointment.getDoctor());
        appointment.setAppointmentId(1l);
        appointment.setFirstVisit(true);
        appointment.setAppointmentId(FindLatestNumberUtil.getLatestId(new ArrayList<>()));
        appointment.setBp(120.20);
        appointment.setTemperature(36.23);
        appointment.setDateOfVisit(new Date());
        appointment.setPatients(appointment.getPatients());
        appointmentMap.put(appointment.getAppointmentId(), appointment);
        return appointment;
    }

}




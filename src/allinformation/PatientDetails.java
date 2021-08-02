/*
package allinformation;

import separateobject.Patients;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatientDetails {
    private Object Patients;
    private Object PatientDetails;

    @Override
    public String toString() {
        return super.toString();
    }

    public void patientDetails() {
        Patients[] patient = new Patients[25];
        int i;
        for (i = 0; i < 25; i++) {
            patient[i] = new Patients();
        }
        patient[0].setPatientName("Ramya");
        patient[0].setPatientId(121512314);
        patient[0].setPatientAddress("Jayankondam");
        patient[0].setPatientPhoneNumber("9656256225");
       */
/* patient[0].setDate_of_birth();*//*


        patient[1].setPatientName("Rosy");
        patient[1].setPatientId(121512315);
        patient[1].setPatientAddress("Trichy");
        patient[1].setPatientPhoneNumber("9656256226");
        */
/*patient[1].setDate_of_birth("05_07_2001");*//*


        patient[2].setPatientName("Tommy");
        patient[2].setPatientId(121512316);
        patient[2].setPatientAddress("Chennai");
        patient[2].setPatientPhoneNumber("9656256228");
       */
/* patient[2].setDate_of_birth("25_09_1998");*//*


        List<Patients> patientsList = new ArrayList<>();
        patientsList.add(patient[0]);
        patientsList.add(patient[1]);
        patientsList.add(patient[2]);


        Map<Object, Object> patientDetailsMap = new HashMap<>();
        patientDetailsMap.put(Patients,PatientDetails);

        System.out.println("PATIENT DETAILS:" + patientsList.get(0) );

    }
}
*/

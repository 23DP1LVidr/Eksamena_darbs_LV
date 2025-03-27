import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
 
 
public class PatientManager {
    public void getPatientList() throws Exception {
 
        ArrayList<Patient> patientList = new ArrayList<>();
        BufferedReader reader = Helper.getReader("Patients.csv");
        reader.readLine();
        String line;
 
 
        while ((line = reader.readLine()) != null) {
 
            String[] parts = line.split(",");
            Patient patient = new Patient(parts[0],(parts[1]),(parts[2]),(parts[3]));
 
            patientList.add(patient);
        }

        for (Patient patient : patientList){
            System.out.println(patient);
        }
    }   

    public void addPatient(String patientsInfo) throws Exception{
        BufferedWriter writer = Helper.getWriter("Patients.csv", StandardOpenOption.APPEND);
        writer.write(patientsInfo);
        writer.newLine();
        writer.close();
    }
}
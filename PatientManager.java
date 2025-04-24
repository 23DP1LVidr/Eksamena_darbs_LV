import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
 
 
public class PatientManager {
    private int PatientCount;

    public int getPatientList() throws Exception {

        PatientCount = 0;
 
        PatientManager patientManager = new PatientManager();
        ArrayList<Patient> patientList = patientManager.getPatientArrayList();

        for (Patient patient : patientList){
            System.out.printf("|%-19s| %-19s| %-19s| %-34s| \n",patient.GetName(),patient.GetSurname(),patient.GetBirthdate(),patient.GetEmail());
            PatientCount+=1;
        }

        return PatientCount;
    }   

    public void addPatient(String patientsInfo) throws Exception{
        BufferedWriter writer = Helper.getWriter("Patients.csv", StandardOpenOption.APPEND);
        writer.write(patientsInfo);
        writer.newLine();
        writer.close();
    }

    public void findPatient(String keyword) throws Exception{

        PatientManager patientManager = new PatientManager();
        ArrayList<Patient> patientList = patientManager.getPatientArrayList();

        for (Patient patient : patientList) {
            if (patient.matches(keyword)) {
                System.out.printf("|%-19s| %-19s| %-19s| %-34s| \n",patient.GetName(),patient.GetSurname(),patient.GetBirthdate(),patient.GetEmail());
            }
        }
    }   

    public ArrayList getPatientArrayList() throws Exception{
        
        ArrayList<Patient> patientList = new ArrayList<>();
        BufferedReader reader = Helper.getReader("Patients.csv");
        reader.readLine();
        String line;
 
 
        while ((line = reader.readLine()) != null) {
 
            String[] parts = line.split(",");
            Patient patient = new Patient(parts[0],(parts[1]),(parts[2]),(parts[3]));
 
            patientList.add(patient);
        }

        patientList.sort(Comparator.comparing(Patient::GetName));

        return patientList;
    }
}
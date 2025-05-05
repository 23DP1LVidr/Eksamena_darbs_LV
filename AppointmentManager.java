import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public class AppointmentManager {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static ArrayList<Appointment> getAppointmentArrayList() throws Exception {
        ArrayList<Appointment> appointments = new ArrayList<>();
        BufferedReader reader = Helper.getReader("Appointments.csv");
        reader.readLine();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String user = parts[0];
            LocalDateTime dateTime = LocalDateTime.parse(parts[1], formatter);
            String description = parts[2];
            int id = Integer.parseInt(parts[3]);

            appointments.add(new Appointment(user, dateTime, description, id));
        }

        appointments.sort(Comparator.comparing(Appointment::getID));
        return appointments;
    }

    public static void addAppointment(String user, LocalDateTime dateTime, String description, int ID) throws Exception {
        BufferedWriter writer = Helper.getWriter("Appointments.csv", StandardOpenOption.APPEND);
        writer.write(user + "," + dateTime.format(formatter) + "," + description + "," + ID);
        writer.newLine();
        writer.close();
    }
}

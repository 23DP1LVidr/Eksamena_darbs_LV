import java.time.LocalDateTime;

public class Appointment {
    private String user;
    private LocalDateTime dateTime;
    private String description;
    private int ID;

    public Appointment(String user, LocalDateTime dateTime, String description, int ID) {
        this.user = user;
        this.dateTime = dateTime;
        this.description = description;
        this.ID = ID;
    }

    public String getUser() {
        return user;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public int getID() {
        return ID;
    }
}

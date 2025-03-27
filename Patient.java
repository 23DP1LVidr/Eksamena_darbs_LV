public class Patient {
    private String name;
    private String surname;
    private String birthdate;
    private String email;

    public Patient(String Name, String Surname, String Birthdate, String Email) {
        this.name = Name;
        this.surname = Surname;
        this.birthdate = Birthdate;
        this.email = Email;
    }

    @Override
    public String toString() {
        return String.format("Patient [ Name: " + name + ", Surname: " + surname + " Birthdate: " + birthdate + ", Email: " + email + " ]");
    }
}
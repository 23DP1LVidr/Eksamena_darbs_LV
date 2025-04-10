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

    public String GetName(){
        return name;
    }

    public String GetSurname(){
        return surname;
    }

    public String GetBirthdate(){
        return birthdate;
    }

    public String GetEmail(){
        return email;
    }
    
    @Override
    public String toString() {
        return String.format(name + " " + surname + " " + birthdate + " " + email);
    }

    public boolean matches(String keyword) {
        return name.contains(keyword) || surname.contains(keyword) ||
               birthdate.contains(keyword) || email.contains(keyword);
    }
}
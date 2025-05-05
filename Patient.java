public class Patient {
    private String name;
    private String surname;
    private String email;
    private String password;

    public Patient(String Name, String Surname, String Email, String Password) {
        this.name = Name;
        this.surname = Surname;
        this.email = Email;
        this.password = Password;
    }

    public String getName(){
        return name;
    }

    public String GetSurname(){
        return surname;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }
    
    @Override
    public String toString() {
        return String.format(name + " " + surname + " " + email);
    }

    public boolean matches(String keyword) {
        return name.contains(keyword) || surname.contains(keyword) || email.contains(keyword);
    }
}
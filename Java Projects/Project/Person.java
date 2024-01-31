public class Person {
     private String name;
    private String email; 
    private String birthDate; 

    public Person(String name, String email, String birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void displayPersonalInfo() {
        System.out.println("Name: " + name + "\nEmail: " + email + "\nDate of Birth: " + birthDate);
    }
}

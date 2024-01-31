public class Employee extends Person {
    private double salary;

    public Employee(String name, String email, String birthDate, double salary) {
        super(name, email, birthDate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Çalışanın kişisel verilerini görüntüleme
    @Override
    public void displayPersonalInfo() {
        System.out.println("Name: " + getName() + "\nEmail: " + getEmail() + "\nDate of Birth: " + getBirthDate() + "\nSalary: " + salary);
    }
}

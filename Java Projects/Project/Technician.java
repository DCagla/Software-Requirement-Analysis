public class Technician extends Employee {
    private boolean isSenior;

    public Technician(String name, String email, String birthDate, double salary, boolean isSenior) {
        super(name, email, birthDate, salary);
        this.isSenior = isSenior;
    }

    public boolean isSenior() {
        return isSenior;
    }

    public void setSenior(boolean isSenior) {
        this.isSenior = isSenior;
    }

    // Technician bilgilerini görüntüleme
    @Override
    public void displayPersonalInfo() {
        System.out.println("Technician Name: " + getName() + "\nEmail: " + getEmail() + "\nDate of Birth: " + getBirthDate() + "\nSalary: " + getSalary() + "\nSenior: " + (isSenior ? "Yes" : "No"));
    }

    // Siparişleri görüntüleme
    public void displayOrders() {
        if (isSenior) {
            System.out.println("Displaying orders...");
        } else {
            System.out.println("Only senior technicians can display orders.");
        }
    }
}

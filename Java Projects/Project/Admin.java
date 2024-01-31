import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin extends Employee {
    private String password;
    private Map<String, Customer> customers;

    public Admin(String name, String email, String birthDate, double salary, String password) {
        super(name, email, birthDate, salary);
        this.password = password;
        this.customers = new HashMap<>(); // Müşteri koleksiyonunu başlatır
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Admin bilgilerini görüntüleme
    @Override
    public void displayPersonalInfo() {
        super.displayPersonalInfo();
        System.out.println("Password: " + password);
    }

    // Müşteri ekleme 
    public void addCustomer(String name, String email, String birthDate, String customerId, String password, double balance, String status) {
        if (!customers.containsKey(customerId)) {
            Customer newCustomer = new Customer(name, email, birthDate, customerId, password, balance, status);
            customers.put(customerId, newCustomer); // Müşteriyi koleksiyona ekler
            System.out.println("Customer " + name + " added successfully.");
        } else {
            System.out.println("A customer with this ID already exists.");
        }
    }
    
    private Customer findCustomerById(String customerId) {
        return customers.get(customerId);
    }

    // Müşteri bilgilerini görüntüleme 
    public void displayCustomerInfo(String customerId) {
        Customer customer = findCustomerById(customerId);
        if (customer != null) {
            System.out.println(customer.toString());
        } else {
            System.out.println("Customer not found with ID: " + customerId);
        }
    }

    // Tüm müşterileri listeleme 
    public void listAllCustomers() {
        for (Customer customer : customers.values()) {
            System.out.println(customer.toString());
        }
    }
        // Kampanya başlatma 
    public void launchCampaign() {
        String[] commandParts = readCommandFromFile("commands.txt", "LAUNCHCAMPAIGN");
        if (commandParts.length > 1 && commandParts[0].equals("LAUNCHCAMPAIGN")) {
            System.out.println("Campaign launched with details: " + commandParts[1]);
        } else {
            System.out.println("No valid LAUNCHCAMPAIGN command found.");
        }
    }
    
    // Personel ekleme 
    public void addEmployee() {
        String[] commandParts = readCommandFromFile("commands.txt", "ADDEMPLOYEE");
        if (commandParts.length > 1 && commandParts[0].equals("ADDEMPLOYEE")) {
            System.out.println("Employee added: " + commandParts[1]);
        } else {
            System.out.println("No valid ADDEMPLOYEE command found.");
        }
    }

    private String[] readCommandFromFile(String fileName, String commandType) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(commandType)) {
                    return line.split("\t");
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String[0];
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyBazaar {
    private static Map<String, Person> users = new HashMap<>();
    private static Map<String, Item> items = new HashMap<>();
    // private static Map<String, Command> commands = new HashMap<>();

    public static void main(String[] args) {
        readUsersFromFile("src/users.txt");
        readItemsFromFile("src/items.txt");
        processCommandsFromFile("src/commands.txt");
    }

    private static void readUsersFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split("\t");
                if (userDetails.length < 6) {
                    System.out.println("Invalid user data format.");
                    continue;
                }
                Person user = createUser(userDetails);
                if (user != null) {
                    users.put(userDetails[1], user);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading users file: " + e.getMessage());
        }
    }

    private static void readItemsFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] itemDetails = line.split("\t");
                if (itemDetails.length < 4) {
                    System.out.println("Invalid item data format.");
                    continue;
                }
                Item item = createItem(itemDetails);
                if (item != null) {
                    items.put(itemDetails[0], item);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading items file: " + e.getMessage());
        }
    }

    private static Person createUser(String[] userDetails) {
        String userType = userDetails[0];

        switch (userType) {
            case "ADMIN":
                return new Admin(userDetails[1], userDetails[2], userDetails[3], Double.parseDouble(userDetails[4]), userDetails[5]);
            case "TECH":
                if (userDetails.length < 7) {
                    System.out.println("Invalid technician data format.");
                    return null;
                }
                return new Technician(userDetails[1], userDetails[2], userDetails[3], Double.parseDouble(userDetails[4]), userDetails[5], Boolean.parseBoolean(userDetails[6]));
            case "CUSTOMER":
                if (userDetails.length < 9) {
                    System.out.println("Invalid customer data format.");
                    return null;
                }
                return new Customer(userDetails[1], userDetails[2], userDetails[3], userDetails[6], Double.parseDouble(userDetails[7]), userDetails[5], userDetails[8]);
            default:
                System.out.println("Unknown user type: " + userType);
                return null;
        }
    }

    private static Item createItem(String[] itemDetails) {
        String category = itemDetails[2];

        switch (category) {
            case "Electronic":
                return new ElectronicItem(itemDetails[0], itemDetails[1], Double.parseDouble(itemDetails[3]), itemDetails[4], itemDetails[5], Integer.parseInt(itemDetails[6]), Integer.parseInt(itemDetails[7]));
            case "Cosmetic":
                return new CosmeticItem(itemDetails[0], itemDetails[1], Double.parseDouble(itemDetails[3]), itemDetails[4], itemDetails[5], itemDetails[6], Double.parseDouble(itemDetails[7]), Boolean.parseBoolean(itemDetails[8]));
            case "OfficeSupplies":
                return new OfficeSuppliesItem(itemDetails[0], itemDetails[1], Double.parseDouble(itemDetails[3]), itemDetails[4], itemDetails[5]);
            default:
                System.out.println("Unsupported item category: " + category);
                return null;
        }
    }

    private static void processCommandsFromFile(String fileName) {
        Admin admin = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] commandParts = line.split("\t");
                String command = commandParts[0];

                switch (command) {
                    case "ADDCUSTOMER":
                        if (admin != null) admin.addCustomer();
                        break;
                    case "LAUNCHCAMPAIGN":
                        if (admin != null) admin.launchCampaign();
                        break;
                    case "ADDEMPLOYEE":
                        if (admin != null) admin.addEmployee();
                        break;
                    case "SHOWCUSTOMER":
                        if (admin != null) admin.displayCustomerInfo(commandParts[1]);
                        break;
                    case "SHOWCUSTOMERS":
                        if (admin != null) admin.listAllCustomers();
                        break;
                    case "CREATEADMIN":
                        admin = new Admin(commandParts[1], commandParts[2], commandParts[3], Double.parseDouble(commandParts[4]), commandParts[5]);
                        break;
                    default:
                        System.out.println("Unknown command: " + command);
                        break;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error processing command file: " + e.getMessage());
        }
    }
}

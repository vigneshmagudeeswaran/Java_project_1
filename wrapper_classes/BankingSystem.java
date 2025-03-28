import java.util.HashMap;

public class BankingSystem {
    // Simulating customer data storage using HashMap
    private HashMap<Integer, Integer> customerAges;

    public BankingSystem() {
        customerAges = new HashMap<>();
    }

    // Method to add customer age to the system
    public void addCustomerAge(int customerId, int age) {
        customerAges.put(customerId, age);
    }

    // Method to retrieve customer age from the system
    public Integer getCustomerAge(int customerId) {
        return customerAges.get(customerId);
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.addCustomerAge(1001, 35);
        bankingSystem.addCustomerAge(1002, 42);

        int customerId = 1001;
        Integer customerAge = bankingSystem.getCustomerAge(customerId);
        System.out.println("Customer ID: " + customerId + ", Age: " + customerAge);
    }
}


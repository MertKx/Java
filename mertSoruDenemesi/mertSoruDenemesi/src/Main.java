public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();
    }
}
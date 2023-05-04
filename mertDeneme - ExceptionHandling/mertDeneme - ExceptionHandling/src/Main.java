public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap bakiyeniz: " + manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap bakiyeniz: " + manager.getBalance());
        try {
            manager.withdraw(40);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap bakiyeniz:" + manager.getBalance());
        try {
            manager.withdraw(70);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap bakiyeniz: " + manager.getBalance());
    }
}
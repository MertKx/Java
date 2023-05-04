public class AccountManager {
    private double balance;
    public void deposit(double amount){
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws BalanceInsufficientException {
        if (balance>=amount){
            balance = getBalance() - amount;
        }else {
            throw new BalanceInsufficientException("Hesaptan para çekilemedi, bakiye yetersiz.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

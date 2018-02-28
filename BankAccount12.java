public class BankAccount12 {
    private String name;
    private double balance;
    private double transactionFee;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        double toWithdraw = amount + transactionFee;

        if (toWithdraw <= balance) {
            balance = balance - toWithdraw;
        } else {
            System.out.println("Account balance too low to make the desired withdrawal.");
        }
    }

    @Override
    public String toString() {
        return name + ", $" + balance;
    }
}
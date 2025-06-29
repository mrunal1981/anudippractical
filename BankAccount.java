public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void display()
    {
      System.out.println("accountHolderName: "+accountHolderName+"\n"+"accountNumber: "+accountNumber+"\n"+"balance: "+balance);
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Mrunal", 1234567, 10000);

        account.display();
        account.deposit(10000);
        account.withdraw(5000);

        int currentBalance = account.getBalance();
        System.out.println("Current Balance: " + currentBalance);

        String status = (currentBalance >= 3000) ?
                        "Minimum Balance Maintained" :
                        "Minimum Balance not Maintained";

        System.out.println("Status: " + status);
    }
}
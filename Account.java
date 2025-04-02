public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if(balance > 0.0){
            this.balance = balance;
    }
}

public void deposit(double depositAmount) {
        if(depositAmount > 0.0){
            balance += depositAmount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > balance || withdrawAmount < 0.0 ){
            System.out.println("Withdrawal amount exceeded account balance");
        }  else if(withdrawAmount > 0.0) {
            balance -= withdrawAmount;
        }
    }
    
    public double getBalance() {
        return balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void displayAccount(Account account1) {
        System.out.println("Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());

    }
}

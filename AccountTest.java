public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Glory", 50.00);
        Account account2 = new Account("John Alex", -7.53);

        java.util.Scanner input = new java.util.Scanner(System.in);


        System.out.print("Enter deposit amount for account 1: ");
        double depositAmount = input.nextDouble();
        System.out.println("Deposit successful...");
        account1.deposit(depositAmount);
        account1.displayAccount(account1);

        System.out.println("Enter deposit amount for account 2: ");
        depositAmount = input.nextDouble();
        System.out.println("Deposit successful...");
        account2.deposit(depositAmount);
        account2.displayAccount(account2);



        System.out.println("Enter withdrawal amount for account 1: ");
        double withdrawal =  input.nextDouble();
        System.out.println("Withdrawal successful...");
        account1.withdraw(withdrawal);
        account1.displayAccount(account1);


        System.out.println("Enter withdrawal amount for account 2: ");
        withdrawal =  input.nextDouble();
        System.out.println("Withdrawal successful...");
        account2.withdraw(withdrawal);
        account2.displayAccount(account2);
    }

    public static  Account account1 = new Account("Jane Glory", 50.00);
    public static  Account account2 = new Account("John Alex", -7.53);

    public static void displayAccount(Account accountToDisplay){

        System.out.println("Balance for account 1: " + account1.getName() + " " + account1.getBalance());
        System.out.println("Balance for account 2: " + account2.getName() + " " + account2.getBalance());
    }
}

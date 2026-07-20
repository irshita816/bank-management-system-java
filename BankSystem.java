import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {

    ArrayList<BankAccount> accounts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void createAccount() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Deposit: ");
        double balance = sc.nextDouble();

        accounts.add(new BankAccount(accNo, name, balance));

        System.out.println("Account Created Successfully.");
    }

    public void depositMoney() {

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == acc) {

                System.out.print("Enter Deposit Amount: ");
                double amount = sc.nextDouble();

                account.deposit(amount);
                return;
            }
        }

        System.out.println("Account Not Found.");
    }

    public void withdrawMoney() {

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == acc) {

                System.out.print("Enter Withdrawal Amount: ");
                double amount = sc.nextDouble();

                account.withdraw(amount);
                return;
            }
        }

        System.out.println("Account Not Found.");
    }

    public void displayAccounts() {

        if (accounts.isEmpty()) {

            System.out.println("No Accounts Available.");
            return;
        }

        for (BankAccount account : accounts) {

            account.display();

        }

    }

    public void deleteAccount() {

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == acc) {

                accounts.remove(account);

                System.out.println("Account Deleted Successfully.");

                return;
            }
        }

        System.out.println("Account Not Found.");
    }
}

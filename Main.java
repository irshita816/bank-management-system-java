import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankSystem bank = new BankSystem();

        int choice;

        do {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Delete Account");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bank.createAccount();
                    break;

                case 2:
                    bank.depositMoney();
                    break;

                case 3:
                    bank.withdrawMoney();
                    break;

                case 4:
                    bank.displayAccounts();
                    break;

                case 5:
                    bank.deleteAccount();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");

            }

        } while (choice != 6);

        sc.close();

    }
}

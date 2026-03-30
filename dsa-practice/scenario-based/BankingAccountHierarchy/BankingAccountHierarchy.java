package BankingAccountHierarchy;

import java.util.Scanner;

public class BankingAccountHierarchy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Banking Menu ======");
            System.out.println("1. Create Saving Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int sAccNo = sc.nextInt();

                    System.out.print("Enter Balance: ");
                    double sBalance = sc.nextDouble();

                    System.out.print("Enter Saving Balance: ");
                    double savingBalance = sc.nextDouble();

                    BankAccount saving = new SavingAccount(
                            sAccNo, sBalance, savingBalance);

                    saving.display();
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int cAccNo = sc.nextInt();

                    System.out.print("Enter Balance: ");
                    double cBalance = sc.nextDouble();

                    BankAccount checking = new CheckingAccount(
                            cAccNo, cBalance);

                    checking.display();
                    break;

                case 3:
                    System.out.println("Exiting Banking System...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}

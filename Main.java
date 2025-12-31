package Bank;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        while (true) {
            for (int i = 0; i < 4; i++) {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter 1 for CheckingAccount \n 2. For Saving Account \n 0. Exit");
                System.out.println("Enter X : ");
                int x = input.nextInt();
                if (x == 1) {
                    System.out.println(" This is a Checking Account : ");
                    System.out.println("Account ID : ");
                    int ID = input.nextInt();
                    System.out.println("Current Balance  : ");
                    double balance = input.nextDouble();
                    System.out.println("Annual Interest Rate  : ");
                    double anuInterest = input.nextDouble();
                    // System.out.println("Monthly Interest Amount : ");
                    System.out.println("Overdraft Limit  : ");
                    double overdraft = input.nextDouble();

                    Account checkingAccount = new CheckingAcoount(ID, balance, anuInterest, overdraft);
                    accounts.add(checkingAccount);
                } else if (x == 2) {
                    System.out.println(" This is a Saving  Account : ");
                    System.out.println("Account ID : ");
                    int ID = input.nextInt();
                    System.out.println("Current Balance  : ");
                    double balance = input.nextDouble();
                    System.out.println("Annual Interest Rate  : ");
                    double anuInterest = input.nextDouble();
                    System.out.print("Enter credit card number for Savings Account: ");
                    String creditCardNumber = input.next();
                    System.out.print("Enter card expiry year for Savings Account: ");
                    int year = input.nextInt();
                    System.out.print("Enter card expiry month for Savings Account: ");
                    int month = input.nextInt();
                    System.out.print("Enter card expiry month for Savings Account: ");
                    int day = input.nextInt();
                    Calendar cardExpiryDate = Calendar.getInstance();
                    cardExpiryDate.set(year, month,day);

                    // Account savingsAccount = new
                    // SavingsAccount(ID,balance,anuInterest,creditCardNumber, createCalendar(year,
                    // month));
                    Account savingsAccount = new SavingAccount(ID, balance, anuInterest, creditCardNumber,cardExpiryDate);
                           // createCalendar(year, month));
                    accounts.add(savingsAccount);

                }
                for (Account a : accounts) {
                    a.Deposit(1000);
                    a.Withdraw(500);
                }

                for (Account A : accounts) {
                    if (A instanceof CheckingAcoount) {
                        CheckingAcoount Ch = (CheckingAcoount) A;
                        System.out.println();
                        System.out.println(" This is a Checking Account : ");
                        System.out.println("Account ID : " + Ch.getID());
                        System.out.println("Date Created : " + Ch.getDatacreated().getTime());
                        System.out.println("Current Balance  : " + Ch.getBalance());
                        System.out.println("Annual Interest Rate  : " + Ch.getAnnualInterestRate() + "%");
                        System.out.println("Monthly Interest Amount : " + Ch.getMonthlyInterest());
                        System.out.println("Overdraft Limit  : " + Ch.getOverdraftLimit());

                    } else if (A instanceof SavingAccount) {
                        SavingAccount Sa = (SavingAccount) A;
                        System.out.println();
                        System.out.println("This is a Savings Account : ");
                        System.out.println("Account ID : " + Sa.getID());
                        System.out.println("Date Created  : " + Sa.getDatacreated().getTime());
                        System.out.println("Current Balance  : " + Sa.getBalance());
                        System.out.println("Annual Interest Rate  : " + Sa.getAnnualInterestRate());
                        System.out.println("Monthly Interest Ammount : " + Sa.getMonthlyInterest());
                        System.out.println("Credit card Number  : " + Sa.getCrediNo());
                        System.out.println("Card Expiry Date  : " + Sa.getExpiryDate().getTime());
                        System.out.println("Credit Balance  : " + Sa.getBalance());

                    }

                    System.out.println();
                }
            }
        }
    }

    
}

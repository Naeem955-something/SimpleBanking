package Bank;

import java.util.Calendar;

public class Account {
    private int ID;
    private double Balance;
    private double AnnualInterestRate;
    private Calendar datacreated;
    public Account(int nameId, double nameBalance, double AnnualInterestRate) {
        this.ID = nameId;
        this.Balance = nameBalance;
        this.AnnualInterestRate = AnnualInterestRate;
        this.datacreated=Calendar.getInstance();
    }
    public int getID() {
        return ID;
    }
    public void setID(int nameId) {
        this.ID = nameId;
    }
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double nameBalance) {
        this.Balance = nameBalance;
    }
    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate;
    }
    public Calendar getDatacreated() {
        return datacreated;
    }
     
    public double getMonthlyInterest(){
        
        double Z =AnnualInterestRate/2;
        return Z;
    }
    public double getMonthlyInterestAmmount(){
        double P=Balance*getMonthlyInterest();
        return P;
    }
    public void Withdraw(double ammount ){
        if(Balance-ammount>500 && ammount>0){
            Balance-=ammount;
            System.out.println("Withdraw Succesfully");
        }
        else{
            System.out.println("Work not done");
        }
    }
    public void Deposit(double ammount){
        if(ammount>0){
            Balance+=ammount;
            System.out.println("Deposit done");
        }
        else{
               System.out.println("work not done");
        }
    }
    public double getOverdraftLimit() {
        return 0;
    }
    @Override
    public String toString() {
        return "Account [nameId=" + ID + ", nameBalance=" + Balance + ", AnnualInterestRate="
                + AnnualInterestRate + ", datacreated=" + datacreated.getTime() + "]";
    }
    
    
}

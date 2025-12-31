package Bank;
public class CheckingAcoount extends Account {
   private double OverdraftLimit;
    
    public CheckingAcoount(int id, double balance, double annualInterestRate, double overdraftLimit) {
    super(id, balance, annualInterestRate);
    OverdraftLimit = overdraftLimit;
}

    public double getOverdraftLimit() {
        return OverdraftLimit;
    }

   public void setOverdraftLimit(double overdraftLimit){
    this.OverdraftLimit= overdraftLimit;
   }
   public void Withdraw(double ammount){
    if(this.getBalance()>=this.OverdraftLimit && ammount>0){
        this.setBalance(getBalance()-ammount);
         System.out.println("Withdraw Succesfully");
    }
    else{
         System.out.println("Withdraw unsuccessful!");
    }
   }
@Override
    public String toString() {
        return super.toString() + " CheckingAccount [OverdraftLimit=" + OverdraftLimit + "]";
    }
}
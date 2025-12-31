package Bank;
import java.util.Calendar;
public class SavingAccount extends Account{
private String  Creditcard;
 private    Calendar expirydate;
private String crediNo;
    
    public SavingAccount(int id, double balance, double annualInterestRate, String creditcard, Calendar expirydate) {
    super(id, balance, annualInterestRate);
    Creditcard = creditcard;
    this.expirydate = expirydate;
      Calendar date = Calendar.getInstance();
         date.set(Calendar.YEAR, super.getDatacreated().get(Calendar.YEAR) + 4);
         this.expirydate = date;
    

}
    public String getCrediNo() {
        return getCrediNo();
    }
    public void setCrediNo(String crediNo) {
        this.crediNo = crediNo;
    }
    public Calendar getExpiryDate() {
        return expirydate;
    }
    public void setExpiryDate(Calendar expiryDate) {
        this.expirydate = expiryDate;
    }
    @Override
    public String toString() {
        return super.toString() + " SavingsAccount [crediNo=" + crediNo + ", expiryDate=" + expirydate.getTime() + "]";
    }
    

    
}


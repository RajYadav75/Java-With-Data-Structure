package Encapsulation;
class Account{
    private int amount;
    private String accno;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getAccno() {
        return accno;
    }
}
class BankFunctions{
    void deposit(Account acc,int dptamt){
        int total = acc.getAmount()+dptamt;
        acc.setAmount(total);
    }
    void withdraw(Account acc, int wthamt){
        int total = acc.getAmount() - wthamt;
        acc.setAmount(total);
    }
}
public class Main2 {

    public static void main(String[] args) {
        Account ob  = new Account();
        ob.setAccno("19770");
        ob.setAmount(10000);
        BankFunctions b = new BankFunctions();
        b.deposit(ob,5000);
        b.withdraw(ob, 3000);
        System.out.println(ob.getAccno()+" : "+ob.getAmount());
    }
}
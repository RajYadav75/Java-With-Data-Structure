package OOPS;
class BnkAccnt{
    public String userName;
    private String passWord;
    public void setPassWord(String pWd){
        passWord = pWd;
    }
}
public class BankAccount {
    public static void main(String[] args) {
        BnkAccnt myAccount = new BnkAccnt();
        myAccount.userName = "Raj Yadav";
//        myAccount.passWord = "12345"; //  error
        myAccount.setPassWord("12345");
        System.out.println(myAccount.userName);
    }
}

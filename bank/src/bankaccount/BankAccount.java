package bankaccount;

public class BankAccount {

    private static String branchName;
    private static String ifsc;

    private long accNum;
    private String accHName;
    private double balance;

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public String getAccHName() {
        return accHName;
    }

    public void setAccHName(String accHName) {
        this.accHName = accHName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance <= 0) {
            System.out.println("Balance should be +ve number");
        } else {
            this.balance = balance;
        }
    }

    BankAccount(String branchName, String ifsc) {
        this.branchName = branchName;
        this.ifsc = ifsc;
    }
//    void set(long an,String ahn, double bal){
//        accNum=an;
//        accHName=ahn;
//        balance = bal;
//    }

    void display() {
        System.out.println(branchName);
        System.out.println(ifsc);
        System.out.println(accNum);
        System.out.println(accHName);
        System.out.println(balance);
        System.out.println("------------------------------------------------------");
    }

    void deposit(double amt) {
        balance = balance + amt;
    }

    void withdraw(double amt) {
        balance = balance - amt;
    }

}

package bankaccount;

class BankAccount1{
    private static String branchName;
    private static String ifsc;
    
    private long accNum; 
    private String accHName;
    private double balance;

    static void set(String bN,String ifs){
        branchName = bN;
        ifsc = ifs;
    }
    void set(long an,String ahn, double bal){
        accNum=an;
        accHName=ahn;
        balance = bal;
    }
    
    void display(){
        System.out.println(branchName);
        System.out.println(ifsc);
        System.out.println(accNum);
        System.out.println(accHName);
        System.out.println(balance);
        System.out.println("------------------------------------------------------");
    }
    void deposit(double amt){
       balance = balance+amt; 
    }
    void withdraw(double amt){
       balance = balance-amt; 
    }

}
 

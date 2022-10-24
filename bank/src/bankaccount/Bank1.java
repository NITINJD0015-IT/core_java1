
package bankaccount;


public class Bank1 {
    /**
     * @param args
     */
    public static void main(String[] args){
        BankAccount1 nitin = new BankAccount1();
        BankAccount1 nayeem = new BankAccount1();
        BankAccount1.set("SBI", "540234");
        
        nitin.set(15207689,"Hk",55000);
        nitin.display();
        
        nayeem.set(152070009,"bk",69000);
        nayeem.display();
        nayeem.deposit(2000);
        
        nayeem.display();
        nayeem.withdraw(4500);
        
        nayeem.display();
    }
}

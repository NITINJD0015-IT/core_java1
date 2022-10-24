package bankaccount;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BankAccount e = new BankAccount("SBI", "540234");

        e.setAccNum(15207689);
        e.setAccHName("Hk");
        System.out.println("Enter Ammount:");
        double amt = scn.nextDouble();
        e.setBalance(amt);
        e.display();

    }
}

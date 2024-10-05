package ATMmachine;
import java.util.*;

class ATM{
    float balance;
    int PIN = 5676;

    public void checking(){
        System.out.println("Enter your PIN ");
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();

        if(enteredPIN == PIN){
            menu();
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to ATM_MACHINE");
            System.out.println("1. Check A/C balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            int opt = sc.nextInt();

            if (opt == 1) {
                checkBalance();
            } else if (opt == 2) {
                withdrawMoney();
            } else if (opt == 3) {
                depositMoney();
            } else if (opt == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
    }

    public void checkBalance(){
        System.out.println("Balance: " + balance);
    }

    public void withdrawMoney(){
        System.out.println("Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdraw successful.");
            checkBalance();
        }
    }

    public void depositMoney(){
        System.out.println("Enter amount to deposit:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        balance += amount;
        System.out.println("Deposit successful.");
        checkBalance();
    }
}

public class ATMmachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checking();
    }
}


package OOPS;

public class BankAccount {
        private int accountNumber;
        private double balance;

        // Constructor
        BankAccount(int accNo, double bal) {
            accountNumber = accNo;
            balance = bal;
        }

        // Deposit method
        public void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }

        public void display() {
            System.out.println("Account No: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    class Main {
        public static void main(String[] args) {
            BankAccount b = new BankAccount(101, 5000);

            b.deposit(1000);
            b.display();
            b.withdraw(2000);
            b.display();
        }
    }

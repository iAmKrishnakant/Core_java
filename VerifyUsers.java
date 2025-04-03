package assignment;

import java.util.Scanner;

interface BankOperations {
    float withdraw(float amount) throws InsufficientBalanceException;
    float deposit(float amount);
    void displayTransactionHistory();
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount implements BankOperations {
    private float balance;
    private float lastWithdrawAmount;
    private float lastDepositAmount;

    void setBalance(float balance) {
        this.balance = balance;
    }
    
    float getBalance() {
        return balance;
    }
    
    @Override
    public float withdraw(float amount) throws InsufficientBalanceException {
        if (balance >= amount) {
            lastWithdrawAmount = amount;
            balance -= amount;
            return balance;
        }
        throw new InsufficientBalanceException("Insufficient balance: Unable to withdraw " + amount);
    }

    @Override
    public float deposit(float amount) {
        lastDepositAmount = amount;
        balance += amount;
        return balance;
    }

    @Override
    public void displayTransactionHistory() {
        if (lastWithdrawAmount > 0) {
            System.out.println("You have withdrawn " + lastWithdrawAmount + " Rs successfully.");
        }
        if (lastDepositAmount > 0) {
            System.out.println("You have deposited " + lastDepositAmount + " Rs successfully.");
        }
    }
}

class VerifyUserDetails {
    private String name;
    private int accountId;
    private int pin;

    void setName(String name) {
        this.name = name;
    }
    
    void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    
    void setPin(int pin) {
        this.pin = pin;
    }
    
    String getName() {
        return name;
    }
    
    int getAccountId() {
        return accountId;
    }
    
    int getPin() {
        return pin;
    }
}

class BankCustomer extends UserDetails {
    private String bankName;

    void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    String getBankName() {
        return bankName;
    }
}

public class VerifyUsers {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your bank name:");
        String bankName = scanner.next();
        System.out.println("Enter account ID:");
        int accountId = scanner.nextInt();

        customer.setName(name);
        customer.setBankName(bankName);
        customer.setAccountId(accountId);

        if (customer.getBankName().equalsIgnoreCase("SBI")) {
            System.out.println("Enter your PIN:");
            int pin = scanner.nextInt();
            customer.setPin(pin);

            BankAccount bankAccount = new BankAccount();
            System.out.println("Enter your current balance:");
            float currentBalance = scanner.nextFloat();
            bankAccount.setBalance(currentBalance);

            System.out.println("Enter the amount you want to deposit:");
            float depositAmount = scanner.nextFloat();
            bankAccount.deposit(depositAmount);

            System.out.println("Enter the amount you want to withdraw:");
            float withdrawAmount = scanner.nextFloat();
            try {
				bankAccount.withdraw(withdrawAmount);
			} catch (InsufficientBalanceException e) {
				e.printStackTrace();
			}

            System.out.println("Your current balance is: " + bankAccount.getBalance());
            System.out.println("Your transaction history:");
            bankAccount.displayTransactionHistory();
        } else {
            System.out.println("You are not an SBI customer.");
        }

        scanner.close();
    }
}

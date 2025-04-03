package assignment;

// Class representing user details
class UserDetails {
    private String name;
    private int accountId;
    private int pin;

    // Setter methods
    void setName(String name) {
        this.name = name;
    }

    void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    void setPin(int pin) {
        this.pin = pin;
    }

    // Getter methods
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

// Class representing bank details that extends UserDetails
class BankDetails extends UserDetails {
    private String bankName;

    // Setter method for bank name
    void setBankName(String bankName) {
        this.bankName = bankName;
    }

    // Getter method for bank name
    String getBankName() {
        return bankName;
    }
}

// Class to verify user details
class VerifyUser {
    BankDetails bankDetails = new BankDetails();

    VerifyUser() {
        // Condition to check if the user belongs to SBI Bank
        if ("SBI".equals(bankDetails.getBankName())) { // Used .equals() for string comparison
            System.out.println("Your bank name: " + bankDetails.getBankName());
            System.out.println("Your name: " + bankDetails.getName());
        } else {
            System.out.println("This user is not a member of SBI Bank");
        }
    }

    public static void main(String[] args) {
        VerifyUser verifyUser = new VerifyUser();

        // Uncomment and set user details to test
        // verifyUser.bankDetails.setBankName("SBI");
        // verifyUser.bankDetails.setName("kk");
        // verifyUser.bankDetails.setAccountId(123456789);
        // verifyUser.bankDetails.setPin(1234);
    }
}

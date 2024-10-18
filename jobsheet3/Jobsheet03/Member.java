public class Member {

    private String id;
    private String name;
    private int limitLoan;
    private int loanAmount;

    // Constructor
    public Member(String id, String name, int limitLoan) {
        this.id = id;
        this.name = name;
        this.limitLoan = limitLoan;
        this.loanAmount = 0; // Initially, no loan
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for loan limit
    public int getLimitLoan() {
        return limitLoan;
    }

    // Getter for loan amount
    public int getLoanAmount() {
        return loanAmount;
    }

    // Method to borrow money
    public void borrow(int amount) {
        if (loanAmount + amount > limitLoan) {
            System.out.println("Sorry, the loan exceeds the limit.");
        } else {
            loanAmount += amount;
            System.out.println("Successfully borrowed: " + amount);
        }
    }

    // Method to pay installments
    public void installment(int amount) {
        // Minimum installment must be 10% of the current loan amount
        int minInstallment = (int) (loanAmount * 0.10);

        if (amount < minInstallment) {
            System.out.println("Sorry, the installment must be at least 10% of the loan amount.");
        } else if (amount > loanAmount) {
            loanAmount = 0;
            System.out.println("Installment paid in full.");
        } else {
            loanAmount -= amount;
            System.out.println("Successfully paid installment: " + amount);
        }
    }
}

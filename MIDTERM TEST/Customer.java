public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(UserProfile profile) {
        super(profile);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        if (doc.equals(".jpg") || doc.equals(".png") || doc.equals(".pdf")) {
            verificationStatus = true;
            System.out.println("Verification applied successfully.");
        } else {
            System.out.println("Invalid document format.");
        }
    }
}

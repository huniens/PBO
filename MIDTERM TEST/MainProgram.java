public class MainProgram {
    public static void main(String[] args) {
        // Create UserProfile object for Hanin Mariam
        UserProfile profile = new UserProfile(101, "password123", "Hanin Mariam", "hanin.mariam@example.com");

        // Create Customer object and demonstrate functionality
        Customer customer = new Customer(profile);
        customer.logIn(101, "password123");
        customer.applyVerification(".jpg");
        System.out.println("Customer verification status: " + customer.getVerificationStatus());
        customer.logOut();

        // Create Admin object and demonstrate functionality
        Admin admin = new Admin(profile);
        admin.logIn(101, "password123");
        admin.addVehicle("Chevrolet Chevelle SS");
        admin.updateVehicleDetails(1234);
        admin.retrieveComplaint();
        admin.verifyUser();
        admin.logOut();
    }
}

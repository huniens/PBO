public class Admin extends User {

    public Admin(UserProfile profile) {
        super(profile);
    }

    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Updating vehicle details for vehicle ID: " + vehicleId);
    }

    public void addVehicle(String vehicle) {
        System.out.println("Vehicle added: " + vehicle);
    }

    public void retrieveComplaint() {
        System.out.println("Retrieving complaints...");
    }

    public void verifyUser() {
        System.out.println("Verifying user...");
    }
}

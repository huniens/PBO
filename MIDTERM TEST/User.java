public class User {
    protected UserProfile profile;

    public User(UserProfile profile) {
        this.profile = profile;
    }

    public void logIn(int userId, String password) {
        if (this.profile.getUserId() == userId && this.profile.getPassword().equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    public void recoverPassword() {
        System.out.println("Recovering password...");
    }

    public void logOut() {
        System.out.println("User logged out.");
    }
}

public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private String email;
    private String doc; // can be .jpg, .png, .pdf

    public UserProfile(int userId, String password, String name, String email) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void editProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showDocuments() {
        System.out.println("Showing documents: " + doc);
    }
}

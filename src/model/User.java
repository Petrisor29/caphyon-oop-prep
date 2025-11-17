import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<License> licenses;

    public User(String name, String email, License license) {
        this.name = name;
        this.email = email;
        this.licenses = new ArrayList<>();
        this.licenses.add(license); // Adăugăm licența inițială
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void addLicense(License license) {
        this.licenses.add(license);
    }

    public List<License> getLicenses() {
        return licenses;
    }

    public void removeLicense(String key) {
        licenses.removeIf(license -> license.getKey().equals(key));
    }

    public List<License> getActiveLicenses() {
        List<License> active = new ArrayList<>();
        for (License lic : licenses) {
            if (!lic.isExpired()) {
                active.add(lic);
            }
        }
        return active;
    }

    public void updateEmail(String newEmail) {
        if (newEmail == null || !newEmail.contains("@") || !newEmail.contains(".")) {
            System.out.println("Invalid email format: " + newEmail);
            return;
        }

        System.out.println("Email updated from " + this.email + " to " + newEmail);
        this.email = newEmail;
    }

    @Override
    public String toString() {
        return "User: " + name + "\n"
             + "Email: " + email + "\n"
             + "Licenses: " + licenses + "\n";
    }
}

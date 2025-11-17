public class Main {
    public static void main(String[] args) {

        Product laptop = new Product("12345", "Laptop", "1.0", 1000.00);

        // două licențe pentru același produs
        License licenta1 = new License("KEY-111", "2025-12-31", laptop); // activă
        License licenta2 = new License("KEY-222", "2023-01-01", laptop); // probabil expirată

        // user cu o licență inițială
        User john = new User("John Doe", "john.doe@example.com", licenta1);

        // adăugăm a doua licență
        john.addLicense(licenta2);

        System.out.println("=== Toate licențele lui John ===");
        for (License lic : john.getLicenses()) {
            System.out.println(lic);
        }

        System.out.println("=== Licențe active ===");
        for (License lic : john.getActiveLicenses()) {
            System.out.println(lic);
        }

        // ștergem o licență după key
        john.removeLicense("KEY-222");

        System.out.println("=== După removeLicense(KEY-222) ===");
        for (License lic : john.getLicenses()) {
            System.out.println(lic);
        }

        // testăm updateEmail
        john.updateEmail("john.new@example.com");

        System.out.println("=== User final ===");
        System.out.println(john);
    }
}

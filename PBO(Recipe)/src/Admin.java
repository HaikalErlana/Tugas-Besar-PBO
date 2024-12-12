public class Admin {
    private String username;
    private String password; // Sebaiknya disimpan dalam bentuk terenkripsi
    private String email;

    public Admin(String username, String password, String email) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Email is not valid");
        }

        this.username = username;
        this.password = encryptPassword(password); // Simulasi enkripsi
        this.email = email;
    }

    private String encryptPassword(String password) {
        // Di sini Anda bisa menambahkan logika enkripsi yang sebenarnya
        return "encrypted_" + password; // Contoh sederhana
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password; // Sebaiknya tidak mengembalikan password dalam bentuk asli
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
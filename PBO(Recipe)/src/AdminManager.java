import java.util.HashMap;

public class AdminManager {
    private HashMap<String, Admin> adminList;
    private Admin currentAdmin;

    public AdminManager() {
        adminList = new HashMap<>();
        // Menambahkan admin default
        daftarAdmin("kale", "admin123", "admin@example.com");
    }

    public boolean daftarAdmin(String username, String password, String email) {
        if (adminList.containsKey(username)) {
            return false; // Username sudah ada
        }
        Admin adminBaru = new Admin(username, password, email);
        adminList.put(username, adminBaru);
        return true;
    }

    public boolean register(String username, String password) {
        if (isUsernameTaken(username)) {
            return false; // Username sudah ada
        }
        // Tambahkan admin baru ke database
        // Misalnya, Anda bisa menggunakan daftar admin yang ada
        return daftarAdmin(username, password, "default@example.com"); // Ganti dengan email yang sesuai
    }

    public boolean login(String username, String password) {
        Admin admin = adminList.get(username);
        if (admin != null && admin.getPassword().equals(password)) {
            currentAdmin = admin;
            return true;
        }
        return false;
    }

    public void logout() {
        currentAdmin = null;
    }

    public boolean isLoggedIn() {
        return currentAdmin != null;
    }

    public Admin getCurrentAdmin() {
        return currentAdmin;
    }

    public boolean isUsernameTaken(String username) {
        return adminList.containsKey(username);
    }
}
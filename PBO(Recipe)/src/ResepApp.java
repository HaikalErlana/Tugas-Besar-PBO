import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.ArrayList;

public class ResepApp extends Application {
    private DatabaseResep database;
    private AdminManager adminManager;
    private Stage primaryStage;
    private Scene mainScene, adminLoginScene, adminRegisterScene, adminDashboardScene;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        database = new DatabaseResep();
        adminManager = new AdminManager(); // Inisialisasi AdminManager

        // Set up main menu
        setupMainMenu();

        // Load CSS styles
        String cssPath = getClass().getResource("/src/styles.css") != null ? 
                         getClass().getResource("/src/styles.css").toExternalForm() : null;
        if (cssPath != null) {
            mainScene.getStylesheets().add(cssPath);
            adminLoginScene.getStylesheets().add(cssPath);
            adminRegisterScene.getStylesheets().add(cssPath);
            adminDashboardScene.getStylesheets().add(cssPath);
        }

        primaryStage.setTitle("Aplikasi Resep Masakan");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    private void setupMainMenu() {
        VBox mainLayout = new VBox(10);
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.setPadding(new Insets(20));

        Button cariResepBtn = new Button("Cari Resep");
        Button adminMenuBtn = new Button("Menu Admin");
        Button exitBtn = new Button("Keluar");

        cariResepBtn.setOnAction(e -> showSearchMenu());
        adminMenuBtn.setOnAction(e -> showAdminLogin());
        exitBtn.setOnAction(e -> primaryStage.close());

        mainLayout.getChildren().addAll(cariResepBtn, adminMenuBtn, exitBtn);
        mainScene = new Scene(mainLayout, 400, 300);
    }

    private void showSearchMenu() {
        VBox searchLayout = new VBox(10);
        searchLayout.setAlignment(Pos.CENTER);
        searchLayout.setPadding(new Insets(20));

        TextField searchField = new TextField();
        searchField.setPromptText("Masukkan bahan yang tersedia (pisahkan dengan koma)");
        Button searchBtn = new Button("Cari");
        Button backBtn = new Button("Kembali");
        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);
        resultArea.setPrefRowCount(10);

        searchBtn.setOnAction(e -> {
            String input = searchField.getText();
            String[] bahanArray = input.split(","); // Memisahkan input berdasarkan koma
            ArrayList<String> bahanTersedia = new ArrayList<>();
            for (String bahan : bahanArray) {
                bahanTersedia.add(bahan.trim()); // Menghapus spasi di sekitar bahan
            }
            ArrayList<Resep> hasil = database.cariResep(bahanTersedia);
            StringBuilder sb = new StringBuilder();
            for (Resep resep : hasil) {
                sb.append(resep.toString()).append("\n\n");
            }
            resultArea.setText(sb.toString());
        });

        backBtn.setOnAction(e -> primaryStage.setScene(mainScene));

        searchLayout.getChildren().addAll(searchField, searchBtn, resultArea, backBtn);
        Scene searchScene = new Scene(searchLayout, 400, 500);
        primaryStage.setScene(searchScene);
    }

    private void showAdminLogin() {
        VBox loginLayout = new VBox(10);
        loginLayout.setAlignment(Pos.CENTER);
        loginLayout.setPadding(new Insets(20));

        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginBtn = new Button("Login");
        Button registerBtn = new Button("Daftar");
        Button backBtn = new Button("Kembali");
        Label messageLabel = new Label("");

        loginBtn.setOnAction(e -> {
            if (adminManager.login(usernameField.getText(), passwordField.getText())) {
                showAdminDashboard();
            } else {
                messageLabel.setText("Login gagal!");
            }
        });

        registerBtn.setOnAction(e -> showAdminRegister());
        backBtn.setOnAction(e -> primaryStage.setScene(mainScene));

        loginLayout.getChildren().addAll(
            new Label("Admin Login"),
            usernameField, 
            passwordField, 
            loginBtn, 
            registerBtn, 
            backBtn, 
            messageLabel
        );

        adminLoginScene = new Scene(loginLayout, 400, 400);
        primaryStage.setScene(adminLoginScene);
    }

    private void showAdminRegister() {
        VBox registerLayout = new VBox(10);
        registerLayout.setAlignment(Pos.CENTER);
        registerLayout.setPadding(new Insets(20));
    
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        Button registerBtn = new Button("Daftar");
        Button backBtn = new Button("Kembali");
        Label messageLabel = new Label("");
    
        registerBtn.setOnAction(e -> {
            if (adminManager.register(usernameField.getText(), passwordField.getText())) {
                messageLabel.setText("Pendaftaran berhasil!");
            } else {
                messageLabel.setText("Pendaftaran gagal!");
            }
        });
    
        backBtn.setOnAction(e -> primaryStage.setScene(adminLoginScene));
    
        registerLayout.getChildren().addAll(
            new Label("Admin Daftar"),
            usernameField,
            passwordField,
            registerBtn,
            backBtn,
            messageLabel
        );
    
        adminRegisterScene = new Scene(registerLayout, 400, 400);
        primaryStage.setScene(adminRegisterScene);
    }

    private void showAdminDashboard() {
        VBox dashboardLayout = new VBox(10);
        dashboardLayout.setAlignment(Pos.CENTER);
        dashboardLayout.setPadding(new Insets(20));

        Label welcomeLabel = new Label("Selamat datang di Dashboard Admin");
        Button logoutBtn = new Button("Logout");

        logoutBtn.setOnAction(e -> primaryStage.setScene(adminLoginScene));

        dashboardLayout.getChildren().addAll(welcomeLabel, logoutBtn);
        adminDashboardScene = new Scene(dashboardLayout, 400, 400);
        primaryStage.setScene(adminDashboardScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
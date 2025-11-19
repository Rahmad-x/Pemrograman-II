module PRAKTIKUM6 {
    requires javafx.controls;
    requires javafx.fxml;
    
    // Buka akses package ke JavaFX
    opens PRAKTIKUM6.application to javafx.graphics, javafx.fxml;
    opens PRAKTIKUM6.controller to javafx.fxml;
    opens PRAKTIKUM6.kelas to javafx.base;
}
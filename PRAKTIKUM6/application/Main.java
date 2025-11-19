package PRAKTIKUM6.application; // Sesuaikan dengan nama folder

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
            // Pastikan Anda juga sudah membuat package 'PRAKTIKUM6.view' dan file FXML-nya
            // Jika file FXML ada di folder view, path-nya: /PRAKTIKUM6/view/ViewTable.fxml
			Parent root = FXMLLoader.load(getClass().getResource("/PRAKTIKUM6/view/ViewTable.fxml"));
			Scene scene = new Scene(root);
			
			primaryStage.setTitle("Praktikum 6");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
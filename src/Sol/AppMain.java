package Sol;

import java.awt.Toolkit;

import javax.swing.JFrame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
		Parent root = loader.load();
		RootController controller = loader.getController();
		controller.setPrimaryStage(primaryStage);

		Scene scene = new Scene(root);
		primaryStage.setTitle("Sol");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();	

	}

	public static void main(String[] args) {
		launch(args);
	}

}

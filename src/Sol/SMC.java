package Sol;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SMC implements Initializable {
	@FXML
	private Button Home;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Home.setOnAction(e -> HomeAction(e));

	}

	public void HomeAction(ActionEvent event) {

		System.out.println("asdf");
		try {
			Parent main = FXMLLoader.load(getClass().getResource("Main.fxml"));
			System.out.println("asdferf");
			Scene scene =new Scene(main);
			Stage primaryStage =(Stage)Home.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

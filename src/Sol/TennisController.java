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
import javafx.stage.Stage;

public class TennisController implements Initializable {
	@FXML
	private Button Home;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Home.setOnAction(e -> HomeAction(e));

	}

	public void HomeAction(ActionEvent event) {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene =new Scene(main);
			Stage primaryStage =(Stage)Home.getScene().getWindow();
			primaryStage.setScene(scene);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

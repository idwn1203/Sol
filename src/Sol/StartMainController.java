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

public class StartMainController implements Initializable {
	@FXML
	private Button Study;
	@FXML
	private Button Tennis;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Study.setOnAction(e -> StudyAction(e));
		Tennis.setOnAction(e -> TennisAction(e));
	}

	public void StudyAction(ActionEvent event) {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("Study_Main.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) Study.getScene().getWindow();
			primaryStage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void TennisAction(ActionEvent event) {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("Tennis_main.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) Tennis.getScene().getWindow();
			primaryStage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

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
	private Button Schedule;
	@FXML
	private Button Tennis;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Schedule.setOnAction(e -> ScheduleAction(e));
		Tennis.setOnAction(e -> TennisAction(e));
	}

	public void ScheduleAction(ActionEvent event) {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) Schedule.getScene().getWindow();
			primaryStage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void TennisAction(ActionEvent event) {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("Tennis_main.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) Schedule.getScene().getWindow();
			primaryStage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

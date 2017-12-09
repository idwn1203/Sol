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

public class TMController implements Initializable {
	
	@FXML
	private Button Previous;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Previous.setOnAction(e -> ScheduleAction(e));
	}

	public void ScheduleAction(ActionEvent event) {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("StartMain.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) Previous.getScene().getWindow();
			primaryStage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package Sol;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TMController implements Initializable {

	@FXML
	private Button Previous;
	@FXML
	private Button Rule;
	@FXML
	private Button Court;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Previous.setOnAction(e -> ScheduleAction(e));
		Rule.setOnAction(e -> RuleAction(e));
		Court.setOnAction(e -> CourtAction(e));
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

	public void RuleAction(ActionEvent event) {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(Rule.getScene().getWindow());
		dialog.setTitle("Rule");
		Parent parent = null;
		try {
			parent = FXMLLoader.load(getClass().getResource("Tennis_Rule.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Button Home = (Button) parent.lookup("#Home");
		Home.setOnAction(e -> dialog.close());

		Scene scene = new Scene(parent);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();

	}

	public void CourtAction(ActionEvent event) {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(Court.getScene().getWindow());
		dialog.setTitle("Court State");
		Parent parent = null;
		try {
			parent = FXMLLoader.load(getClass().getResource("Tennis_CM.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Button Home = (Button) parent.lookup("#Home");
		Home.setOnAction(e -> dialog.close());

		Scene scene = new Scene(parent);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();

	}

}

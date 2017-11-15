package Sol;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CheckScoreControl {
	@FXML
	private Button btnAdd;
	@FXML
	private Button btnScore;
	@FXML
	private Button btnExit;

	public void initialize(URL location, ResourceBundle resources) {

		btnAdd.setOnAction(e -> btnAddAction(e));
		btnScore.setOnAction(e -> btnScoreAction(e));
		btnExit.setOnAction(e -> btnExitAction(e));
	}

	public void btnAddAction(ActionEvent event) {

	}

	public void btnScoreAction(ActionEvent event) {

	}

	public void btnExitAction(ActionEvent event) {

	}

}

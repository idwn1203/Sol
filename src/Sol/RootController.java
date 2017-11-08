package Sol;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class RootController implements Initializable {
	@FXML
	private Button CheckTime;
	@FXML
	private Button CheckTest;
	@FXML
	private Button CheckScore;

	private ObservableList<Subject> list;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// list =FXCollections.observableArrayList(new Subject ("°´Ã¼",2,3));
		 CheckTime.setOnAction(event->handleCheckTime(event));
	}

	public void handleCheckTime(ActionEvent e) {
		try {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(CheckTime.getScene().getWindow());
		dialog.setTitle("CheckTime");
		Parent parent = FXMLLoader.load(getClass().getResource("CheckTime.fxml"));
	
	}

}

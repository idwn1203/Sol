package Sol;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
	@FXML
	private TableView<Subject> tableView;

	//private Stage primaryStage;
	private ObservableList<Subject> list;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		//tableView.setItems(list);
		CheckTime.setOnAction(event -> handleCheckTimeAction(event));
		CheckTest.setOnAction(event -> handleCheckTestAction(event));
		CheckScore.setOnAction(event -> handleCheckScoreAction(event));
	}

	public void setPrimaryStage(Stage primaryStage) {
		//this.primaryStage = primaryStage;
	}

	public void handleCheckTimeAction(ActionEvent event){
		System.out.println("창띄우자 클릭");
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(CheckTime.getScene().getWindow());
			dialog.setTitle("확인");
			Parent parent = FXMLLoader.load(getClass().getResource("CheckTime.fxml"));
			TableView tableView = (TableView) parent.lookup("#tableViewr");
			Button btnAdd = (Button) parent.lookup("#btnAdd");
			dialog.close();
	
			Scene scene = new Scene(parent);

			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {}
	}

	public void handleCheckTestAction(ActionEvent event) {
		System.out.println("시험일정클릭");
	}

	public void handleCheckScoreAction(ActionEvent event) {
		System.out.println("학점확인 클릭");
	}
}

/*
 * public void handleCheckTime(ActionEvent event) { try { Stage dialog = new
 * Stage(StageStyle.UTILITY); dialog.initModality(Modality.WINDOW_MODAL);
 * dialog.initOwner(CheckTime.getScene().getWindow());
 * dialog.setTitle("CheckTime"); Parent parent =
 * FXMLLoader.load(getClass().getResource("CheckTime.fxml"));
 * 
 * 
 * Button btnClose = (Button) parent.lookup("#btnClose");
 * btnClose.setOnAction(e->dialog.close()); Scene scene = new Scene(parent);
 * dialog.setScene(scene); dialog.show(); }catch(IOException e) {}
 * 
 * }
 */

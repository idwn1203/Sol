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
	//private ObservableList<Subject> list;
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		CheckTime.setOnAction(event -> {
			try {
				handleCheckTimeAction(event);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		CheckTest.setOnAction(event -> {
			try {
				handleCheckTestAction(event);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		CheckScore.setOnAction(event -> {
			try {
				handleCheckScoreAction(event);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	public void setPrimaryStage(Stage primaryStage) {
		//this.primaryStage = primaryStage;
	}

	public void handleCheckTimeAction(ActionEvent event) throws IOException{
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(CheckTime.getScene().getWindow());
			dialog.setTitle("Ȯ��");

			Parent parent = FXMLLoader.load(getClass().getResource("CheckTime.fxml"));
			
			//TableView tableView = (TableView) parent.lookup("#tableViewr");
			
			//Button btnAdd = (Button) parent.lookup("#btnAdd");
			//dialog.close();
			
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
	}

	public void handleCheckTestAction(ActionEvent event) throws IOException {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(CheckTime.getScene().getWindow());
		dialog.setTitle("Ȯ��");

		Parent parent = FXMLLoader.load(getClass().getResource("CheckTest.fxml"));
		
		//TableView tableView = (TableView) parent.lookup("#tableViewr");
		
		//Button btnAdd = (Button) parent.lookup("#btnAdd");
		//dialog.close();
		
		Scene scene = new Scene(parent);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}

	public void handleCheckScoreAction(ActionEvent event)throws IOException {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(CheckTime.getScene().getWindow());
		dialog.setTitle("Ȯ��");

		Parent parent = FXMLLoader.load(getClass().getResource("CheckScore.fxml"));
		
		//TableView tableView = (TableView) parent.lookup("#tableViewr");
		
		//Button btnAdd = (Button) parent.lookup("#btnAdd");
		//dialog.close();
		
		Scene scene = new Scene(parent);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
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

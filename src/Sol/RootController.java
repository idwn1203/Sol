package Sol;

import java.io.IOException;
import java.io.File;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Popup;
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		CheckTime.setOnAction(event -> {
//			try {
//				handleCheckTimeAction(event);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("helo");
		});
		CheckTest.setOnAction(event -> handleCheckTestAction(event));
		CheckScore.setOnAction(event -> handleCheckScoreAction(event));
	}

	private Stage primaryStage;

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	public void handleCheckTimeAction(ActionEvent e) throws Exception {

		System.out.println("창띄우자 클릭");
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("공부시간확인");
		
//		Parent parent = FXMLLoader.load(getClass().getResource("CheckTime.fxml"));
//		//Label txtTitle = (Label) parent.lookup("#txtTitle");
//		//txtTitle.setText("확인하셨습니까?");
////		Button btnAdd2 = (Button) parent.lookup("#btnAdd2");
////		btnAdd2.setOnAction(event->dialog.close());
//		Button btnAdd1 = (Button) parent.lookup("#btnAdd1");
////		btnAdd1.setOnAction(event->dialog.close());
//		Button btnAdd = (Button) parent.lookup("#btnAdd");
////		btnAdd.setOnAction(event->dialog.close());
////		Button btnAdd11 = (Button) parent.lookup("#btnAdd11");
////		btnAdd11.setOnAction(event->dialog.close());
//		
////		TableView tableView =(TableView) parent.lookup("#tableView");
//		Scene scene = new Scene(parent);
//		dialog.setScene(scene);
//		dialog.setResizable(false);
//		dialog.show();
		
//		Stage dialog = new Stage(StageStyle.UTILITY);
//		dialog.initModality(Modality.WINDOW_MODAL);
//		dialog.initOwner(primaryStage);
//		dialog.setTitle("확인");
		
		Parent parent = FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
		Label txtTitle = (Label) parent.lookup("#txtTitle");
		txtTitle.setText("확인하셨습니까?");
		Button btnOk = (Button) parent.lookup("#btnOk");
		btnOk.setOnAction(event->dialog.close());	
		Scene scene = new Scene(parent);
		
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}

	public void handleCheckTestAction(ActionEvent event) {
		System.out.println("시험일정클릭");
	}

	public void handleCheckScoreAction(ActionEvent event) {
		System.out.println("학점확인 클릭");
	}
	
	
}

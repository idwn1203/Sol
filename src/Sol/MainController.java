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
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class MainController implements Initializable {

	@FXML
	private Button CheckTime;
	@FXML
	private Button CheckTest;
	@FXML
	private Button CheckScore;
	@FXML
	private Button Home;
	@FXML
	private Button Back;
	@FXML
	private Button Add;

	@FXML

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

		Home.setOnAction(e -> homeAction(e));
	}

	public void homeAction(ActionEvent event) {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("StartMain.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) Home.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void handleCheckTimeAction(ActionEvent event) throws IOException {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(CheckTime.getScene().getWindow());
		dialog.setTitle("공부시간확인");
		Parent parent = FXMLLoader.load(getClass().getResource("CheckTime.fxml"));

		Button Home = (Button) parent.lookup("#Home");
		Home.setOnAction(e -> dialog.close());

		Scene scene = new Scene(parent);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();

	}

	public void handleCheckTestAction(ActionEvent event) throws IOException {
		Stage dialog = new Stage(StageStyle.UTILITY);
		// 다이얼로그 생성
		dialog.initModality(Modality.WINDOW_MODAL);
		// 윈도우창 모델설정
		dialog.initOwner(CheckTime.getScene().getWindow());
		// 윈도우창 띄우기
		dialog.setTitle("확인");
		// dialog제목
		Parent parent = FXMLLoader.load(getClass().getResource("CheckTest.fxml"));
		// fxml로딩
		Scene scene = new Scene(parent);
		// 새로운 Parent로 Scene 만들기
		Button Home = (Button) parent.lookup("#Home");
		// 홈버튼 controller와 fxml 연결
		Home.setOnAction(e -> dialog.close());
		// 홈 버튼으로 다이얼로그 닫기 등록

		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();

	}

	public void handleCheckScoreAction(ActionEvent event) throws IOException {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(CheckTime.getScene().getWindow());
		dialog.setTitle("확인");
		Parent parent = FXMLLoader.load(getClass().getResource("CheckScore.fxml"));

		Button Home = (Button) parent.lookup("#btnExit");
		Home.setOnAction(e -> dialog.close());

		Scene scene = new Scene(parent);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}

}

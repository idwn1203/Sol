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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CheckScoreControl implements Initializable {
	@FXML
	private Button btnAdd;
	@FXML
	private Button btnScore;
//	@FXML
//	private double Avg;
	
	@FXML
	private TableView<Score> tableView;

	private ObservableList<Score> list;
	private double avg;
	
	public void initialize(URL location, ResourceBundle resources) {
		list = FXCollections.observableArrayList(
				new Score("프로그래밈 기초", 3, 3.5, 3, 2017, 1),
				new Score("객체", 3, 4.5, 6, 2017, 1),
				new Score("마이크로프로세서2", 3, 4, 5, 2017, 1));

		TableColumn tc = tableView.getColumns().get(0);
		tc.setCellValueFactory(new PropertyValueFactory("name"));
		tc.setStyle("-fx-alignment: CENTER;");

		tc = tableView.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory("AssignScore"));
		tc.setStyle("-fx-alignment: CENTER;");

		tc = tableView.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory("GetScore"));
		tc.setStyle("-fx-alignment: CENTER;");

		tc = tableView.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory("SubjectGetScore"));
		tc.setStyle("-fx-alignment: CENTER;");

		tc = tableView.getColumns().get(4);
		tc.setCellValueFactory(new PropertyValueFactory("Year"));
		tc.setStyle("-fx-alignment: CENTER;");

		tc = tableView.getColumns().get(5);
		tc.setCellValueFactory(new PropertyValueFactory("Grade"));
		tc.setStyle("-fx-alignment: CENTER;");

		tableView.setItems(list);
		// 테이블 뷰 셋팅
		btnAdd.setOnAction(e -> btnAddAction(e));
		// 버튼 활성화
		btnScore.setOnAction(e -> btnScoreAction(e));
		
	}

	public void btnAddAction(ActionEvent event) {
		// 추가 버튼 기능 구현
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(btnAdd.getScene().getWindow());
			dialog.setTitle("추가");
			Parent parent = FXMLLoader.load(getClass().getResource("AddScoreForm.fxml"));
			Button btnFormAdd = (Button) parent.lookup("#btnFormAdd");
			btnFormAdd.setOnAction(e -> {
				TextField txtName = (TextField) parent.lookup("#txtName");
				TextField txtAssignScore = (TextField) parent.lookup("#txtAssignScore");
				TextField txtGetScore = (TextField) parent.lookup("#txtGetScore");
				TextField txtSubjectGetScore = (TextField) parent.lookup("#txtSubjectGetScore");
				TextField txtYear = (TextField) parent.lookup("#txtYear");
				TextField txtGrade = (TextField) parent.lookup("#txtGrade");
				list.add(new Score(txtName.getText(), Integer.parseInt(txtAssignScore.getText()),
						Integer.parseInt(txtGetScore.getText()), Integer.parseInt(txtSubjectGetScore.getText()),
						Integer.parseInt(txtYear.getText()), Integer.parseInt(txtGrade.getText())));
				dialog.close();
			});

			Button btnFormCancel = (Button) parent.lookup("#btnFormCancel");
			btnFormCancel.setOnAction(e -> dialog.close());

			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {
		}
	}

	public void btnScoreAction(ActionEvent event) {		
		CalcAverage();
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(btnAdd.getScene().getWindow());
			dialog.setTitle("추가");
			Parent parent = FXMLLoader.load(getClass().getResource("AverageScore.fxml"));	
			Label Avg =(Label)parent.lookup("#Avg");
			Avg.setText(avg+"");
			Button Home = (Button) parent.lookup("#Home");
			Home.setOnAction(e -> dialog.close());
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {
		}
	}
	
	public void CalcAverage() {
		avg=0.0;
		for (int i = 0; i < list.size(); i++) {
			avg += ((double) list.get(i).getGetScore());
			System.out.println(avg);
		}
		avg=avg/list.size();
	}
}

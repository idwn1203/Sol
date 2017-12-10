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
	@FXML
	private TableView<Score> tableView;

	private ObservableList<Score> list;

	public void initialize(URL location, ResourceBundle resources) {
		list = FXCollections.observableArrayList(
				new Score("���α׷��� ����", 3, 3.5, 3, 2017, 1),
				new Score("����ũ�����μ���2", 3, 3, 3, 2017, 1));

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
		// ���̺� �� ����
		btnAdd.setOnAction(e -> btnAddAction(e));
		// ��ư Ȱ��ȭ

		btnScore.setOnAction(e -> btnScoreAction(e));
	}

	public void btnAddAction(ActionEvent event) {
		// �߰� ��ư ��� ����
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(btnAdd.getScene().getWindow());
			dialog.setTitle("�߰�");
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

	}

}

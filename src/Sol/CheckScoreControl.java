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
//		 list = FXCollections.observableArrayList(
//		 new Score("객체","왜죵",171120)
//		 );
//
//		 TableColumn tc = tableView.getColumns().get(0);
//		 tc.setCellValueFactory(new PropertyValueFactory("name"));
//		 tc.setStyle("-fx-alignment: CENTER;");
//		
//		 tc = tableView.getColumns().get(1);
//		 tc.setCellValueFactory(new PropertyValueFactory("range"));
//		 tc.setStyle("-fx-alignment: CENTER;");
//		
//		 tc = tableView.getColumns().get(2);
//		 tc.setCellValueFactory(new PropertyValueFactory("day"));
//		 tc.setStyle("-fx-alignment: CENTER;");
//
//		tableView.setItems(list);
//		// 테이블 뷰 셋팅
//		btnAdd.setOnAction(e -> btnAddAction(e));
//		// 버튼 활성화
	}

	public void btnAddAction(ActionEvent event) {
		// 추가 버튼 기능 구현
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(btnAdd.getScene().getWindow());
			dialog.setTitle("추가");
			Parent parent = FXMLLoader.load(getClass().getResource("AddScoreForm.fxml"));
			Button btnFormAdd = (Button) parent.lookup("#btnAdd");
			btnFormAdd.setOnAction(e -> {
				TextField txtName = (TextField) parent.lookup("#txtName");
				TextField txtRange = (TextField) parent.lookup("#txtRange");
				TextField txtDay = (TextField) parent.lookup("#txtDay");
				// list.add(new Test(
				// txtName.getText(),
				// txtRange.getText(),
				// Integer.parseInt(txtDay.getText())
				// ));
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

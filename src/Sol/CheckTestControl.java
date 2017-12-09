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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CheckTestControl implements Initializable {
	@FXML
	private Button Add;
	@FXML private TableView<Test> tableView;
	
	private ObservableList<Test> list;
	private Node a;
@Override
	public void initialize(URL location, ResourceBundle resources) {
		list = FXCollections.observableArrayList(
				new Test("객체","~24",171120),
				new Test("컴퓨터그래","배운대까지",171120),
				new Test("","왜죵",171120)
		);
		Add.setOnAction(e -> AddAction(e));
	

	TableColumn tc = tableView.getColumns().get(0);
	tc.setCellValueFactory(new PropertyValueFactory("name"));
	tc.setStyle("-fx-alignment: CENTER;");
	
	tc = tableView.getColumns().get(1);
	tc.setCellValueFactory(new PropertyValueFactory("range"));
	tc.setStyle("-fx-alignment: CENTER;");
	
	tc = tableView.getColumns().get(2);
	tc.setCellValueFactory(new PropertyValueFactory("day"));
	tc.setStyle("-fx-alignment: CENTER;");
	
	tableView.setItems(list);
	
}
	
	public void AddAction(ActionEvent event) {
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(Add.getScene().getWindow());
			dialog.setTitle("추가");

			Parent parent = FXMLLoader.load(getClass().getResource("CTCForm.fxml"));
			Button btnFormAdd = (Button) parent.lookup("#btnFormAdd");
			btnFormAdd.setOnAction(e -> {
				TextField txtName = (TextField) parent.lookup("#txtName");
				TextField txtRange = (TextField) parent.lookup("#txtRange");
				TextField txtDay = (TextField) parent.lookup("#txtDay");
				list.add(new Test(
						txtName.getText(),
						txtRange.getText(),
						Integer.parseInt(txtDay.getText())
				));
				dialog.close();
			});
			Button btnFormCancel = (Button) parent.lookup("#btnFormCancel");
			btnFormCancel.setOnAction(e->dialog.close());
			
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {
		}
	}

}

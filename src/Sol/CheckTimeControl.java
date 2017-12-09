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
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CheckTimeControl implements Initializable {
	@FXML
	private Button Home;
	@FXML
	private Button Add;
	@FXML
	private Button Start;
	@FXML
	private Button Pause;
	@FXML
	private Button Stop;
	@FXML
	private TableView<Time> tableView;

	private ObservableList<Time> list;
	private ProgressIndicator progressIndicator;
	int i=0;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		list = FXCollections.observableArrayList(new Time("°´Ã¼", 2, 0));

		Add.setOnAction(e -> AddAction(e));
		TableColumn tc = tableView.getColumns().get(0);
		tc.setCellValueFactory(new PropertyValueFactory("name"));
		tc.setStyle("-fx-alignment: CENTER;");

		tc = tableView.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory("goal"));
		tc.setStyle("-fx-alignment: CENTER;");

		
		tableView.setItems(list);
		Start.setOnAction(e -> StartAct(e));
		Pause.setOnAction(e -> PauseAct(e));
		Stop.setOnAction(e -> StopAct(e));

	}

	public void AddAction(ActionEvent event) {
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(Add.getScene().getWindow());
			dialog.setTitle("Ãß°¡");

			Parent parent = FXMLLoader.load(getClass().getResource("AddSubject.fxml"));
			Button btnFormAdd =(Button) parent.lookup("#btnFormAdd");
			btnFormAdd.setOnAction(e -> {
				TextField txtName = (TextField) parent.lookup("#txtName");
				TextField txtGoal = (TextField) parent.lookup("#txtGoal");
				list.add(new Time(
						txtName.getText(),
						Integer.parseInt(txtGoal.getText())
				));
				
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

	
	public void StartAct(ActionEvent event) {
		
	}

	public void PauseAct(ActionEvent event) {
		
	}
	public void StopAct(ActionEvent event) {
		progressIndicator.setProgress(1.0);	
	}

}

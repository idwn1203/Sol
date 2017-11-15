package Sol;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

public class CheckTestControl implements Initializable {
	@FXML
	private Button Add;
	
	

	public void initialize(URL location, ResourceBundle resources) {
		Add.setOnAction(e -> AddAction(e));
	}

	public void AddAction(ActionEvent event) {
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(Add.getScene().getWindow());
			dialog.setTitle("Ãß°¡");

			Parent parent = FXMLLoader.load(getClass().getResource("CTCForm.fxml"));
			Button btnFormAdd = (Button) parent.lookup("#btnFormAdd");
			Add.setOnAction(e -> {
				TextField txtName = (TextField) parent.lookup("#txtName");
				TextField txtRange = (TextField) parent.lookup("#txtKorean");
				TextField txtDay = (TextField) parent.lookup("#txtMath");
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

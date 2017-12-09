package Sol;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Giveaway implements Initializable{

	@FXML
	private Label num;
	@FXML
	private Button OneMore;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		OneMore.setOnAction(e -> OneMoreAction(e));
	}
	

	public void OneMoreAction(ActionEvent event) {
		int number;
		number = (int)(Math.random()*40);
		num.setText(number+"¹ø");
		
	}
}

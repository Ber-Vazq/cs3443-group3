package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Interlude1Controller extends LevelController{
	
	@FXML
	Button weapon;
	
	@FXML
	Button armor;
	
	@FXML
	Label stage;
	
	public void weaponIncrease(ActionEvent event) throws IOException {
		ATKChoice++;
		level++;
		Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/level1.fxml"));// pane you are GOING TO
        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
	}
	
	public void armorIncrease(ActionEvent event) throws IOException {
		HPChoice++;
		level++;
		Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/level1.fxml"));// pane you are GOING TO
        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
	}
}

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
	/*
	 * okay so we named this an interlude, but its just a simple level up screen
	 * we figured that it would be more fair to do this than to scale it exponentially and make it too easy
	 */
	
	@FXML
	Button weapon;
	
	@FXML
	Button armor;
	
	@FXML
	Label stage;
	/*
	 * weapon increase, does as it says on the tin and same for armorIncrease, except armor is really health.
	 * also if you couldn't tell we did just copy and paste the button event and then changed the scene name.
	 */
	
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

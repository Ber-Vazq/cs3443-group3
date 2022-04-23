package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClassSelectController extends Main {

	public static int job;
	/*
	 * okay so the sami job is the samurai class, techno is the technopath, and mage is mage
	 * each class has its own upsides and everything but we mainly just use this controller for the choosing and then moving on
	 * as you can see each one does the same job of moving on to level 1
	 */
	@FXML
	void samiJob(ActionEvent event) throws IOException {
		 job = 1;
		 Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/level1.fxml"));// pane you are GOING TO
         Scene scene = new Scene(mainPane2);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
         window.setScene(scene);
         window.show();
	}

	@FXML
	void TechnopathJob(ActionEvent event) throws IOException {
		 job = 2;
		 Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/level1.fxml"));// pane you are GOING TO
         Scene scene = new Scene(mainPane2);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
         window.setScene(scene);
         window.show();
	}
	
	@FXML
	void MageJob(ActionEvent event) throws IOException {
		 job = 3;
		 Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/level1.fxml"));// pane you are GOING TO
         Scene scene = new Scene(mainPane2);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
         window.setScene(scene);
         window.show();
	}
}

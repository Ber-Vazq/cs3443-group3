package application;



import java.io.IOException;
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;





public class ClassSelectController extends Main {

	
	public int job;
	
	 @FXML
	    
		private AnchorPane mainPane2;
		
	public ClassSelectController() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@FXML
	void samiJob(ActionEvent event) throws IOException {
		job = 1;
		 mainPane2 = FXMLLoader.load(getClass().getResource("fight.fxml"));// pane you are GOING TO
         Scene scene = new Scene(mainPane2);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
         window.setScene(scene);
         window.show();
	}

	@FXML
	void RiggerJob(ActionEvent event) throws IOException {
		job = 2;
		 mainPane2 = FXMLLoader.load(getClass().getResource("fight.fxml"));// pane you are GOING TO
         Scene scene = new Scene(mainPane2);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
         window.setScene(scene);
         window.show();
	}
	
	@FXML
	void MageJob(ActionEvent event) throws IOException {
		job = 3;
		 mainPane2 = FXMLLoader.load(getClass().getResource("fight.fxml"));// pane you are GOING TO
         Scene scene = new Scene(mainPane2);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
         window.setScene(scene);
         window.show();
	}





	
	
	
}

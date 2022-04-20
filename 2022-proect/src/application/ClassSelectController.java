package application;



import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;





public class ClassSelectController extends Main {

	
	public static int job;
	    
		
	public ClassSelectController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@FXML
	void samiJob(ActionEvent event) throws IOException {
		 job = 1;
		 //System.out.println("Choosing samurai job");
		 Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/fight.fxml"));// pane you are GOING TO
         Scene scene = new Scene(mainPane2);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
         window.setScene(scene);
         window.show();
	}

	@FXML
	void RiggerJob(ActionEvent event) throws IOException {
		 job = 2;
		 //System.out.println("Choosing rigger job");
		 Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/fight.fxml"));// pane you are GOING TO
         Scene scene = new Scene(mainPane2);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
         window.setScene(scene);
         window.show();
	}
	
	@FXML
	void MageJob(ActionEvent event) throws IOException {
		 job = 3;
		 //System.out.println("Choosing mage job");
		 Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/fight.fxml"));// pane you are GOING TO
         Scene scene = new Scene(mainPane2);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
         window.setScene(scene);
         window.show();
	}





	
	
	
}

/**
 * bernardo
 */
package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Button creditScene;

    @FXML
    private Button gameButton;

    @FXML
    private AnchorPane rogueMain;

    @FXML
    private ImageView rogueMainPic;

    @FXML
    void openCredits(ActionEvent event) throws IOException {    	
    rogueMain = FXMLLoader.load(getClass().getClassLoader().getResource("Credits.fxml"));
    Scene scene = new Scene(rogueMain);//window im going to 
    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();//window im in
    window.setScene(scene);
    }

    @FXML
    void playGame(ActionEvent event) throws IOException {
        rogueMain = FXMLLoader.load(getClass().getClassLoader().getResource("class.fxml"));
        Scene scene = new Scene(rogueMain);//window im going to 
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();//window im in
        window.setScene(scene);
    }

}

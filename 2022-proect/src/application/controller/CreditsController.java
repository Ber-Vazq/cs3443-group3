package application.controller;

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

public class CreditsController {
	/*
	 *this controls the backToMenu button and is the screen where each member is given credit for the biggest contribution they made to the game
	 */
    @FXML
    private Button backButton;

    @FXML
    private AnchorPane creditsAnchor;

    @FXML
    private ImageView creditsPic;

    @FXML
    void backToMenu(ActionEvent event) throws IOException {
        creditsAnchor = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/mainMenu.fxml"));
        Scene scene = new Scene(creditsAnchor);//window im going to 
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();//window im in
        window.setScene(scene);
    }

}

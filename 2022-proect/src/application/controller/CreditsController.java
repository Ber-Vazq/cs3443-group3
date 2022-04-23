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
	 * credits screen
	 * this is the scene where we give credit to each member for their largest contribution to the project
	 * 
	 * includes a back to menu button
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

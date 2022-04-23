package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LevelController implements Initializable{
	
	@FXML
	Label enemy1HP;
	
	@FXML
	Label enemy2HP;
	
	@FXML
	Label enemy3HP;
	
	@FXML
	Label playerHP;
	
	@FXML
	Label gameOver;
	
	@FXML
	Label stage;
	
	@FXML
	Button enemy1Attack;
	
	@FXML
	Button enemy2Attack;
	
	@FXML
	Button enemy3Attack;
	
	@FXML
	Button nextLevelButton;
	
	@FXML
	Button menuButton;
	
	@FXML
	ImageView enemy1;
	
	@FXML
	ImageView enemy2;
	
	@FXML
	ImageView enemy3;

	Random rand = new Random();
	static int playerHealth = 500; // tracks player health across levels
	static int level = 0; // tracks level progress
	int enemy1Health; //used to update health of monster across levels
	int enemy2Health; //^
	int enemy3Health; //^^
	int tankMaxHP; //may need to be static
	int dpsMaxHP; //^
	int dps2MaxHP;
	static int playerMaxHP = 500;
	int attackRoll;
	int damageDoneToPlayer1;
	int damageDoneToPlayer2;
	int damageDoneToPlayer3;
	static int HPChoice = 0;
	static int ATKChoice = 0;
	
	public void enemy1Press(ActionEvent event) {
		
		if (!(playerHealth <= 0)) {
			playerHP.setText(String.valueOf(playerHealth) + "/" + String.valueOf(playerMaxHP));
			
			attackRoll = rand.nextInt(50 + 3*ATKChoice) + 2*level;
			System.out.println(attackRoll);
			damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
			damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
			damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
			enemy1Health = enemy1Health - attackRoll;
			enemy1HP.setText(String.valueOf(enemy1Health) + "/" + String.valueOf(dpsMaxHP));
			
			if (enemy1Health != 0) {
				playerHealth = playerHealth - damageDoneToPlayer1;
				playerHP.setText(String.valueOf(playerHealth) + "/" + String.valueOf(playerMaxHP));
			} 
			if (enemy2Health != 0) {
				playerHealth = playerHealth - damageDoneToPlayer2;
				playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			}
			if (enemy3Health != 0) {
				playerHealth = playerHealth - damageDoneToPlayer3;
				playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			}
				
			
			
		}
		
		if (playerHealth <= 0 || enemy1Health <= 0) {
			if (playerHealth <= 0) {
				playerHP.setText("Dead");
				playerHealth = playerMaxHP;
				gameOver.setVisible(true);
				menuButton.setVisible(true);
				enemy3Attack.setDisable(true);
				enemy2Attack.setDisable(true);
				enemy1Attack.setDisable(true);
			} 
			
			if (enemy1Health <= 0) {
				enemy1Attack.setDisable(true);
				enemy1Attack.setText("Enemy 1 Dead");
				enemy1.setOpacity(0.25);
				enemy1HP.setText("Dead");
			}
		}
		
		if (enemy1Health <= 0 && enemy2Health <= 0 && enemy3Health <= 0) {
			nextLevelButton.setDisable(false);
			nextLevelButton.setVisible(true);
			//level++;
			playerHealth += (level + 1) * 20;
		}
		
	}

	public void enemy2Press(ActionEvent event) {
		if (!(playerHealth <= 0)) {
			playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			attackRoll = rand.nextInt(50 + 3*ATKChoice) + 2*level;
			System.out.println(attackRoll);
			damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
			damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
			damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
			
			enemy2Health = enemy2Health - attackRoll;
			enemy2HP.setText(String.valueOf(enemy2Health) + "/" + String.valueOf(tankMaxHP));
			
			if (enemy1Health != 0) {
				playerHealth = playerHealth - damageDoneToPlayer1;
				playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			} 
			if (enemy2Health != 0) {
				playerHealth = playerHealth - damageDoneToPlayer2;
				playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			}
			if (enemy3Health != 0) {
				playerHealth = playerHealth - damageDoneToPlayer3;
				playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			}
				
			
			
		}
		
		if (playerHealth <= 0 || enemy2Health <= 0) {
			if (playerHealth <= 0) {
				playerHP.setText("Dead");
				gameOver.setVisible(true);
				playerHealth = playerMaxHP;
				menuButton.setVisible(true);
				enemy3Attack.setDisable(true);
				enemy2Attack.setDisable(true);
				enemy1Attack.setDisable(true);
			} 
			
			if (enemy2Health <= 0) {
				enemy2Attack.setDisable(true);
				enemy2Attack.setText("Enemy 1 Dead");
				enemy2.setOpacity(0.25);
				enemy2HP.setText("Dead");
			}
		}
		
		if (enemy1Health <= 0 && enemy2Health <= 0 && enemy3Health <= 0) {
			nextLevelButton.setDisable(false);
			nextLevelButton.setVisible(true);
			//level++;
			playerHealth += (level + 1) * 20;
		}
	}
	
	public void enemy3Press(ActionEvent event) {
		if (!(playerHealth <= 0)) {
			playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			attackRoll = rand.nextInt(50 + 3*ATKChoice) + 2*level;
			System.out.println(attackRoll);
			damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
			damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
			damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
			
			enemy3Health = enemy3Health - attackRoll;
			enemy3HP.setText(String.valueOf(enemy3Health) + "/" + String.valueOf(dps2MaxHP));
			
			if (enemy1Health != 0) {
				playerHealth = playerHealth - damageDoneToPlayer1;
				playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			} 
			if (enemy2Health != 0) {
				playerHealth = playerHealth - damageDoneToPlayer2;
				playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			}
			if (enemy3Health != 0) {
				playerHealth = playerHealth - damageDoneToPlayer3;
				playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			}
			
		}
		
		if (playerHealth <= 0 || enemy3Health <= 0) {
			if (playerHealth <= 0) {
				playerHP.setText("Dead");
				gameOver.setVisible(true);
				playerHealth = playerMaxHP;
				menuButton.setVisible(true);
				enemy3Attack.setDisable(true);
				enemy2Attack.setDisable(true);
				enemy1Attack.setDisable(true);
			} 
			
			if (enemy3Health <= 0) {
				enemy3Attack.setDisable(true);
				enemy3Attack.setText("Enemy 1 Dead");
				enemy3.setOpacity(0.25);
				enemy3HP.setText("Dead");
			}
		}
		
		if (enemy1Health <= 0 && enemy2Health <= 0 && enemy3Health <= 0) {
			nextLevelButton.setDisable(false);
			nextLevelButton.setVisible(true);
			//level++;
			playerHealth += (level + 1) * 20;
		}
	}
	
	
	
	
	public void goToMenu(ActionEvent event) throws IOException {
		Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/mainMenu.fxml"));// pane you are GOING TO
        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
	}
	
	public void goNextLevel(ActionEvent event) throws IOException {
		if (level == 0) {
			Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/Interlude1.fxml"));// pane you are GOING TO
	        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
	        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
	        window.setScene(scene);
	        window.show();
		} else if (level == 1) {
			Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/Interlude2.fxml"));// pane you are GOING TO
	        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
	        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
	        window.setScene(scene);
	        window.show();
		} else if (level == 2) {
			Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/Interlude3.fxml"));// pane you are GOING TO
	        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
	        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
	        window.setScene(scene);
	        window.show();
		} else if (level == 3) {
			Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/credits.fxml"));// pane you are GOING TO
	        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
	        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
	        window.setScene(scene);
	        window.show();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		playerMaxHP = 500 + level * 20 + HPChoice * 10;
		
		enemy1Health = 50 + 2 * level + rand.nextInt(10) * level; //used to update health of monster across levels
		enemy2Health = 75 + 5 * level + rand.nextInt(10) * level; //^
		enemy3Health = 50 + 2 * level + rand.nextInt(10) * level; //^^
		tankMaxHP = enemy2Health; //may need to be static
		dpsMaxHP = enemy1Health; //^
		dps2MaxHP = enemy3Health;
		
		stage.setText("Level " + String.valueOf(level + 1));
		playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
		enemy1HP.setText(String.valueOf(enemy1Health) + "/" + String.valueOf(enemy1Health));
		enemy2HP.setText(String.valueOf(enemy2Health) + "/" + String.valueOf(enemy2Health));
		enemy3HP.setText(String.valueOf(enemy3Health) + "/" + String.valueOf(enemy3Health));
		
		
		
	}

	
}

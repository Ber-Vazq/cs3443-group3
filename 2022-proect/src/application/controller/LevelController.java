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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
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
	Label enemy1Name;
	
	@FXML
	Label enemy2Name;
	
	@FXML
	Label enemy3Name;
	
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
	
	@FXML
	ImageView enemy1AttackImage;
	
	@FXML
	ImageView enemy2AttackImage;
	
	@FXML
	ImageView enemy3AttackImage;

	Random rand = new Random();
	Random enemyRandom = new Random();
	int enemyRandomNum;
	static int playerHealth = 200; // tracks player health across levels
	static int level = 0; // tracks level progress
	int enemy1Health; //used to update health of monster across levels
	int enemy2Health; //^
	int enemy3Health; //^^
	int tankMaxHP; //may need to be static
	int dpsMaxHP; //^
	int dps2MaxHP;
	static int playerMaxHP = 200;
	int attackRoll;
	int damageDoneToPlayer1;
	int damageDoneToPlayer2;
	int damageDoneToPlayer3;
	static int HPChoice = 0;
	static int ATKChoice = 0;
	String enemy1ButtonName;
	String enemy2ButtonName;
	String enemy3ButtonName;
	/*
	 * Every enemyPress function does the same thing
	 * it initiates the attack using RNG based off of base player and enemy damage which is then scaled by a 2*level multiplier, 
	 * ergo if you're on level three and you chose weapon attack all three times then you're going to have a x6 multiplier to your attack
	 * 
	 * it also checks if the level is over and adds to your health based off of the following formula
	 * 	playerHealth += (level + 1) * 20
	 * 
	 */
	public void enemy1Press(ActionEvent event) {
		
		if (!(playerHealth <= 0)) {
			playerHP.setText(String.valueOf(playerHealth) + "/" + String.valueOf(playerMaxHP));
			
			attackRoll = rand.nextInt(50 + 5*ATKChoice) + 2*level;
			damageDoneToPlayer1 = rand.nextInt(8 + 2*level);
			damageDoneToPlayer2 = rand.nextInt(2 + 2*level);
			damageDoneToPlayer3 = rand.nextInt(8 + 2*level);
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
				/*if (enemy1Health > 0 || enemy2Health > 0 || enemy3Health > 0) {
					playerHealth = 300; // resets player hp
				}*/
				gameOver.setVisible(true);
				menuButton.setVisible(true);
				enemy3Attack.setDisable(true);
				enemy2Attack.setDisable(true);
				enemy1Attack.setDisable(true);
				level = 0;
			} 
			
			if (enemy1Health <= 0) {
				enemy1Attack.setDisable(true);
				enemy1Attack.setText(enemy1ButtonName + " is dead");
				enemy1Attack.setTextFill(Color.WHITE);
				enemy1.setOpacity(0.25);
				enemy1HP.setText("Dead");
			}
		}
		
		if (enemy1Health <= 0 && enemy2Health <= 0 && enemy3Health <= 0 && playerHealth > 0) {
			nextLevelButton.setDisable(false);
			if (level == 3) {
				nextLevelButton.setText("Obliterate yourself");
			}
			nextLevelButton.setVisible(true);
			playerHealth += (level + 1) * 20;
		}
		
	}

	public void enemy2Press(ActionEvent event) {
		if (!(playerHealth <= 0)) {
			playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			attackRoll = rand.nextInt(50 + 5*ATKChoice) + 2*level;
			damageDoneToPlayer1 = rand.nextInt(8 + 2*level);
			damageDoneToPlayer2 = rand.nextInt(2 + 2*level);
			damageDoneToPlayer3 = rand.nextInt(8 + 2*level);
			
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
				/*if (enemy1Health > 0 || enemy2Health > 0 || enemy3Health > 0) {
					playerHealth = 300; // resets player hp
				}*/
				menuButton.setVisible(true);
				enemy3Attack.setDisable(true);
				enemy2Attack.setDisable(true);
				enemy1Attack.setDisable(true);
				level = 0;
			} 
			
			if (enemy2Health <= 0) {
				enemy2Attack.setDisable(true);
				enemy2Attack.setText(enemy2ButtonName + " is dead");
				enemy2Attack.setTextFill(Color.WHITE);
				enemy2.setOpacity(0.25);
				enemy2HP.setText("Dead");
			}
		}
		
		if (enemy1Health <= 0 && enemy2Health <= 0 && enemy3Health <= 0 && playerHealth > 0) {
			nextLevelButton.setDisable(false);
			if (level == 3) {
				nextLevelButton.setText("Obliterate yourself");
			}
			nextLevelButton.setVisible(true);
			playerHealth += (level + 1) * 20;
		}
	}
	
	public void enemy3Press(ActionEvent event) {
		if (!(playerHealth <= 0)) {
			playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
			attackRoll = rand.nextInt(50 + 5*ATKChoice) + 2*level;
			damageDoneToPlayer1 = rand.nextInt(8 + 2*level);
			damageDoneToPlayer2 = rand.nextInt(2 + 2*level);
			damageDoneToPlayer3 = rand.nextInt(8 + 2*level);
			
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
		// check for if player or enemy is dead
		if (playerHealth <= 0 || enemy3Health <= 0) {
			if (playerHealth <= 0) { // if player dead
				playerHP.setText("Dead"); // sets hp bar to dead
				gameOver.setVisible(true); // shows game over message
				/*if (enemy1Health > 0 || enemy2Health > 0 || enemy3Health > 0) {
					playerHealth = 300; // resets player hp
				}*/
				menuButton.setVisible(true); // shows menu button
				enemy3Attack.setDisable(true); // disables attack button
				enemy2Attack.setDisable(true); // ^
				enemy1Attack.setDisable(true); // ^^
				level = 0;
			} 
			//checks if enemy is dead
			if (enemy3Health <= 0) {
				enemy3Attack.setDisable(true); // disables attack button
				enemy3Attack.setText(enemy3ButtonName + " is dead"); // displays text on button
				enemy3Attack.setTextFill(Color.WHITE);
				enemy3.setOpacity(0.25); // dims enemy
				enemy3HP.setText("Dead"); // changes hp bar to dead
			}
		}
		//checks if all enemies are dead
		if (enemy1Health <= 0 && enemy2Health <= 0 && enemy3Health <= 0 && playerHealth > 0) {
			nextLevelButton.setDisable(false); //enables next level button
			if (level == 3) {
				nextLevelButton.setText("Obliterate yourself");
			}
			nextLevelButton.setVisible(true); // shows next level button
			playerHealth += (level + 1) * 20; //heals player
		}
	}
	
	
	/*
	 * the button to go back to the main menu
	 */
	
	public void goToMenu(ActionEvent event) throws IOException {
		playerHealth = 300;
		Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/mainMenu.fxml"));// pane you are GOING TO
        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
	}
	/*
	 * this is the next level button, it controls it for all interludes and levels
	 * 
	 * There is an if else-if ladder in order to check which level is loaded and then using that determining what level is being loaded.
	 */
	
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
			playerHealth = 300;// resets health to original value
			level = 0; // resets level
			Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/credits.fxml"));// pane you are GOING TO
	        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
	        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
	        window.setScene(scene);
	        window.show();
		}
	}
	
	/*
	 * initialize does the following
	 * 
	 * it first checks which level the player is on and sets the enemy according to that level and loads them into view
	 * doing so through a series of switch cases, in order to be able to get everything in a semblance of randomness so that subsequent
	 * playthroughs aren't boring.
	 * 
	 * it does this first and then determines the health of each enemy by using this equation for the enemies 
	 * enemy1Health = 50 + 2 * level + rand.nextInt(10) * level
	 * enemy2Health = 75 + 5 * level + rand.nextInt(10) * level
	 * 
	 * with one enemy always being a bit stronger than the other two in terms of health.
	 * 
	 * it also does the same with the player though the equation is a bit different
	 * playerMaxHP = 300 + level * 20 + HPChoice * 10;
	 * 
	 * it then sets the enemies health according to the role they play either beind a tank or a damage dealer.
	 * then it sets everything into the corresponding text fields.
	 */

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		enemyRandomNum = enemyRandom.nextInt(6 - 1 + 1) + 1;
		switch(enemyRandomNum) {
			case 1:
				Image image = new Image("./assets/enemies/eneny1Idle.gif");
				Image attackImage = new Image("./assets.buttons/attackEnforcer.png");
				enemy1AttackImage.setImage(attackImage);
				enemy1.setImage(image);
				enemy1ButtonName = "Enforcer";
				enemy1Name.setText("Enforcer");
				break;
			case 2:
				Image image2 = new Image("./assets/enemies/enemy2Idle.gif");
				Image attackImage2 = new Image("./assets.buttons/attackTheLesser.png");
				enemy1AttackImage.setImage(attackImage2);
				enemy1.setImage(image2);
				enemy1ButtonName = "The Lesser";
				enemy1Name.setText("The Lesser");
				break;
			case 3:
				Image image3 = new Image("./assets/enemies/enemy3Idle.gif");
				Image attackImage3 = new Image("./assets.buttons/attackPraetorian.png");
				enemy1AttackImage.setImage(attackImage3);
				enemy1.setImage(image3);
				enemy1ButtonName = "Praetorian";
				enemy1Name.setText("Praetorian");
				break;
			case 4:
				Image image4 = new Image("./assets/enemies/enemy4Idle.gif");
				Image attackImage4 = new Image("./assets.buttons/attackStormhead.png");
				enemy1AttackImage.setImage(attackImage4);
				enemy1.setImage(image4);
				enemy1ButtonName = "Stormhead";
				enemy1Name.setText("Stormhead");
				break;
			case 5:
				Image image5 = new Image("./assets/enemies/enemy5Idle.gif");
				Image attackImage5 = new Image("./assets.buttons/attackGuardian.png");
				enemy1AttackImage.setImage(attackImage5);
				enemy1.setImage(image5);
				enemy1ButtonName = "Guardian";
				enemy1Name.setText("Guardian");
				break;
			default:
				Image image6 = new Image("./assets/enemies/enemy6Idle.gif");
				Image attackImage6 = new Image("./assets.buttons/attackThresher.png");
				enemy1AttackImage.setImage(attackImage6);
				enemy1.setImage(image6);
				enemy1ButtonName = "Thresher";
				enemy1Name.setText("Thresher");
		}	
		
		enemyRandomNum = enemyRandom.nextInt(6 - 1 + 1) + 1;
		switch(enemyRandomNum) {
			case 1:
				Image image = new Image("./assets/enemies/eneny1Idle.gif");
				Image attackImage = new Image("./assets.buttons/attackEnforcer.png");
				enemy2AttackImage.setImage(attackImage);
				enemy2.setImage(image);
				enemy2ButtonName = "Enforcer";
				enemy2Name.setText("Enforcer");
				break;
			case 2:
				Image image2 = new Image("./assets/enemies/enemy2Idle.gif");
				Image attackImage2 = new Image("./assets.buttons/attackTheLesser.png");
				enemy2AttackImage.setImage(attackImage2);
				enemy2.setImage(image2);
				enemy2ButtonName = "The Lesser";
				enemy2Name.setText("The Lesser");
				break;
			case 3:
				Image image3 = new Image("./assets/enemies/enemy3Idle.gif");
				Image attackImage3 = new Image("./assets.buttons/attackPraetorian.png");
				enemy2AttackImage.setImage(attackImage3);
				enemy2.setImage(image3);
				enemy2ButtonName = "Praetorian";
				enemy2Name.setText("Praetorian");
				break;
			case 4:
				Image image4 = new Image("./assets/enemies/enemy4Idle.gif");
				Image attackImage4 = new Image("./assets.buttons/attackStormhead.png");
				enemy2AttackImage.setImage(attackImage4);
				enemy2.setImage(image4);
				enemy2ButtonName = "Stormhead";
				enemy2Name.setText("Stormhead");
				break;
			case 5:
				Image image5 = new Image("./assets/enemies/enemy5Idle.gif");
				Image attackImage5 = new Image("./assets.buttons/attackGuardian.png");
				enemy2AttackImage.setImage(attackImage5);
				enemy2.setImage(image5);
				enemy2ButtonName = "Guardian";
				enemy2Name.setText("Guardian");
				break;
			default:
				Image image6 = new Image("./assets/enemies/enemy6Idle.gif");
				Image attackImage6 = new Image("./assets.buttons/attackThresher.png");
				enemy2AttackImage.setImage(attackImage6);
				enemy2.setImage(image6);
				enemy2ButtonName = "Thresher";
				enemy2Name.setText("Thresher");
		}
		
		enemyRandomNum = enemyRandom.nextInt(6 - 1 + 1) + 1;
		switch(enemyRandomNum) {
			case 1:
				Image image = new Image("./assets/enemies/eneny1Idle.gif");
				Image attackImage = new Image("./assets.buttons/attackEnforcer.png");
				enemy3AttackImage.setImage(attackImage);
				enemy3.setImage(image);
				enemy3ButtonName = "Enforcer";
				enemy3Name.setText("Enforcer");
				break;
			case 2:
				Image image2 = new Image("./assets/enemies/enemy2Idle.gif");
				Image attackImage2 = new Image("./assets.buttons/attackTheLesser.png");
				enemy3AttackImage.setImage(attackImage2);
				enemy3.setImage(image2);
				enemy3ButtonName = "The Lesser";
				enemy3Name.setText("The Lesser");
				break;
			case 3:
				Image image3 = new Image("./assets/enemies/enemy3Idle.gif");
				Image attackImage3 = new Image("./assets.buttons/attackPraetorian.png");
				enemy3AttackImage.setImage(attackImage3);
				enemy3.setImage(image3);
				enemy3ButtonName = "Praetorian";
				enemy3Name.setText("Praetorian");
				break;
			case 4:
				Image image4 = new Image("./assets/enemies/enemy4Idle.gif");
				Image attackImage4 = new Image("./assets.buttons/attackStormhead.png");
				enemy3AttackImage.setImage(attackImage4);
				enemy3.setImage(image4);
				enemy3ButtonName = "Stormhead";
				enemy3Name.setText("Stormhead");
				break;
			case 5:
				Image image5 = new Image("./assets/enemies/enemy5Idle.gif");
				Image attackImage5 = new Image("./assets.buttons/attackGuardian.png");
				enemy3AttackImage.setImage(attackImage5);
				enemy3.setImage(image5);
				enemy3ButtonName = "Guardian";
				enemy3Name.setText("Guardian");
				break;
			default:
				Image image6 = new Image("./assets/enemies/enemy6Idle.gif");
				Image attackImage6 = new Image("./assets.buttons/attackThresher.png");
				enemy3AttackImage.setImage(attackImage6);
				enemy3.setImage(image6);
				enemy3ButtonName = "Thresher";
				enemy3Name.setText("Thresher");
		}
		
		//enemy1Attack.setText("Attack " + enemy1ButtonName);
		//enemy2Attack.setText("Attack " + enemy2ButtonName);
		//enemy3Attack.setText("Attack " + enemy3ButtonName);
		
		playerMaxHP = 200 + level * 5 + HPChoice * 10;
		
		enemy1Health = 50 + 2 * level + rand.nextInt(10) * level; //used to update health of monster across levels
		enemy2Health = 75 + 5 * level + rand.nextInt(10) * level; //^
		enemy3Health = 50 + 2 * level + rand.nextInt(10) * level; //^^
		tankMaxHP = enemy2Health; // set max health value
		dpsMaxHP = enemy1Health; //^
		dps2MaxHP = enemy3Health;
		
		stage.setText("Level " + String.valueOf(level + 1));
		playerHP.setText(String.valueOf(playerHealth) + "/" + String.valueOf(playerMaxHP));
		enemy1HP.setText(String.valueOf(enemy1Health) + "/" + String.valueOf(enemy1Health));
		enemy2HP.setText(String.valueOf(enemy2Health) + "/" + String.valueOf(enemy2Health));
		enemy3HP.setText(String.valueOf(enemy3Health) + "/" + String.valueOf(enemy3Health));
		
		
		
	}

	
}

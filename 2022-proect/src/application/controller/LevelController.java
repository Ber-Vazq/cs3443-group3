package application.controller;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LevelController extends ClassSelectController{
	
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

	
	static int playerHealth = 150; // tracks player health across levels
	static int level = 0; // tracks level progress
	int enemy1Health = 50 + 5*level; //used to update health of monster across levels
	int enemy2Health = 75 + 10*level; //^
	int enemy3Health = 50 + 5*level; //^^
	int tankMaxHP = 75 + 10*level; //may need to be static
	int dpsMaxHP = 50 + 5*level; //^
	static int playerMaxHP = 150;
	
	Random rand = new Random();
	int attackRoll;
	int damageDoneToPlayer1;
	int damageDoneToPlayer2;
	int damageDoneToPlayer3;
	static int HPChoice = 0;
	static int ATKChoice = 0;
	
	public void enemy1Press(ActionEvent event) {
		
		if (!(playerHealth <= 0)) {
			stage.setText("Level " + String.valueOf(level + 1));
			playerMaxHP = 150 + level * 20 + HPChoice * 10;
			playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
//			System.out.print(level);
			if (job == 1) {
				//System.out.println("samurai job");
				
				attackRoll = rand.nextInt(50 + 3*ATKChoice);
				damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
				damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
				damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
//				System.out.print(enemy1Health);
				enemy1Health = enemy1Health + 5*level - attackRoll;
				enemy1HP.setText(String.valueOf(enemy1Health) + "/" + String.valueOf(dpsMaxHP));
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 3 damaging player for " + damageDoneToPlayer3);
				}
				
			}
			
			if (job == 2) {
				//System.out.println("technopath job");
				
				attackRoll = rand.nextInt(50 + 3*ATKChoice);
				damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
				damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
				damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
				
				enemy1Health = enemy1Health + 5*level - attackRoll;
				enemy1HP.setText(String.valueOf(enemy1Health) + "/" + String.valueOf(dpsMaxHP));
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 3 damaging player for " + damageDoneToPlayer3);
				}
				
			}
			
			if (job == 3) {
				//System.out.println("mage job");
				
				attackRoll = rand.nextInt(50 + 3*ATKChoice);
				damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
				damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
				damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
				
				enemy1Health = enemy1Health + 5*level - attackRoll;
				enemy1HP.setText(String.valueOf(enemy1Health) + "/" + String.valueOf(dpsMaxHP));
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 3 damaging player for " + damageDoneToPlayer3);
				}
				
			}
			
		}
		
		if (playerHealth <= 0 || enemy1Health <= 0) {
			if (playerHealth <= 0) {
				playerHP.setText("Dead");
				gameOver.setVisible(true);
				enemy3Attack.setDisable(true);
				enemy2Attack.setDisable(true);
				enemy1Attack.setDisable(true);
			} 
			
			if (enemy1Health <= 0) {
				enemy1Attack.setDisable(true);
				enemy1Attack.setText("Enemy 1 Dead");
				enemy1HP.setText("Dead");
			}
		}
		
		if (enemy1Health <= 0 && enemy2Health <= 0 && enemy3Health <= 0) {
			nextLevelButton.setDisable(false);
			nextLevelButton.setVisible(true);
			level++;
			playerHealth += (level + 1) * 20;
//			System.out.print(level);
		}
		
	}
	
	public void enemy2Press(ActionEvent event) {
		if (!(playerHealth <= 0)) {
			playerMaxHP = 150 + level * 20 + HPChoice * 10;
			playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
//			System.out.print(level);
			if (job == 1) {
				//System.out.println("samurai job");
				
				attackRoll = rand.nextInt(50 + 3*ATKChoice);
				damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
				damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
				damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
				
				enemy2Health = enemy2Health + 10*level - attackRoll;
				enemy2HP.setText(String.valueOf(enemy2Health) + "/" + String.valueOf(tankMaxHP));
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 3 damaging player for " + damageDoneToPlayer3);
				}
				
			}
			
			if (job == 2) {
				//System.out.println("technopath job");
				
				attackRoll = rand.nextInt(50 + 3*ATKChoice);
				damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
				damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
				damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
				
				enemy2Health = enemy2Health + 10*level - attackRoll;
				enemy2HP.setText(String.valueOf(enemy2Health) + "/" + String.valueOf(tankMaxHP));
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 3 damaging player for " + damageDoneToPlayer3);
				}
				
			}
			
			if (job == 3) {
				//System.out.println("mage job");
				
				attackRoll = rand.nextInt(50 + 3*ATKChoice);
				damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
				damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
				damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
				
				enemy2Health = enemy2Health + 10*level - attackRoll;
				enemy2HP.setText(String.valueOf(enemy2Health) + "/" + String.valueOf(tankMaxHP));
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 3 damaging player for " + damageDoneToPlayer3);
				}
				
			}
			
		}
		
		if (playerHealth <= 0 || enemy2Health <= 0) {
			if (playerHealth <= 0) {
				playerHP.setText("Dead");
				gameOver.setVisible(true);
				enemy3Attack.setDisable(true);
				enemy2Attack.setDisable(true);
				enemy1Attack.setDisable(true);
			} 
			
			if (enemy2Health <= 0) {
				enemy2Attack.setDisable(true);
				enemy2Attack.setText("Enemy 1 Dead");
				enemy2HP.setText("Dead");
			}
		}
		
		if (enemy1Health <= 0 && enemy2Health <= 0 && enemy3Health <= 0) {
			nextLevelButton.setDisable(false);
			nextLevelButton.setVisible(true);
			level++;
			playerHealth += (level + 1) * 20;
//			System.out.print(level);
		}
	}
	
	public void enemy3Press(ActionEvent event) {
		if (!(playerHealth <= 0)) {
			playerMaxHP = 150 + level * 20 + HPChoice * 10;
			playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
//			System.out.print(level);
			if (job == 1) {
				//System.out.println("samurai job");
				
				attackRoll = rand.nextInt(50 + 3*ATKChoice);
				damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
				damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
				damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
				
				enemy3Health = enemy3Health + 5*level - attackRoll;
				enemy3HP.setText(String.valueOf(enemy3Health) + "/" + String.valueOf(dpsMaxHP));
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 3 damaging player for " + damageDoneToPlayer3);
				}
				
			}
			
			if (job == 2) {
				//System.out.println("technopath job");
				
				attackRoll = rand.nextInt(50 + 3*ATKChoice);
				damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
				damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
				damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
				
				enemy3Health = enemy3Health + 5*level - attackRoll;
				enemy3HP.setText(String.valueOf(enemy3Health) + "/" + String.valueOf(dpsMaxHP));
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 3 damaging player for " + damageDoneToPlayer3);
				}
				
			}
			
			if (job == 3) {
				//System.out.println("mage job");
				
				attackRoll = rand.nextInt(50 + 3*ATKChoice);
				damageDoneToPlayer1 = rand.nextInt(10 + 2*level);
				damageDoneToPlayer2 = rand.nextInt(5 + 2*level);
				damageDoneToPlayer3 = rand.nextInt(10 + 2*level);
				
				enemy3Health = enemy3Health + 5*level - attackRoll;
				enemy3HP.setText(String.valueOf(enemy3Health) + "/" + String.valueOf(dpsMaxHP));
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth)+"/"+String.valueOf(playerMaxHP));
					//System.out.println("enemy 3 damaging player for " + damageDoneToPlayer3);
				}
				
			}
			
		}
		
		if (playerHealth <= 0 || enemy3Health <= 0) {
			if (playerHealth <= 0) {
				playerHP.setText("Dead");
				gameOver.setVisible(true);
				enemy3Attack.setDisable(true);
				enemy2Attack.setDisable(true);
				enemy1Attack.setDisable(true);
			} 
			
			if (enemy3Health <= 0) {
				enemy3Attack.setDisable(true);
				enemy3Attack.setText("Enemy 1 Dead");
				enemy3HP.setText("Dead");
			}
		}
		
		if (enemy1Health <= 0 && enemy2Health <= 0 && enemy3Health <= 0) {
			nextLevelButton.setDisable(false);
			nextLevelButton.setVisible(true);
			level++;
			playerHealth += (level + 1) * 20;
//			System.out.print(level);
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
		Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/level1.fxml"));// pane you are GOING TO
        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
	}
}

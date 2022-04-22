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

public class LevelController4 extends LevelController{
	
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
	Button enemy1Attack;
	
	@FXML
	Button enemy2Attack;
	
	@FXML
	Button enemy3Attack;
	
	@FXML
	Button nextLevelButton;
	
	@FXML
	Label level;
	
	int playerHealth = 15;
	int enemy1Health = 60;
	int enemy2Health = 90;
	int enemy3Health = 60;
	
	Random rand = new Random();
	int attackRoll;
	int damageDoneToPlayer1;
	int damageDoneToPlayer2;
	int damageDoneToPlayer3;
//	int level = 0;
	
	public void enemy1Press(ActionEvent event) {
		
		if (!(playerHealth <= 0)) {
//			System.out.print(level);
			if (job == 1) {
				//System.out.println("samurai job");
				
				attackRoll = rand.nextInt(50);
				damageDoneToPlayer1 = rand.nextInt(10);
				damageDoneToPlayer2 = rand.nextInt(5);
				damageDoneToPlayer3 = rand.nextInt(10);
				
				enemy1Health = enemy1Health - attackRoll;
				enemy1HP.setText(String.valueOf(enemy1Health) + "/60");
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 3 damaging player for " + damageDoneToPlayer3);
				}
				
			}
			
			if (job == 2) {
				//System.out.println("technopath job");
				
				attackRoll = rand.nextInt(50);
				damageDoneToPlayer1 = rand.nextInt(10);
				damageDoneToPlayer2 = rand.nextInt(5);
				damageDoneToPlayer3 = rand.nextInt(10);
				
				enemy1Health = enemy1Health - attackRoll;
				enemy1HP.setText(String.valueOf(enemy1Health) + "/60");
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 3 damaging player for " + damageDoneToPlayer3);
				}
				
			}
			
			if (job == 3) {
				//System.out.println("mage job");
				
				attackRoll = rand.nextInt(50);
				damageDoneToPlayer1 = rand.nextInt(10);
				damageDoneToPlayer2 = rand.nextInt(5);
				damageDoneToPlayer3 = rand.nextInt(10);
				
				enemy1Health = enemy1Health - attackRoll;
				enemy1HP.setText(String.valueOf(enemy1Health) + "/60");
				//System.out.println(attackRoll);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 1 damaging player for " + damageDoneToPlayer1);
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 2 damaging player for " + damageDoneToPlayer2);
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
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
//			level++;
//			System.out.print(level);
		}
		
	}
	
	public void enemy2Press(ActionEvent event) {
		if (!(playerHealth <= 0)) {
			if (job == 1) {
				//System.out.println("samurai job");
				
				attackRoll = rand.nextInt(4);
				damageDoneToPlayer1 = rand.nextInt(10);
				damageDoneToPlayer2 = rand.nextInt(5);
				damageDoneToPlayer3 = rand.nextInt(10);
				
				enemy2Health = enemy2Health - attackRoll;
				enemy2HP.setText(String.valueOf(enemy2Health) + "/90");
				//System.out.println("damage: " + attackRoll + "\n" + "enemy 2 HP: " + enemy2Health);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 1 damaging player");
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 2 damaging player");
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 3 damaging player");
				}
				
			}
			
			if (job == 2) {
				//System.out.println("technopath job");
				
				attackRoll = rand.nextInt(50);
				damageDoneToPlayer1 = rand.nextInt(10);
				damageDoneToPlayer2 = rand.nextInt(5);
				damageDoneToPlayer3 = rand.nextInt(10);
				
				enemy2Health = enemy2Health - attackRoll;
				enemy2HP.setText(String.valueOf(enemy2Health) + "/90");
				//System.out.println("damage: " + attackRoll + "\n" + "enemy 2 HP: " + enemy2Health);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 1 damaging player");
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 2 damaging player");
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 3 damaging player");
				}
				
			}
			
			if (job == 3) {
				//System.out.println("mage job");
				
				attackRoll = rand.nextInt(50);
				damageDoneToPlayer1 = rand.nextInt(10);
				damageDoneToPlayer2 = rand.nextInt(5);
				damageDoneToPlayer3 = rand.nextInt(10);
				
				enemy2Health = enemy2Health - attackRoll;
				enemy2HP.setText(String.valueOf(enemy2Health) + "/90");
				//System.out.println("damage: " + attackRoll + "\n" + "enemy 2 HP: " + enemy2Health);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 1 damaging player");
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 2 damaging player");
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 3 damaging player");
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
				enemy2Attack.setText("Enemy 2 Dead");
				enemy2HP.setText("Dead");
			}
		}
		
		if (enemy1Health <= 0 && enemy2Health <= 0 && enemy3Health <= 0) {
			nextLevelButton.setDisable(false);
			nextLevelButton.setVisible(true);
		}
	}
	
	public void enemy3Press(ActionEvent event) {
		if (!(playerHealth <= 0)) {
			if (job == 1) {
				//System.out.println("samurai job");
				
				attackRoll = rand.nextInt(50);
				damageDoneToPlayer1 = rand.nextInt(10);
				damageDoneToPlayer2 = rand.nextInt(5);
				damageDoneToPlayer3 = rand.nextInt(10);
				
				enemy3Health = enemy3Health - attackRoll;
				enemy3HP.setText(String.valueOf(enemy3Health) + "/60");
				//System.out.println("damage: " + attackRoll + "\n" + "enemy 3 HP: " + enemy3Health);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 1 damaging player");
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 2 damaging player");
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 3 damaging player");
				}
				
			}
			
			if (job == 2) {
				//System.out.println("technopath job");
				
				attackRoll = rand.nextInt(50);
				damageDoneToPlayer1 = rand.nextInt(10);
				damageDoneToPlayer2 = rand.nextInt(5);
				damageDoneToPlayer3 = rand.nextInt(10);
				
				enemy3Health = enemy3Health - attackRoll;
				enemy3HP.setText(String.valueOf(enemy3Health) + "/60");
				//System.out.println("damage: " + attackRoll + "\n" + "enemy 3 HP: " + enemy3Health);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 1 damaging player");
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 2 damaging player");
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 3 damaging player");
				}
				
			}
			
			if (job == 3) {
				//System.out.println("mage job");
				
				attackRoll = rand.nextInt(50);
				damageDoneToPlayer1 = rand.nextInt(10);
				damageDoneToPlayer2 = rand.nextInt(5);
				damageDoneToPlayer3 = rand.nextInt(10);
				
				enemy3Health = enemy3Health - attackRoll;
				enemy3HP.setText(String.valueOf(enemy3Health) + "/60");
				//System.out.println("damage: " + attackRoll + "\n" + "enemy 3 HP: " + enemy3Health);
				
				if (enemy1Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer1;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 1 damaging player");
				} 
				if (enemy2Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer2;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 2 damaging player");
				}
				if (enemy3Health != 0) {
					playerHealth = playerHealth - damageDoneToPlayer3;
					playerHP.setText(String.valueOf(playerHealth) + "/150");
					//System.out.println("enemy 3 damaging player");
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
				enemy3Attack.setText("Enemy 3 Dead");
				enemy3HP.setText("Dead");
			}
		}
		
		if (enemy1Health <= 0 && enemy2Health <= 0 && enemy3Health <= 0) {
			nextLevelButton.setDisable(false);
			nextLevelButton.setVisible(true);
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
		Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/level3.fxml"));// pane you are GOING TO
        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
	}
}

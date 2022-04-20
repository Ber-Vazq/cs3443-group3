package application;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class fightController extends ClassSelectController implements Initializable{
	
	int SamiAttackRank=1;
	int RiggerAttackRank=1;
	int MageAttackRank=1;
	int AC=15;
	int mana;
	int st;
	int playerHealth;
	int enemyHealth;
	
	Random rand = new Random();
	int attackRoll;
	int damage;
	
	@FXML
	TextField AttackRoll;
		
	@FXML
	TextField DamageRoll;
	
	@FXML
	Label Rank;
	
	@FXML
	Label AR;
	
	@FXML
	Label DR;
	
	@FXML
	Label playerHP;
	
	@FXML
	Label enemyHP;
	
	@FXML
	void Attack(ActionEvent event) throws IOException {
		
		// Samurai attack
		if (job == 1) {
			attackRoll = rand.nextInt(50);
			
			if (SamiAttackRank == 1) {
				
				if (!(playerHealth <= 0) || !(enemyHealth <= 0)) {
				
					attackRoll = attackRoll + 16;
					AttackRoll.setText(String.valueOf(attackRoll));
					enemyHealth = enemyHealth - attackRoll;
					enemyHP.setText(String.valueOf(enemyHealth));
					
					if (attackRoll > 1) {
						damage = rand.nextInt(50) + 1;
						playerHealth = playerHealth - damage;
						playerHP.setText(String.valueOf(playerHealth));
						DamageRoll.setText(String.valueOf(damage));
					}
				}
			}
				
			else if (SamiAttackRank == 2) {
				
				if (!(playerHealth <= 0) || !(enemyHealth <= 0)) {
				
					attackRoll = attackRoll + 21;
					AttackRoll.setText(String.valueOf(attackRoll));
					enemyHealth = enemyHealth - attackRoll;
					enemyHP.setText(String.valueOf(enemyHealth));
					
					if (attackRoll > 1) {
						damage = rand.nextInt(50) + 6;
						playerHealth = playerHealth - damage;
						playerHP.setText(String.valueOf(playerHealth));
						DamageRoll.setText(String.valueOf(damage));
					}
				}
			}
				
			else if (SamiAttackRank == 3) {
				
				if (!(playerHealth <= 0) || !(enemyHealth <= 0)) {
					attackRoll = attackRoll + 27;
					AttackRoll.setText(String.valueOf(attackRoll));
					enemyHealth = enemyHealth - attackRoll;
					enemyHP.setText(String.valueOf(enemyHealth));
					
					if (attackRoll > 1) {
						damage = rand.nextInt(50) + 11;
						playerHealth = playerHealth - damage;
						playerHP.setText(String.valueOf(playerHealth));
						DamageRoll.setText(String.valueOf(damage));
					}
				}
			}
		}
		
		
		//Rigger attack
		else if (job == 2) {
			attackRoll = rand.nextInt(50);
			
			if (RiggerAttackRank == 1) {
				if (!(playerHealth <= 0) || !(enemyHealth <= 0)) {
					attackRoll = attackRoll + 16;
					AttackRoll.setText(String.valueOf(attackRoll));
					enemyHealth = enemyHealth - attackRoll;
					enemyHP.setText(String.valueOf(enemyHealth));
					
					if (attackRoll > 1) {
						damage = rand.nextInt(50) + 1;
						playerHealth = playerHealth - damage;
						playerHP.setText(String.valueOf(playerHealth));
						DamageRoll.setText(String.valueOf(damage));
					}
				}
			}
				
			else if (RiggerAttackRank == 2) {
				if (!(playerHealth <= 0) || !(enemyHealth <= 0)) {
					attackRoll = attackRoll + 21;
					AttackRoll.setText(String.valueOf(attackRoll));
					enemyHealth = enemyHealth - attackRoll;
					enemyHP.setText(String.valueOf(enemyHealth));
					
					if (attackRoll > 1) {
						damage = rand.nextInt(50) + 6;
						playerHealth = playerHealth - damage;
						playerHP.setText(String.valueOf(playerHealth));
						DamageRoll.setText(String.valueOf(damage));
					}
				}
			}
				
			else if (RiggerAttackRank == 3) {
				if (!(playerHealth <= 0) || !(enemyHealth <= 0)) {
					attackRoll = attackRoll + 27;
					AttackRoll.setText(String.valueOf(attackRoll));
					enemyHealth = enemyHealth - attackRoll;
					enemyHP.setText(String.valueOf(enemyHealth));
					
					if (attackRoll > 1) {
						damage = rand.nextInt(50) + 11;
						playerHealth = playerHealth - damage;
						playerHP.setText(String.valueOf(playerHealth));
						DamageRoll.setText(String.valueOf(damage));
					}
				}
			}
		}
		
		
		//mage/psion/psyker attack roll
		else if (job == 3) {
			attackRoll= rand.nextInt(50);
			if (MageAttackRank == 1) {
				if (!(playerHealth <= 0) || !(enemyHealth <= 0)) {
					attackRoll = attackRoll + 16;
					AttackRoll.setText(String.valueOf(attackRoll));
					enemyHealth = enemyHealth - attackRoll;
					enemyHP.setText(String.valueOf(enemyHealth));
					
					if (attackRoll > 1) {
						damage = rand.nextInt(50) + 1;
						playerHealth = playerHealth - damage;
						playerHP.setText(String.valueOf(playerHealth));
						DamageRoll.setText(String.valueOf(damage));
					}
				}
			} 
			
			else if (MageAttackRank == 2) {
				if (!(playerHealth <= 0) || !(enemyHealth <= 0)) {
					attackRoll = attackRoll + 21;
					AttackRoll.setText(String.valueOf(attackRoll));
					enemyHealth = enemyHealth - attackRoll;
					enemyHP.setText(String.valueOf(enemyHealth));
					
					if (attackRoll > 1) {
						damage = rand.nextInt(50) + 6;
						playerHealth = playerHealth - damage;
						playerHP.setText(String.valueOf(playerHealth));
						DamageRoll.setText(String.valueOf(damage));
						
					}
				}
			} 
			
			else if (MageAttackRank == 3) {
				if (!(playerHealth <= 0) || !(enemyHealth <= 0)) {
					attackRoll = attackRoll + 27;
					AttackRoll.setText(String.valueOf(attackRoll));
					enemyHealth = enemyHealth - attackRoll;
					enemyHP.setText(String.valueOf(enemyHealth));
					
					if (attackRoll > 1) {
						damage = rand.nextInt(50) + 11;
						playerHealth = playerHealth - damage;
						playerHP.setText(String.valueOf(playerHealth));
						DamageRoll.setText(String.valueOf(damage));
					}
				}
			}
		}
	}
		
	@FXML
	void addRank(ActionEvent event) throws IOException {
		if (SamiAttackRank!=3 && job==1) {
			SamiAttackRank++;
			Rank.setText(String.valueOf(SamiAttackRank));
		}
		
		if (RiggerAttackRank!=3 && job==2) {
			RiggerAttackRank++;
			Rank.setText(String.valueOf(RiggerAttackRank));
		}
		
		if (MageAttackRank!=3 && job==3) {
			MageAttackRank++;
			Rank.setText(String.valueOf(MageAttackRank));
		}
	}

	
	@FXML
	void reduceRank(ActionEvent event) throws IOException {
		if (SamiAttackRank!=1 && job==1) {
			SamiAttackRank--;
			Rank.setText(String.valueOf(SamiAttackRank));
		}
		
		if (RiggerAttackRank!=1 && job==2) {
			RiggerAttackRank--;
			Rank.setText(String.valueOf(RiggerAttackRank));
		}
		
		if (MageAttackRank!=1 && job==3) {
			MageAttackRank--;
			Rank.setText(String.valueOf(MageAttackRank));
		}
	}


	@FXML
	void ChangeClass(ActionEvent event) throws IOException {
		 Parent mainPane2 = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/class.fxml"));// pane you are GOING TO
         Scene scene = new Scene(mainPane2);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
         window.setScene(scene);
         window.show();
	}
	
	void ShowRank(ActionEvent event) throws IOException {
		
		
		
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		playerHealth = Integer.parseInt(playerHP.getText());
		enemyHealth = Integer.parseInt(enemyHP.getText());
	}
	
	
}

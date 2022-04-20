package application;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class fightController extends ClassSelectController {
	
	private AnchorPane mainPane2;
	
	int SamiAttackRank=1;
	int RiggerAttackRank=1;
	int MageAttackRank=1;
	int AC=15;
	int mana;
	int st;
	int job = 1;
	String s;
	
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
	void Attack(ActionEvent event) throws IOException {
		
		// Samurai attack
		if(job==1) {
			attackRoll= rand.nextInt(50);
			
			if(SamiAttackRank==1) {
				attackRoll= attackRoll+16;
				s=String.valueOf(attackRoll);
				AR.setText(s);
				
				
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +1;
					//adjust hp
					//s=String.valueOf(damage);
					DR.setText(String.valueOf(damage));
					
					
				}
			}
				
			if(SamiAttackRank==2) {
				attackRoll= attackRoll+21;
				s=String.valueOf(attackRoll);
				AR.setText(String.valueOf(attackRoll));
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +6;
					//damage
					s=String.valueOf(damage);
					DR.setText(String.valueOf(damage));
				}
			}
				
			if(SamiAttackRank==3) {
				attackRoll= attackRoll+27;
				s=String.valueOf(attackRoll);
				AttackRoll.setText(String.valueOf(attackRoll));
				
				
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +11;
					//adjust hp
					s=String.valueOf(damage);
					DR.setText(String.valueOf(SamiAttackRank));
				
				}
			}
			
		}
		
		
		//Rigger attack
		if(job==2) {
			attackRoll= rand.nextInt(50);
			
			if(RiggerAttackRank==1) {
				attackRoll= attackRoll+16;
				s=String.valueOf(attackRoll);
				AttackRoll.setText(String.valueOf(attackRoll));
				
				
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +1;
					//adjust hp
					s=String.valueOf(damage);
					DamageRoll.setText(s);
					
					
				}
			}
				
			if(RiggerAttackRank==2) {
				attackRoll= attackRoll+21;
				s=String.valueOf(attackRoll);
				AttackRoll.setText(String.valueOf(attackRoll));
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +6;
					//adjust hp
					s=String.valueOf(damage);
					DamageRoll.setText(s);
					
				}
			}
				
			if(RiggerAttackRank==3) {
				attackRoll= attackRoll+27;
				s=String.valueOf(attackRoll);
				AttackRoll.setText(String.valueOf(attackRoll));
				
				
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +11;
					//adjust hp
					s=String.valueOf(damage);
					DamageRoll.setText(s);
				
				}
			}
			
			
			
		}
		
		
		
		//mage/psion/psyker attack roll
		if(job==3) {
			attackRoll= rand.nextInt(50);
			if(MageAttackRank==1) {
				attackRoll= attackRoll+16;
				s=String.valueOf(attackRoll);
				AttackRoll.setText(String.valueOf(attackRoll));
				
				
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +1;
					//adjust hp
					s=String.valueOf(damage);
					DamageRoll.setText(s);
				}
			}
				
			if(MageAttackRank==2) {
				attackRoll= attackRoll+21;
				s=String.valueOf(attackRoll);
				AttackRoll.setText(String.valueOf(attackRoll));
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +6;
					//adjust hp
					s=String.valueOf(damage);
					DamageRoll.setText(s);
					
				}
			}
				
			if(MageAttackRank==3) {
				attackRoll= attackRoll+27;
				s=String.valueOf(attackRoll);
				AttackRoll.setText(String.valueOf(attackRoll));
				
				
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +11;
					//adjust hp
					s=String.valueOf(damage);
					DamageRoll.setText(s);
				
				}
			}
			
			
			
		}
		
			
	}
		
	@FXML
	void addRank(ActionEvent event) throws IOException {
		if(SamiAttackRank!=3 && job==1) {
			SamiAttackRank++;
			Rank.setText(String.valueOf(SamiAttackRank));
		}
		
		if(RiggerAttackRank!=3 && job==2) {
			RiggerAttackRank++;
			Rank.setText(String.valueOf(RiggerAttackRank));
		}
		
		if(MageAttackRank!=3 && job==3) {
			MageAttackRank++;
			Rank.setText(String.valueOf(MageAttackRank));
		}
		
		
		
	}

	
	@FXML
	void reduceRank(ActionEvent event) throws IOException {
		if(SamiAttackRank!=1 && job==1) {
			SamiAttackRank--;
			Rank.setText(String.valueOf(SamiAttackRank));
		}
		
		if(RiggerAttackRank!=1 && job==2) {
			RiggerAttackRank--;
			Rank.setText(String.valueOf(RiggerAttackRank));
		}
		
		if(MageAttackRank!=1 && job==3) {
			MageAttackRank--;
			Rank.setText(String.valueOf(MageAttackRank));
		}
		
		
		
	}


	@FXML
	void ChangeClass(ActionEvent event) throws IOException {
		 mainPane2 = FXMLLoader.load(getClass().getResource("class.fxml"));// pane you are GOING TO
         Scene scene = new Scene(mainPane2);// pane you are GOING TO show
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
         window.setScene(scene);
         window.show();
		
		
	}
	
	void ShowRank(ActionEvent event) throws IOException {
		
		
		
		
	}
	
	
}

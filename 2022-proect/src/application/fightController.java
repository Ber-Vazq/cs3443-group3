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
				AttackRoll.setText(s);
				
				
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +1;
					//adjust hp
					//s=String.valueOf(damage);
					DamageRoll.setText(String.valueOf(damage));
					
					
				}
				System.out.println("Samurai attack rank 1");
			}
				
			else if(SamiAttackRank==2) {
				attackRoll= attackRoll+21;
				s=String.valueOf(attackRoll);
				AttackRoll.setText(String.valueOf(attackRoll));
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +6;
					//damage
					s=String.valueOf(damage);
					DamageRoll.setText(String.valueOf(damage));
				}
				System.out.println("Samurai attack rank 2");
			}
				
			else if(SamiAttackRank==3) {
				attackRoll= attackRoll+27;
				s=String.valueOf(attackRoll);
				AttackRoll.setText(String.valueOf(attackRoll));
				if(attackRoll> 1) {
					damage = rand.nextInt(50) +11;
					//adjust hp
					s=String.valueOf(damage);
					DamageRoll.setText(String.valueOf(damage));
				
				}
				System.out.println("Samurai attack rank 3");
			}
		}
		
		
		//Rigger attack
		else if(job==2) {
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
				System.out.println("Rigger attack rank 1");
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
				System.out.println("Rigger attack rank 2");
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
				System.out.println("Rigger attack rank 3");
			}
		}
		
		
		
		//mage/psion/psyker attack roll
		else if(job==3) {
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
				System.out.println("Mage attack rank 1");
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
				System.out.println("Mage attack rank 2");
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
				System.out.println("Mage attack rank 3");
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

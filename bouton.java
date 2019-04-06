import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bouton {

	public int valeurCompteur = 0;

	public void initInterface() {

		JFrame zoneBouton = new JFrame("ZoneBouton"); 
		JLabel compteur = new JLabel("Compteur : " + valeurCompteur);
		JButton btnCompteur = new JButton("Ajouter 1 au compteur");
		
		zoneBouton.add(compteur);
		zoneBouton.add(btnCompteur); 

		compteur.setBounds(100, 20, 100, 100);
		btnCompteur.setBounds(50, 100, 200, 100);
		zoneBouton.setSize(300, 300);
		zoneBouton.setLayout(null);

		btnCompteur.addActionListener(new ActionListener(){  

    		public void actionPerformed(ActionEvent e){  
    			valeurCompteur++;
            	compteur.setText("Compteur : " + valeurCompteur);
    		}  

    	});

		
		zoneBouton.setVisible(true);

	} 	//fin méthode initInterface


	public static void main(String[] args) {
		Bouton exemple = new Bouton();
		exemple.initInterface();
		  
	}

} //fin de la classe boutonProg

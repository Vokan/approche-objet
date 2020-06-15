/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 * @author vokankocak
 * Cette class va calculer la moyenne des valeurs 
 * qu'on à implémenté en utilisant la class CalculMoyenne.
 */
public class TestMoyenne {


	public static void main(String[] args) {
		CalculMoyenne test = new CalculMoyenne();
		
		// initialisation des valeurs dans la table tabl en invoquant la méthode ajout de la class calculMoyenne.
		
		test.ajout(13);
		test.ajout(34);
		test.ajout(94);
		
		// calcule de la moyenne via la métode calcule de la class CalculMoyenne et sauvgarde dans une nouvel variable moyenne.
		// affichage de la moyenne calculé.
			
		double moyenne = test.calcul(0);
		System.out.println("la moyenne est: "+ moyenne);

	}

}

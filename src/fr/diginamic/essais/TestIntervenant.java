/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;

/**
 * @author vokankocak
 *
 */
public class TestIntervenant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Instance
		 */
		Salarie salaire = new Salarie(1500,"Koçak","Vokan");
		salaire.getSalaire();
		System.out.println("le salaire est: "+ salaire.getSalaire());

		
		/**
		 * Instance
		 */
		Pigiste salaireP = new Pigiste("Dupont", "Brieuc", 25, 150);
		salaireP.getSalaire();
		System.out.println("le salaire est: "+ salaireP.getSalaire());
	
		// appel de la méthode afficherDonner par les instances.
		salaire.afficherDonner();
		salaireP.afficherDonner();
	}

}

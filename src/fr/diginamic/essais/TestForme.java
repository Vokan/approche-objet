/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.formes.*;


/**
 * @author vokankocak
 *
 */
public class TestForme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cercle cercle = new Cercle(4);
		Rectangle rectangle = new Rectangle (5,6);
		Carre carre = new Carre(6);
		
		AffichageForme affichage = new AffichageForme();
		affichage.afficher(cercle);
		affichage.afficher(rectangle);
		affichage.afficher(carre);

	}

}

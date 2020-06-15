/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author vokankocak
 * Cette class construit l'objet Carré et hérite
 * de rectangle
 */
public class Carre extends Rectangle{

	double longueur;

	/**
	 * Constructeur
	 * @param longueur
	 */
	public Carre(double longueur) {
		super(longueur, longueur);
	}
	
}
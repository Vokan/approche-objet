/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author vokankocak
 * Cette classe construit l'objet Rectangle et
 * hérite de Forme
 */
public class Rectangle extends Forme {

	double longueur;
	double largeur;
	
	
	/**
	 * Constructeur
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}


	@Override
	public
	double calculerSurface() {
		// TODO Auto-generated method stub
		return this.longueur*this.largeur;
	}


	@Override
	public
	double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2*this.longueur+2*this.largeur;
	}
}

/**
 * 
 */
package TP5;

/**
 * @author vokankocak
 *
 */
public class Rectangle implements ObjetGeometrique {

	double longueur;
	double largeur;
	
	
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	/** Constructeur
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	
	
	@Override
	public double perimetre() {
		
		return 2*(longueur*largeur);
	}
	@Override
	public double surface() {
		
		return longueur*largeur;
	}
	
	
}

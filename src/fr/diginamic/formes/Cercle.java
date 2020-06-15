/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author vokankocak
 *Cette class construit l'objet Cercle
 *et hérite de Forme.
 */
public class Cercle extends Forme{

	double rayon=0;

	/**
	 * Constructeur 
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		
		return Math.pow(this.rayon, 2)*Math.PI;
	}

	@Override
	public double calculerPerimetre() {
		
		return this.rayon*2*Math.PI;
	}
	
	
}

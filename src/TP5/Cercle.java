/**
 * 
 */
package TP5;

/**
 * @author vokankocak
 *
 */
public class Cercle implements ObjetGeometrique{

	double rayon;

	
	
	/** Constructeur
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		
		return 2*rayon*Math.PI;
	}

	@Override
	public double surface() {
		
		return Math.PI*rayon*rayon;
	}
	
	
}

/**
 * 
 */
package fr.diginamic.maison;

/**
 * @author vokankocak
 * Class abstraite
 */
public abstract class Piece {

	protected double superficie;
	protected double numeroEtage;
	
	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public Piece(double superficie, double numeroEtage) {
		super();
		this.superficie = superficie;
		this.numeroEtage = numeroEtage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getNumeroEtage() {
		return numeroEtage;
	}

	public void setNumeroEtage(double numeroEtage) {
		this.numeroEtage = numeroEtage;
	}
	
	
	
}

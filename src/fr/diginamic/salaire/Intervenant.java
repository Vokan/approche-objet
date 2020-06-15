/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author vokankocak
 *
 */
public abstract class Intervenant {

	protected String nom;
	protected String prenom;
	
	public Intervenant(String nom, String prenom) {
	
	}

	public abstract double getSalaire();
	
}

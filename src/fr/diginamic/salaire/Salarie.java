/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author vokankocak
 * Salarie est la class fille de la class intervenant
 */
public class Salarie extends Intervenant{
	
	/**
	 * Attribut d'instance.
	 */
	protected double salaireMensuel;
	
	
	
	/**
	 * @param salaireMensuel
	 */
	
	// 0verride
	// Constructeur
	public Salarie(double salaireMensuel,String nom, String prenom) {
		super(nom,prenom);
		this.salaireMensuel = salaireMensuel;
	}

	// methode que retourne salaire.

	@Override
	public double getSalaire() {
		
		return salaireMensuel;
	}

	
	
}

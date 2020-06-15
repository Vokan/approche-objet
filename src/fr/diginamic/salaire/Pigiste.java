/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author vokankocak
 *
 */
public class Pigiste extends Intervenant{

	/**
	 * Attributs
	 */
	
	protected double nbDeJoursParMois;
	protected double montantJournalier;
	
	
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param nbDeJoursParMois
	 * @param montantJournalier
	 */
	
	/**
	 * Constructeur
	 */
	public Pigiste(String nom, String prenom, double nbDeJoursParMois, double montantJournalier) {
		super(nom, prenom);
		this.nom=nom;
		this.prenom=prenom;
		this.nbDeJoursParMois = nbDeJoursParMois;
		this.montantJournalier = montantJournalier;
	}


	// methode getSalaire qui retourne le salaire
	
	@Override
	public double getSalaire() {
		double salairePigiste = this.nbDeJoursParMois*this.montantJournalier;
		return salairePigiste;
	}

	// methode getStatus qui retourne le statut 
	@Override
	public String getStatus() {
		
		return "Pigiste";
	}
	

}

/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author vokankocak
 *
 */
public abstract class Intervenant {

	/**
	 * Variable d'instance
	 */
	protected String nom;
	protected String prenom;
	
	public Intervenant(String nom, String prenom) {
	
	}
	/**
	 * Méthode abstraite.
	 * @return
	 */
	
	// création d'une class abstraite getStatus
	// qu'on pourra redefinir dans
	// dans les class filles
	public abstract double getSalaire();
	
	
	// création d'une class abstraite getStatus
	// qu'on pourra redefinir dans
	// dans les class filles
	public abstract String getStatus();
	
	// methode qui affiche toutes les données.
	// va être appelé par les instances de la class testIntervenant
	public void afficherDonner() {
		System.out.println("L'intervenant a pour nom et prénom : "+nom+" "+prenom+" ,son statut est: "+ getStatus()+" et il est payé: "+getSalaire()+"euros." );
	}

}


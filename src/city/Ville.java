/**
 * 
 */
package city;

/** présente la ville
 * @author vokankocak
 *
 */
public class Ville {
	
	/** nom de la ville*/
	String nom;
	
	/** nombre d'habitant*/
	int nbHabitants;
	
	
	
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom=nom;
		this.nbHabitants=nbHabitants;
	}

		public String toString(){
		return "nom de la ville "+nom+" nombre d'habitant "+nbHabitants;
	}
	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/** Getter
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}



	/** Setter
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	

}
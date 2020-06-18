/**
 * 
 */
package sets;


/**
 * @author vokankocak
 *
 */
public class Pays implements Comparable<Pays>{

	private String nom;
	private int population;
	private int pibHabitant;
	/** Constructeur
	 * @param nom
	 * @param population
	 * @param pibHabitant
	 */
	public Pays(String nom, int population, int pibHabitant) {
		super();
		this.nom = nom;
		this.population = population;
		this.pibHabitant = pibHabitant;
	}
	
	/// méthode pour comparer
	
	public int compareTo(Pays nom) {
		int result = this.nom.compareTo(nom.getNom());
		return result;

	}
	
	public String toString () {
		return nom + "population "+ population + "PIB " +pibHabitant;
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
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/** Setter
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	/** Getter
	 * @return the pibHabitant
	 */
	public int getPibHabitant() {
		return pibHabitant;
	}
	/** Setter
	 * @param pibHabitant the pibHabitant to set
	 */
	public void setPibHabitant(int pibHabitant) {
		this.pibHabitant = pibHabitant;
	}
	
	
}


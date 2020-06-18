package entites;

public class AdressePostale {

	/**
	 * variable d'intance int numeroDeRue.
	 */
	public int numeroDeRue;
	/**
	 * variable d'instance string libelleDeLaRue
	 */
	public String libelleDeLaRue;
	/**
	 * variable d'instance int codePostal
	 */
	public int codePostal;
	/**
	 * variable d'instance String ville 
	 */
	public String ville;

	/**
	 * Constructeur
	 * @param nvNumRue
	 * @param nvLibelleDeLaRue
	 * @param nvCodePostal
	 * @param nvVille
	 */
	public AdressePostale (int nvNumRue,String nvLibelleDeLaRue, int nvCodePostal, String nvVille){
		numeroDeRue = nvNumRue;
		libelleDeLaRue = nvLibelleDeLaRue;
		codePostal = nvCodePostal;
		ville = nvVille;
	}
		public String toString() {
		  return " adresse : " + numeroDeRue + " " + libelleDeLaRue + " " + codePostal + " " + ville ;
	
	}
}



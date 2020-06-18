package entites;




public class Personne {

	/**
	 * variable string nom
	 */
	public static String nom;
	/**
	 * variable string lePrenom
	 */
	public static String lePrenom;
	/**
	 * variable Adresses adresse
	 */
	public static AdressePostale adresse;
	
	/**
	 * Constructeur
	 * @param nom
	 * @param lePrenom
	 * @param adresse
	 */
	public Personne(String nom, String lePrenom, AdressePostale adresse) {
	
		Personne.nom = nom;
		Personne.lePrenom = lePrenom;
		Personne.adresse = adresse;
	}
	
	/**
	 * Méthode afficherNomPrenom
	 */
	public void afficherNomPrenom () {
		
		
	System.out.println(lePrenom +" "+ nom.toUpperCase());
		
		
	}	
	/**
	 * 
	 * @param nvNom
	 */
	public void modifNom (String nvNom) {
		 nom =nvNom;
	}
	/**
	 * 
	 * @param nvPrenom
	 */
	public void modifPrenom (String nvPrenom) {
		lePrenom =nvPrenom;
	}
	/**
	 * 
	 * @param adresse
	 */
	public void nvAdressePostale (AdressePostale adresse) {
		Personne.adresse = adresse;
	}
	/**
	 * 
	 * @param nvNom
	 * @return nom
	 */
	public static String retourNom (String nvNom) {
		nom=nvNom;
		return nom;
	}
	/**
	 * 
	 * @param nvPrenom
	 * @return lePrenom
	 */
	public static String retourPrenom (String nvPrenom) {
		lePrenom=nvPrenom;
		return lePrenom;
	}
	/**
	 * 
	 * @param nvAdresse
	 * @return adresse
	 */
	public static AdressePostale retourAdressePostale (AdressePostale nvAdresse) {
		adresse=nvAdresse;
		return adresse;
	}
	
	
	
	
	
}

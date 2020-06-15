package entites;

public class Personne {

	//variable d'instance
	public static String nom;
	public static String lePrenom;
	public static AdressePostale adresse;
	
	
	
	//Affichage 
	public void afficherNomPrenom () {
		
		
	System.out.println(lePrenom +" "+ nom.toUpperCase());
		
		
	}	
	// méthodes qui modifie nom lePrenom et adresse
	public void modifNom (String nvNom) {
		 nom =nvNom;
	}

	public void modifPrenom (String nvPrenom) {
		lePrenom =nvPrenom;
	}
	
	public void nvAdressePostale (AdressePostale adresse) {
		this.adresse = adresse;
	}
	public static String retourNom (String nvNom) {
		nom=nvNom;
		return nom;
	}
	public static String retourPrenom (String nvPrenom) {
		lePrenom=nvPrenom;
		return lePrenom;
	}
	public static AdressePostale retourAdressePostale (AdressePostale nvAdresse) {
		adresse=nvAdresse;
		return adresse;
	}
	public Personne(String nom, String lePrenom, AdressePostale adresse) {
	
		this.nom = nom;
		this.lePrenom = lePrenom;
		this.adresse = adresse;
	}
	
	
	
	
}

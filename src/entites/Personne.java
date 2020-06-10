package entites;

public class Personne {

	public String nom;
	public String lePrenom;
	public AdressePostale adresse;
	
	
	
	
	public void afficherNomPrenom () {
		
		
	System.out.print("prenom"+ nom.toUpperCase());
		
		
	}	
	
	public void modifNom (String nvNom) {
		nom =nvNom;
	}

	public void modifPrenom (String nvPrenom) {
		nom =nvPrenom;
	}
	
	public void nvAdressePostale (AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	
	public Personne(String nom, String lePrenom, AdressePostale adresse) {
	
		this.nom = nom;
		this.lePrenom = lePrenom;
		this.adresse = adresse;
	}
	
	
	
	
}

package essais;

import entites.AdressePostale;
import entites.Personne;

class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale emp = new AdressePostale (2, "Lansberg", 67100, "Strasbourg");
		Personne enp = new Personne ("Kocak","Vokan",emp);
		enp.afficherNomPrenom();
		enp.modifPrenom("Richard");
		enp.modifNom("Taffou");
		enp.afficherNomPrenom();
		
		
	//	Personne p = new Personne();
	//	p.nom = "Kocak";
	//	p.lePrenom ="Vokan";
		
	//	p.adresse = new AdressePostale();
		
	//	p.adresse.numeroDeRue = 5;
		
		
	//  Personne p2 = new Personne();
	}

}

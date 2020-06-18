package essais;

import entites.AdressePostale;
import entites.Personne;

class TestPersonne {

	public static void main(String[] args) {
		
		/**
		 * 
		 */
		AdressePostale emp = new AdressePostale (31, "Rue vermeer", 67100, "Strasbourg");
		Personne enp = new Personne ("Kocak","Vokan",emp);
		
		enp.afficherNomPrenom();
		
		enp.modifPrenom("Richard");
		enp.modifNom("Taffou");
		
		enp.afficherNomPrenom();
		
		
	}

}

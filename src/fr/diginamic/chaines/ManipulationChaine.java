/**
 * 
 */
package fr.diginamic.chaines;

import entites.Personne;
import fr.diginamic.banque.entites.Compte;

/**
 * @author vokankocak
 *
 */
public class ManipulationChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		String chaine = "Durand;Marcel;012543;1 523.5";
		
		// utilisation de la méthode charAt pour afficher le premier caractaire de chaine.

		char premierCaractere = chaine.charAt(0); 
		System.out.println("Premier caractère: " + premierCaractere);
		
	
		// utilisation de la méthode length pour afficher la taille de chaine.
		
		int tailleChaine = chaine.length(); 
		System.out.println("La taille de la chaine est: " + tailleChaine);
	
		
		// utilisation de la méthode indecOf() pour afficher le premier index de chaine.
		
		int premierIndexDeChaine = chaine.indexOf(';'); 
		System.out.println("L'index de ';' est: " + premierIndexDeChaine);
	
		
		// utilisation de la méthode substring() en l'a combinant avec la méthode indexOf pour afficher le nom.
		
		String extractionChaine = chaine.substring(0, premierIndexDeChaine); 
		System.out.println("l'éxtration correspond à : " + extractionChaine);

		
		// utilisation de la méthode toUpperCase() pour afficher le nom en majuscule.
		
		String extractionChaineEnMaj = chaine.substring(0, premierIndexDeChaine).toUpperCase(); 
		System.out.println("l'éxtration correspond à : " + extractionChaineEnMaj);
	
		
		// utilisation de la méthode toLowerCase() pour afficher le nom en minuscule.
		
		String extractionChaineEnMin = chaine.substring(0, premierIndexDeChaine).toLowerCase(); 
		System.out.println("l'éxtration correspond à : " + extractionChaineEnMin);
	
		
		// utilisation de la métode split() pour découper la chaine et
		// stocker les morceaux dans un tableau tabl.
		
		String[] table =  chaine.split(";");
		
		
		// création d'une boucle for pour afficher pour 
		// chaque morceau de chaque index de table.
		
		for (int i=0; i<table.length; i++) {
			System.out.println("l'index "+i+" a pour morceaux "+table[i]);
		}
		
		// question 8
		// création de l'instance client.
		
		Personne client = new Personne (table[0],table[1], null);
		
		// Suppression de l'espace dans "1523,5";
		
		String suppressionDeEspace = table[3].replace(" ","");
			
		double solde = Double.parseDouble(suppressionDeEspace);
	
		// instance de solde.
		Compte soldeDuCompte = new Compte (table[0],table[1],solde);
		System.out.println(soldeDuCompte);
		
	
	
	}

}


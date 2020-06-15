package fr.diginamic.banque.entites;

/**
 * @author vokankocak
 *
 */
public class Compte {

public String numeroDeCompte;
public int soldeDuCompte;

// Constructeur 

public Compte(String numeroDeCompte, int soldeDuCompte) {
	super();
	this.numeroDeCompte = numeroDeCompte;
	this.soldeDuCompte = soldeDuCompte;
}

//Constructeur
public Compte(String string, String string2, double solde) {
	}


// Overide
public String toString () {
	return numeroDeCompte +" "+ soldeDuCompte;
}


// getters et setters.
public String getNumeroDeCompte() {
	return numeroDeCompte;
}



public void setNumeroDeCompte(String numeroDeCompte) {
	this.numeroDeCompte = numeroDeCompte;
}



public int getSoldeDuCompte() {
	return soldeDuCompte;
}



public void setSoldeDuCompte(int soldeDuCompte) {
	this.soldeDuCompte = soldeDuCompte;
}
}
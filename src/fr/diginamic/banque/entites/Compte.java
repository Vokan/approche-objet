package fr.diginamic.banque.entites;

public class Compte {

public String numeroDeCompte;
public int soldeDuCompte;



public Compte(String numeroDeCompte, int soldeDuCompte) {
	super();
	this.numeroDeCompte = numeroDeCompte;
	this.soldeDuCompte = soldeDuCompte;
}
// Overide
public String toString () {
	return numeroDeCompte +" "+ soldeDuCompte;
}

// getter et setter des attribut.
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
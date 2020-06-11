package fr.diginamic.banque.entites;

public class Compte {

private int numeroDeCompte;
private int soldeDuCompte;



public Compte(int numeroDeCompte, int soldeDuCompte) {
	super();
	this.numeroDeCompte = numeroDeCompte;
	this.soldeDuCompte = soldeDuCompte;
}



public int getNumeroDeCompte() {
	return numeroDeCompte;
}



public void setNumeroDeCompte(int numeroDeCompte) {
	this.numeroDeCompte = numeroDeCompte;
}



public int getSoldeDuCompte() {
	return soldeDuCompte;
}



public void setSoldeDuCompte(int soldeDuCompte) {
	this.soldeDuCompte = soldeDuCompte;
}
}
package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private int tauxDeRemuneration;

	public CompteTaux(String numeroDeCompte, int soldeDuCompte,int tauxDeRemuneration) {
		super(numeroDeCompte, soldeDuCompte);
		this.tauxDeRemuneration = tauxDeRemuneration;
	
	}
	
	
	public int getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}


	public void setTauxDeRemuneration(int tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}


	//Override
	public String toString () {
		return tauxDeRemuneration+numeroDeCompte+soldeDuCompte;
		
	}
}

package fr.diginamic.banque.entites;




public class TesteBanque {

	public static void main(String[] args) {
		Compte premierCompte = new Compte("4598", 300000); //instance crée de la classe Compte po
			System.out.print(premierCompte);
	
		Compte[] comptes = new Compte [2];
		comptes[0]=new Compte ("DSJ002",200);
		comptes[1] = new CompteTaux("fnjksf003",340,3);
		
		for (int i = 0; i<comptes.length-1; i++ ) {
			System.out.println(comptes[i]+" ");
		}
	}
}

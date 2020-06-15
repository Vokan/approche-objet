/**
 * 
 */
package fr.diginamic.operations;

/**
 * @author vokankocak
 *
 */
public class CalculMoyenne {

	private double tabl[];
	

	/**
	 * @param attribue
	 */
	
	// constructeur de la class CalculMoyenne.
	// Construction d'un tableau de longeur 0.
	
	public CalculMoyenne() {
		this.tabl = new double [0];
		}
	
	// Agrandisement de tabl par implémentation via un boucle for.
	// création d'une nouvelle tabl temporaire  --> nvTabl
	
	public void ajout(double valeur) {
		double[] nvTabl = new double [tabl.length+1];
		
		for (int i=0; i<tabl.length; i++) {
			nvTabl[i]=tabl[i];
		}
	
	// Ajout du double valeur dans le tableau.
	
		nvTabl[nvTabl.length-1]= valeur;
	
	// Réinitialisation de tabl.
		this.tabl=nvTabl;
	}
	
	
	public double calcul(double somme) {
		
		
		for (int i=0; i<this.tabl.length; i++) {
			somme = somme + this.tabl[i];
		}
		return somme/this.tabl.length;
}
}
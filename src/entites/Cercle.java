package entites;

/**
 * @author vokankocak
 * Ceci est la classe Cercle;
 * Elle a comme unique argument rayon.
 */
public class Cercle {

	 /** Definition de l'argument */
	
	private double rayon;    

	
	// Initialisation des getters et setters.
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	
	
	// Génération du constructeur
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	
	
	 // Méthode pour retourner le perimetre d'un cercle
	
	public double calculPerimetreCercle (double rayon){
		return rayon*2*Math.PI;
		
	}

	
	
	// Méthode pour retourner la surface d'un cercle /
	
	public double calculeSurfaceCercle (double rayon){
		return Math.pow(rayon, 2)*Math.PI;

	}
}
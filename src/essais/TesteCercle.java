package essais;

import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

/**
 * @author vokankocak
 * Cette classe va tester les methodes de la classe Cercle
 * avec des appels de méthodes de la class Cercle
 * et la création de trois cercles (Cercle1,Cercle2,Cercle3)
 */

public class TesteCercle {

	public static void main(String[] args) {

		// initialisation des deux cercles.
		
		Cercle cercle1 =new Cercle(4);
		
		//Appel des méthodes.
		double resultatP = cercle1.calculPerimetreCercle(cercle1.getRayon());
		double resultatS = cercle1.calculeSurfaceCercle(cercle1.getRayon());
		
		
		//Appel des méthodes.
		Cercle cercle2 =new Cercle(5);
		double resultatP2 = cercle2.calculPerimetreCercle(cercle2.getRayon());
		double resultatS2 = cercle2.calculeSurfaceCercle(cercle2.getRayon()); 
		
		// Appel de la métode cercleFactory de la classe CercleFactory et création du cercle3.
		
		Cercle cercle3 = CercleFactory.cercleFactory(6);
		double resultatP3 = cercle3.calculPerimetreCercle(cercle3.getRayon());
		double resultatS3 = cercle3.calculeSurfaceCercle(cercle3.getRayon());
		
		
		//affichage du périmetre et de la surface du cercle1, du cercle2 et du cercle3.
		
		System.out.println("Le périmetre du cercle1 est: "+resultatP+ " cm" +" et sa surface est de: "+ resultatS+ " cm2");
		System.out.println("Le périmetre du cercle2 est: "+resultatP2+ " cm" +" et sa surface est de: "+ resultatS2+ " cm2");
		System.out.println("Le périmetre du cercle2 est: "+resultatP3+ " cm" +" et sa surface est de: "+ resultatS3+ " cm2");
	}

}

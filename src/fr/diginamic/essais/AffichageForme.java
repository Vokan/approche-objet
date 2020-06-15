/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.formes.Forme;


/**
 * @author vokankocak
 *
 */
public class AffichageForme {

	
	public void afficher (Forme forme) { 
			
		System.out.println("le périmétre de la forme est: "+forme.calculerPerimetre()+ " et sa surface est: " + forme.calculerSurface());
		}

	}



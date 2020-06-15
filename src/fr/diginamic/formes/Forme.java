/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author vokankocak
 * La class forme est la 
 * classe mère des class Cercle, Rectangle
 * et Carré. 
 * La class forme est une class abstraite.
 */
public abstract class Forme {

	//Méthode abstraite calculerSurface.
	
	public abstract double calculerSurface();

	
	// Méthode abstraite calculerPerimetre.
	
	public abstract double calculerPerimetre ();
	
}

/**
 * 
 */
package fr.diginamic.utils;

import entites.Cercle;

/**
 * @author vokankocak
 *
 */
public class CercleFactory {

	public static Cercle cercleFactory(double rayon) {
		Cercle nvCercle = new Cercle(rayon);
		return nvCercle;
	}
}

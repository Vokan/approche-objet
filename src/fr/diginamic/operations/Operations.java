/**
 * 
 */
package fr.diginamic.operations;

/**
 * @author vokankocak
 *Ceci est la classe Operations
 *Elle possède une méthode calcule
 */
public class Operations {

	//initialisation de la méthode calcul avec son corps
	
	public static double calcul(double a, double b, char cc) {
		
		
		// conditions
		switch (cc) {
		
		
		case ('+') :return a+b;
		
		case ('-') : return a-b;
		
		case ('/') : return a/b;
		
		case ('*') : return a*b;
		
		default:
			break;
		}
		return 0;
	}
}
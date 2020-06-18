/**
 * 
 */
package TP5;

/**
 * @author vokankocak
 *
 */
public class TestObjetGeometrique {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ObjetGeometrique [] objet= new ObjetGeometrique [2];
		objet [0]= new Cercle(2.0);
		objet [1]= new Rectangle(5.0, 10.0);

		for (int i = 0; i<objet.length; i++) {
			System.out.println("perimetre :"+ objet[i].perimetre());
			System.out.println("surface: "+ objet[i].surface());
		}
	}

}

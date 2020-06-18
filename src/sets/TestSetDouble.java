/**
 * 
 */
package sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author vokankocak
 *
 */
public class TestSetDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Set<Double> set = new HashSet<>();
			set.add(1.5);
			set.add(8.25);
			set.add(-7.32);
			set.add(13.3);
			set.add(-12.45);
			set.add(48.5);
			set.add(0.01);
	
			
	for (Double element : set) {
		System.out.print(element+" ");
	}
	
	// saut de ligne
	System.out.println("\n");
	
	// recherche du max
	double max=Integer.MIN_VALUE;
	for (Double element : set) {
	if (element >max) {
		 max = element;
		}
	
	}
	 // affchage de la valeur max
	 System.out.print("La valeure max est: "+max);
	
	 	// recherche du min
		double min=Integer.MAX_VALUE;
		for (Double element : set) {
		if (element <min) {
			 min = element;
	}
}		// suppression du min
		set.remove(min);
		
		// saut de ligne
		System.out.println("\n");
		
		// affichage de la nouvelle collection
		for (Double element : set) {
			System.out.print(element+" ");
}
	
}
}
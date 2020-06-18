/**
 * 
 */
package fr.diginamic.essais;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vokankocak
 *
 */
public class FusionListe {
	
	public static void main(String args[]) {
	
		List<String> liste1 = new ArrayList<String>(); 
	liste1.add("Rouge");
	liste1.add("Vert");
	liste1.add("Orange");
	
	
	
	List<String> liste2 = new ArrayList<String>();
	liste2.add("Blanc");
	liste2.add("Bleu");
	liste2.add("Orange");

	
	for (int i=0; i<liste1.size();i++) {
		for (int j=0; j<liste2.size();j++) {
	
			String liste3 = liste1.get(i)+liste2.get(j);
	
			 
	System.out.print(liste3+" ");
	}

	//liste3.addAll(liste1);
	//liste3.addAll(liste2);
	}
}
}
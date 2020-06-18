/**
 * 
 */
package essais;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import city.Ville;

/**
 * @author vokankocak
 *
 */
public class TestVille {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {

		
	List<Ville>list = new ArrayList<>();
		
	  Ville u1 = new Ville ("Nice",343000);
	  list.add(u1);	
	  list.add( new Ville( "Carcassonne", 47800));
      list.add( new Ville( "Narbonne", 53400));
      list.add( new Ville( "Lyon", 484000));
      list.add( new Ville( "Foix", 9700));
      list.add( new Ville( "Pau", 77200));
      list.add( new Ville( "Marseille", 850700));
      list.add( new Ville( "Tarbes", 40600));

      
      Ville plusGrandeVille = list.get(0);
      	for (Ville ville:list) {
      		if (ville.getNbHabitants()>plusGrandeVille.getNbHabitants()){
      		
      		plusGrandeVille = ville;
      		}
      	Ville plusPetiteVille = list.get(0);
      	for (Ville ville2:list) {
      		if (ville2.getNbHabitants()>plusPetiteVille.getNbHabitants()){
      		
      		plusGrandeVille = ville2;
      	}
	}
}
	}
}
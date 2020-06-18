/**
 * 
 */
package map;

import java.util.HashMap;
import java.util.Iterator;


/**
 * @author vokankocak
 *
 */
public class CreationMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		HashMap<String, Integer> mapSalaire = new HashMap<>();
			mapSalaire.put("Paul", 1750);
			mapSalaire.put("Hichame", 1825);
			mapSalaire.put("Yu",2250);
			mapSalaire.put("Ingrid",2015);
			mapSalaire.put("Chantal",2418);

			//Iterator<Integer> valuesIte = mapSalaire.values().iterator(); 
			//while (valuesIte.hasNext()) {
			//Integer user = valuesIte.next();
		
			System.out.println(mapSalaire.size());
	
			System.out.println("\n------------");

	
			HashMap<Integer, String> mapVilles = new HashMap<>(); 
	
			mapVilles.put(13, "Marseille");
			mapVilles.put(34, "Montpellier");
			mapVilles.put(44, "Nantes");
			mapVilles.put(75, "Paris");
			mapVilles.put(31, "Toulouse");
			mapVilles.put(59, "Lille");
			mapVilles.put(69, "Lyon");
			mapVilles.put(33, "Bordeaux");
	
			Iterator<Integer> keysIte = mapVilles.keySet().iterator();
			while (keysIte.hasNext()) {
				Integer clés = keysIte.next();
				
			System.out.print(clés+" ");
			
			}
			
			System.out.println("\n------------");
			Iterator<String> valuesIte = mapVilles.values().iterator();
			while (valuesIte.hasNext()) {
				String villes = valuesIte.next();
				
				System.out.print(villes+" ");
	}
				System.out.println("\n------------");
				System.out.println(mapVilles.size());
}	
}

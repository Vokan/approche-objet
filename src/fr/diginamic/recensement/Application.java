/**
 * 
 */
package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import fr.diginamic.recensement.Ville;

/**
 * code region;Nom de la region;Code departement;Code arrondissement;
 * Code canton;Code commune;
 * Nom de la commune;Population municipale;Population comptee à part;Population totale;
 */
/**
 * @author vokankocak
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		File file = new File ("/Users/vokankocak/Documents/FormationDiginamic/JavaApprocheObjet/TP/TPJ5J7/recensement 2016.csv");
		List<String> lignes = FileUtils.readLines(file, "UTF-8");
		
		
		/**
		 * Création d'une liste lvilles, d'une map mvilles
		 * et d'un set svilles. 
		 */
		List<Ville> lvilles = new ArrayList<>();
		Map<String, Ville> mvilles = new HashMap<>();
		Set<Ville> svilles = new HashSet<>();

		/**
		 * On supprime la première ligne car elle ne
		 * contient pas d'int.
		 */
		lignes.remove(0);
		
		/**
		 * Boucle sur la liste  + affichage de la liste.
		 */
		
		for (String ligne: lignes) {
			Ville ville = new Ville(ligne);
			
			//System.out.println(ligne); 			//	 ancien affichage 
			
			
			System.out.println(ville.toString());
			
			/** on remplie la liste et le map*/
			lvilles.add(ville);
			mvilles.put(ville.getNomDeLaCommune(), ville);
			// todo remplir le set
		}
		
		System.out.println("Nombre de lignes :" + lignes.size());
		
		
		
		/** recherchde de Montpellier */
		
		System.out.println("3. Chercher Montpellier :");
		System.out.println(mvilles.get("Montpellier").toString());

		/** population total de l'Hérault*/
		
		System.out.println("4. Total population Hérault :");
		int totalpop = 0;
		for (Ville v: lvilles) {
			if (v.getCodeDepartement().equals("34")) { /* Hérault -> 34 */
				//totalpop += v.getPopulationTotale();
				totalpop = totalpop + v.getPopulationTotale();
			}
		}
		
		System.out.println("Population totale de l'Hérault = " + totalpop);

		
		/** recherche du nombred'habitant de la ville la plus
		 * petite de l'Hérault */
		
		System.out.println("4. Total population Hérault :");
		int max = 10000000;
		for (Ville v: lvilles) {
			if (v.getCodeDepartement().equals("34")) { /* Hérault -> 34 */
				if (v.getPopulationTotale() < max) {
					max = v.getPopulationTotale();
				}
			}
		}
		System.out.println("Population min de l'Hérault = " + max);

		/** l'affichage de la population totale et l'affichage de la ville
		 *  avec la pupulation la plus faible est faite à partir de la 
		 *  même boucle dans ce cas là.
		 */
		System.out.println("4+5 :");
		totalpop = 0;
		max = 10000000;
		for (Ville v: lvilles) {
			if (v.getCodeDepartement().equals("34")) { /* Hérault -> 34 */
				totalpop = totalpop + v.getPopulationTotale();
				if (v.getPopulationTotale() < max) {
					max = v.getPopulationTotale();
				}
			}
		}
		System.out.println("Population totale de l'Hérault = " + totalpop);
		System.out.println("Population min de l'Hérault = " + max);

		// 6.
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}

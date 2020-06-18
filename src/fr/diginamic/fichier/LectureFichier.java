
package fr.diginamic.fichier;

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
 * code région;Nom de la région;Code département;Code arrondissement;
 * Code canton;Code commune;
 * Nom de la commune;Population municipale;Population comptée à part;Population totale;
 */
/**
 * @author vokankocak
 *
 */

public class LectureFichier {

	
	 //@param args
	 
	public static void main(String[] args) {
		try {
		File file = new File ("/Users/vokankocak/Documents/FormationDiginamic/JavaApprocheObjet/TP/TPJ5J7/recensement 2016.csv");
		List<String> lignes = FileUtils.readLines(file, "UTF-8");
		
		/**
		 * Boucle sur la liste  + affichage de la liste.
		 */
		for (String ligne: lignes){ 
			System.out.println(ligne);
		
			
			
		}
		System.out.println("Nombre de lignes :" + lignes.size());
		
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

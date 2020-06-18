/**
 * 
 */
package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author vokankocak
 *
 */

	public class TestSetPays {

		public static void main(String[] args) {
			
			// Initialisation d'un Set
			Set<Pays> set = new HashSet<>();
			
			// Remplissage du Set
			set.add(new Pays("USA", 328_239_523, 62606));
			set.add(new Pays("France", 69_861_344, 43551));
			set.add(new Pays("Allemagne", 82_801_531, 50206));
			set.add(new Pays("UK", 63_421_628, 43620));
			set.add(new Pays("Italie", 61_302_519, 37970));
			set.add(new Pays("Japon", 124_856_424, 42659));
			set.add(new Pays("Chine", 1_408_089_559, 16624));
			set.add(new Pays("Russie", 126_434_660, 27900));
			set.add(new Pays("Inde", 1_386_249_417, 5174));
			

			
			System.out.println(set);
			
			// Recherchez le pays avec le PIB/habitant le plus important
			Pays paysPibMax = set.iterator().next();
			
			for (Pays element : set) {
				if (element.getPibHabitant() > paysPibMax.getPibHabitant() ){
					paysPibMax = element;
				}
			}
			System.out.println();
			
			System.out.println("Le pays avec le PIB/habitant le plus important est : " + paysPibMax);
					
			// Recherchez le pays avec le PIB total le plus important
			Pays paysPibTotal = set.iterator().next();
			for (Pays element : set) {
				if (element.getNom() * element.getPopulation() > paysPibTotal.getPibHabitant() * paysPibTotal.getPopulation()) {
					paysPibTotal = element;
				}
			}
			System.out.println();

			System.out.println("Le pays avec le PIB total le plus important est : " + paysPibTotal + ", il est de " + paysPibTotal.getPibHabitant() * paysPibTotal.getPopulation());

			// Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
			Pays paysPibTotalMin = set.iterator().next();
			for (Pays element : set) {
				if (element.getPibHabitant() * element.getPopulation() < paysPibTotalMin.getPibHabitant() * paysPibTotalMin.getPopulation()) {
					paysPibTotalMin = element;
				}
			}
			
			System.out.println();
			System.out.println("Le pays ayant le PIB total le plus faible est : " + paysPibTotalMin.getNom() + ", avec " + paysPibTotalMin.getPibHabitant() * paysPibTotalMin.getPopulation());
			
			System.out.println();
			
			paysPibTotalMin.setNom(paysPibTotalMin.getNom().toUpperCase());
			System.out.println(set);
			
			// Supprimez le pays dont le PIB total est le plus petit
			set.remove(paysPibTotalMin);
			
			System.out.println();
			
			System.out.println("La set final est : " + set);

			
			// tri des pays par ordre alphabetique.
			
			List<Pays> listePays = new ArrayList<>();
			listePays.addAll(set);	
			
		
		}

	}



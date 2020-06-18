/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vokankocak
 *
 */
public class Recensement {

	private List<Ville>villes = new ArrayList<>();

	/** Getter
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

	/** Setter
	 * @param villes the villes to set
	 */
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	
}

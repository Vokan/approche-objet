/**
 * 
 */
package fr.diginamic.recensement;

/**
 * @author vokankocak
 *
 */
public class Ville {

	private String codeRegion;
	private String nomDeLaRegion;
	private String codeDepartement;
	private String codeDeLaCommune;
	private String nomDeLaCommune;
	private int populationTotale;
	
	/** Constructeur
	 * @param codeRegion
	 * @param nomDeLaRegion
	 * @param codeDepartement
	 * @param codeDeLaCommune
	 * @param nomDeLaCommune
	 * @param populationTotale
	 */
	
	public Ville(String ligne) {
		String[] table = ligne.split(";");

		this.codeRegion = table[0];
		this.nomDeLaRegion = table[1];
		this.codeDepartement = table[2];
		this.codeDeLaCommune = table[5];
		this.nomDeLaCommune = table[6];
		this.populationTotale = Integer.parseInt(
			table[9].replace(" ", "").trim()
		);
	}
	
	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nomDeLaRegion=" + nomDeLaRegion + ", codeDepartement="
				+ codeDepartement + ", codeDeLaCommune=" + codeDeLaCommune + ", nomDeLaCommune=" + nomDeLaCommune
				+ ", populationTotale=" + populationTotale + "]";
	}

	/** Getter
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/** Setter
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/** Getter
	 * @return the nomDeLaRegion
	 */
	public String getNomDeLaRegion() {
		return nomDeLaRegion;
	}

	/** Setter
	 * @param nomDeLaRegion the nomDeLaRegion to set
	 */
	public void setNomDeLaRegion(String nomDeLaRegion) {
		this.nomDeLaRegion = nomDeLaRegion;
	}

	/** Getter
	 * @return the codeDeLaCommune
	 */
	public String getCodeDeLaCommune() {
		return codeDeLaCommune;
	}

	/** Setter
	 * @param codeDeLaCommune the codeDeLaCommune to set
	 */
	public void setCodeDeLaCommune(String codeDeLaCommune) {
		this.codeDeLaCommune = codeDeLaCommune;
	}

	/** Getter
	 * @return the nomDeLaCommune
	 */
	public String getNomDeLaCommune() {
		return nomDeLaCommune;
	}

	/** Setter
	 * @param nomDeLaCommune the nomDeLaCommune to set
	 */
	public void setNomDeLaCommune(String nomDeLaCommune) {
		this.nomDeLaCommune = nomDeLaCommune;
	}

	/** Getter
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	/** Setter
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

	/** Getter
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/** Setter
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

}

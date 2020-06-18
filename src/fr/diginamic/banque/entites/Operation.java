package fr.diginamic.banque.entites;

public abstract class Operation {
		
	public String dateDeOperation;
	public int montantDeOperation;
	
	
	/**
	 * Constructeur
	 * @param dateDeOperation
	 * @param montantDeOperation
	 */
	
	public Operation(String dateDeOperation, int montantDeOperation) {
		super();
		this.dateDeOperation = dateDeOperation;
		this.montantDeOperation = montantDeOperation;
	}
	
	/**
	 * 
	 * @return dateDeOperation
	 */
	public String getDateDeOperation() {
		return dateDeOperation;
	}
	
	/**
	 * 
	 * @param dateDeOperation
	 */
	public void setDateDeOperation(String dateDeOperation) {
		this.dateDeOperation = dateDeOperation;
	}
	
	/**
	 * 
	 * @return montantDeOperation
	 */
	public int getMontantDeOperation() {
		return montantDeOperation;
	}
	/**
	 * 
	 * @param montantDeOperation
	 */
	public void setMontantDeOperation(int montantDeOperation) {
		this.montantDeOperation = montantDeOperation;
	}
	
	//Overite
	/**
	 * La methode String toString() va permetre de
	 * retourner un string qui est textuelment l'objet
	 * qui etait en mémoire et ilisible.
	 */
	public String toString() {
	return dateDeOperation+ " "+montantDeOperation; 
			}
	
}

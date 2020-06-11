package fr.diginamic.banque.entites;

public abstract class Operation {
		
	public String dateDeOperation;
	public int montantDeOperation;
	public Operation(String dateDeOperation, int montantDeOperation) {
		super();
		this.dateDeOperation = dateDeOperation;
		this.montantDeOperation = montantDeOperation;
	
	
	
	}
	public String getDateDeOperation() {
		return dateDeOperation;
	}
	public void setDateDeOperation(String dateDeOperation) {
		this.dateDeOperation = dateDeOperation;
	}
	public int getMontantDeOperation() {
		return montantDeOperation;
	}
	public void setMontantDeOperation(int montantDeOperation) {
		this.montantDeOperation = montantDeOperation;
	}
	
	//Overite
	public String toString() {
	return dateDeOperation+ " "+montantDeOperation; 
			}
	
}

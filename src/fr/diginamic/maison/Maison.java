/**
 * 
 */
package fr.diginamic.maison;


/**
 * @author vokankocak
 *
 */
public class Maison {

	Piece piece [];
	
	/**
	 * @param piece
	 */
	public Maison() {
		piece= new Piece [0];
	}

	private void ajoutPiece(Piece nouvellePiece) {
		
		// conditions qu'une piece existe
		if (nouvellePiece != null || nouvellePiece.getSuperficie()> 0 || nouvellePiece.getNumeroEtage()>=0) {
			
		// création d'une nouvelle table nvTable qui est égale à piece[] +1.
			
			Piece table[] = new Piece [piece.length +1];
			
			
			for (int i = 0; i<piece.length; i++) {
				table [i]= piece[i];
			}
				// On ajoute nouvellePiece à table.
				
				table[table.length]=nouvellePiece;
				
				
				piece = table;
				
				System.out.println("ajoute de la piece réussi");
				
		}
		else {
			System.out.println("echeque de l'ajout de la piece");
		}
	}
}

package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] tabl1= new Operation[4];
		tabl1[0]= new Credit("22/09/2022 12:00", 123);
		tabl1[1]= new Debit("22/09/2022 12:00", 12);
		tabl1[2]= new Credit("22/09/2022 12:00", 13);
		tabl1[3]= new Debit("22/09/2022 12:00", 167);

		for(int i =0; i<tabl1.length; i++) {
			
			System.out.println(tabl1[i]);
		}
	}

}

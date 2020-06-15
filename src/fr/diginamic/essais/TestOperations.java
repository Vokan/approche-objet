/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.Operations;
/**
 * @author vokankocak
 * 
 */
public class TestOperations {

	
	public static void main(String[] args) {
			
		double condi1 = Operations.calcul(5,10,'+');
		double condi2 = Operations.calcul(5,10,'-');
		double condi3 = Operations.calcul(5,10,'/');
		double condi4 = Operations.calcul(5,10,'*');
	
		System.out.println(condi1);
		System.out.println(condi2);
		System.out.println(condi3);
		System.out.println(condi4);
	}
	
}

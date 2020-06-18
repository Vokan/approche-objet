/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.List;


/**
 * @author vokankocak
 *
 */
public class  CreationListe {
	public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<>();
	
	for (int i=1; i<101;i++) {
		list.add(i);
	}

	System.out.println(list.size());
	
	}
}

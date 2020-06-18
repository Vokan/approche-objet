package essais;

import entites.AdressePostale;

class TestAdressePostale {
	
	public static void main(String[] args) {
		
		
		AdressePostale adresse1 = new AdressePostale (15, "rue du Landsberg", 67100, "Strasbourg");
		AdressePostale adresse2 = new AdressePostale (3, "rue Jaque Prévert", 68280, "Mulhouse");
		
		System.out.println(adresse1);
		System.out.println(adresse2);
	}
	
}

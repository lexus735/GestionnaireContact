package fr.gtm.gestionnaire;

public class MainGestionnaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numeroteur numeroteur = new Numeroteur();
		
		Contact c1 = new Personne ("MACRON" , "Emmanuel", "M." );
		c1.setTelephone("0789523162");
		Contact c2 = new Entreprise ("SNCF");
		c2.setTelephone("3635");
		

		numeroteur.add(c1);
		numeroteur.add(c2);
		
		numeroteur.telephoneATous();
		
}
	}

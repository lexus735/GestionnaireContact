package fr.gtm.gestionnaire;

public class Entreprise extends Contact {
	

		
		public Entreprise(String nom) {
			// TODO Auto-generated constructor stub
				super(nom);
		}
		
		@Override
		public String getNom() {
		// TODO Auto-generated method stub
		return " Entreprise  " +super.getNom();
		}
}

package fr.gtm.gestionnaire;

public class Contact {
		private String nom;
		private String avatar;
		private String telephone;
		
		
		public Contact(String nom) {
			// TODO Auto-generated constructor stub
			this.setNom(nom); 
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getAvatar() {
			return avatar;
		}


		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}


		public String getTelephone() {
			return telephone;
		}


		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}



		
}

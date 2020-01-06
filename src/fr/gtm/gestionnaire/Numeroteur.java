package fr.gtm.gestionnaire;

import java.util.ArrayList;

import java.util.List;

public class Numeroteur  {
	
		List<Contact> contacts = new ArrayList<Contact>();
		
		
		public void telephoneATous() {
			//methode pour appeler chaque contact et dire "bonjour Monsieur...."
				for (int i = 0; i < contacts.size(); i++) {
			System.out.print("Numero telephone" + " " + contacts.get(i).getTelephone());
			System.out.println("    Bonjour " + contacts.get(i).getNom());
				}
		}
		
		
	
		public void add(Contact contact) {
						contacts.add(contact);
			
		
		}
		}


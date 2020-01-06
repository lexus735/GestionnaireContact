package fr.gtm.gestionnaire;

public class Personne extends Contact {
	private String prenom;
	private String civilite;
	
	public Personne(String nom, String prenom, String civilite ) {
		super(nom);
		this.setPrenom(prenom);
		this.setCivilite(civilite);
	
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getCivilite() {
		return civilite;
	}



	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return getCivilite()+" " + super.getNom()+" "+ getPrenom();
	}

	
	


}

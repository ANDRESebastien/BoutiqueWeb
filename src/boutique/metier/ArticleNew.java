package boutique.metier;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ArticleNew {
	private String nom;
	private double prix;
	private String description;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
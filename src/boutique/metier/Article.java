package boutique.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@RequestScoped
public class Article {
	private String nom;
	private String erreurNom;

	private double prix;
	private String erreurPrix;
	
	private String description;
	
	public Article() {
		setErreurNom("");
		setErreurPrix("");
	}

	public String getErreurNom() {
		return erreurNom;
	}

	public void setErreurNom(String erreurNom) {
		this.erreurNom = erreurNom;
	}

	public String getErreurPrix() {
		return erreurPrix;
	}

	public void setErreurPrix(String erreurPrix) {
		this.erreurPrix = erreurPrix;
	}



	private String valider() {
		return null;
	}

	private String annuler() {
		return null;
	}

	private String ajaxPrix() {
		return null;
	}

	private String ajaxPrix(AjaxBehaviorEvent event) {
		return null;
	}

	private String ajaxNom() {
		return null;
	}

	private String ajaxNom(AjaxBehaviorEvent event) {
		return null;
	}

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
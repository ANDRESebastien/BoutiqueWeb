package boutique.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.AjaxBehaviorEvent;

import org.apache.openejb.client.corba.InstanceOf;

import javassist.expr.Instanceof;

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

	public String valider() {
		return null;
	}

	public String annuler() {
		return null;
	}

	public void ajaxNom(AjaxBehaviorEvent event) {
		// controle supp 10 car
		if (getNom().length() > 9) {
			setErreurNom("Il y a trop de caractères (max 10)");
		} else {
			setErreurNom("");
		}
	}

	public void ajaxPrix(AjaxBehaviorEvent event) {
		// devient rouge si négatif ou non numérique
		HtmlInputText txtPrix = (HtmlInputText) event.getSource();
		txtPrix.setStyle("background-color: red;");

		txtPrix.setStyleClass("saisieKO");
		System.out.println(this.getPrix());

		if (prix < 0) {
			setErreurPrix("Le prix ne peut pas être négatif");
		} else {
			setErreurPrix("");
			txtPrix.setStyle("background-color: none;");
			txtPrix.setStyleClass("saisieOK");
		}
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
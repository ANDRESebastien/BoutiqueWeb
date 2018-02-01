package boutique.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlOutputLabel;

@ManagedBean
@SessionScoped
public class LoginBean {
	private String login;
	private String motDePasse;
	private HtmlOutputLabel message;

	public String valider() {
		if (getLogin().equalsIgnoreCase("nom") && getMotDePasse().equalsIgnoreCase("mdp")) {
			this.message.setValue("Succès.");
			this.message.setStyle("color='blue'");
		} else {
			this.message.setValue("Echec.");
			this.message.setStyle("color='red'");
		}
		return null;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public HtmlOutputLabel getMessage() {
		return message;
	}

	public void setMessage(HtmlOutputLabel message) {
		this.message = message;
	}
}
package boutique.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class LoginBean {
	private String login;
	private String motDePasse;
	private HtmlOutputLabel message;

	public String connecter(ListeClient listeClient) {

		// ListeClient listeClient = (ListeClient)
		// FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get("listeClient");
		// System.out.println(listeClient);
		Client client = listeClient.verifierAuthentification(this.login, this.motDePasse);

		// if (getLogin().equalsIgnoreCase("nom") &&
		// getMotDePasse().equalsIgnoreCase("mdp"))
		if (client != null) {
			// On place le client trouvé dans l'espace de session
			// Il sera associé à la clé "clientAuthentifie"
			// uniquement si on a besoin des informations dans le reste du site
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("clientAuthentifie", client);

			return "visuCatalogue";
		} else {
			this.message.setValue("Echec.");
			this.message.setStyle("color: red");
			return null;
		}
	}
	
	
	public String evaluer(AjaxBehaviorEvent event) {
		System.out.println("Ajax " + this.login);
		return this.login;
	}

	public String deconnecter() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.invalidate();
		return "login";
	}

	public String deconnecter(HttpSession session) {
		session.invalidate();
		return "login";
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
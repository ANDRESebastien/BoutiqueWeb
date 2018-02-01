package boutique.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Client {
	private String nom;
	private String prenom;
	private int age;
	private String identifiant;
	private String motDePasse;
	private int genre;

	public String valider() {
		System.out.println("Client:valider(): " + this);
		return "login";
	}

	public String annuler() {
		System.out.println("Client:annuler(): " + this);
		return "login";
	}

	public String toString() {
		return "Nom=" + nom + ";Prénom=" + prenom + ";Age=" + age + ";Identifiant=" + identifiant + ";Genre=" + genre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

}

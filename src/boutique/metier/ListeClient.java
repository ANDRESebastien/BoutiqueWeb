package boutique.metier;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ListeClient {

	private List<Client> listeClient;

	public ListeClient() {
		this.listeClient = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			Client client = new Client();
			client.setNom("nom" + i);
			client.setPrenom("prenom" + i);
			client.setAge(15 + i);
			client.setIdentifiant("identifiant" + i);
			client.setMotDePasse("mdp");
			client.setGenre(1);
			this.ajouterClient(client);
		}
	}

	public String toString() {
		String retour = "";

		for (Client client : this.listeClient) {
			retour = retour + client.getIdentifiant() + ";" + client.getMotDePasse() + "\n";
		}
		return retour;
	}

	public void ajouterClient(Client client) {
		this.listeClient.add(client);
	}

	/**
	 * Vérifie l'authentification d'un client.
	 * 
	 * @param identifiant du client de type chaine de caractère.
	 * @param motDePasse du client de type chaine de caractère.
	 * @return Retourne un client s'il est trouvé.
	 */
	public Client verifierAuthentification(String identifiant, String motDePasse) {
		Client clientTrouve = null;
		for (Client client : this.listeClient) {
			if (client.getIdentifiant().equalsIgnoreCase(identifiant)
					&& (client.getMotDePasse().equalsIgnoreCase(motDePasse))) {
				clientTrouve = client;
				break;
			}
		}
		return clientTrouve;
	}
}

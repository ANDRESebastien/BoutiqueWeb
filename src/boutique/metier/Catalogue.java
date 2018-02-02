package boutique.metier;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.ListDataModel;

@ManagedBean
@ApplicationScoped
public class Catalogue extends ListDataModel<Article> {

	public Catalogue() {
		// Création de 10 articles dans une ArrayList pour simuler une BDD
		List<Article> listeArticle = new ArrayList<Article>();
		
		for (int i = 1; i < 11; i++) {
			Article article = new Article();
			article.setNom("nom"+i);
			article.setPrix(i*12.34);
			article.setDescription("description"+i);
			
			listeArticle.add(article);
		}
		
		// On alimente le catalogue (DataModel) avec la liste que l'on vient de créer
		this.setWrappedData(listeArticle);
	}
}
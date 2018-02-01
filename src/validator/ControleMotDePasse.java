package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class ControleMotDePasse implements Validator {

	public void validate(FacesContext contexte, UIComponent composant, Object oMotDePasse) throws ValidatorException {

		String motDePasse = (String) oMotDePasse;

		if (motDePasse.length() < 2) {
			throw new ValidatorException(new FacesMessage(" Le mot de passe doit contenir au moins deux caractères."));
		}
	}
}
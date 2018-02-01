package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class ControleLogin implements Validator {

	public void validate(FacesContext contexte, UIComponent composant, Object oLogin) throws ValidatorException {

		String login = (String) oLogin;

		if (login.length() < 2) {
			throw new ValidatorException(new FacesMessage(" Le login doit contenir au moins deux caractères."));
		}
	}
}
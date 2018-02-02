package boutique.metier;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class BoutiquePhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent event) {
		//System.out.println(" <<<<< Sortie dans la phase " + event.getPhaseId() + "\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		String nom = event.getPhaseId().toString();
		
		
		if (nom.equals("RENDER_RESPONSE 6")) {
			System.out.println();
		}
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		//System.out.println(" Entrée dans la phase " + event.getPhaseId() + " >>>>>>");
	}

	@Override
	public PhaseId getPhaseId() {
		// On renvoie la référence phase à laquelle ce listener est sensible.
		return PhaseId.ANY_PHASE;
	}

}

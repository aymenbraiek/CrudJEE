package com.formation.phasesListener;

public class LogPhaseListener implements javax.faces.event.PhaseListener
{
	
	
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void afterPhase(javax.faces.event.PhaseEvent e){
System.out.println("afterPhase "+e.getPhaseId());
}

public void beforePhase(javax.faces.event.PhaseEvent e) {
	System.out.println("beforePhase "+e.getPhaseId());
}

public javax.faces.event.PhaseId getPhaseId()
{
return javax.faces.event.PhaseId.ANY_PHASE;
}


}

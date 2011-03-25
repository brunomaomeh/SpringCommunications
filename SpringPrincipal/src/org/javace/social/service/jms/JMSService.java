package org.javace.social.service.jms;

public interface JMSService {
	
	public abstract void enviaParaAFila(String message);
	
	public abstract void enviaParaOTopico(String message);

}

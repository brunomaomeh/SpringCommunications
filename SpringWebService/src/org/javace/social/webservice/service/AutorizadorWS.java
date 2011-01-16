package org.javace.social.webservice.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface AutorizadorWS {

	Integer servico(@WebParam(name="numeroDoCartao") String value);

//	void cancelarVendaComMinuta(@WebParam(name="nsu") String nsu);
}

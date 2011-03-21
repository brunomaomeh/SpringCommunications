package org.javace.social.webservice.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ProdutorWS {

	public String servico(@WebParam(name="value") String value);

//	void cancelarVendaComMinuta(@WebParam(name="nsu") String nsu);
}

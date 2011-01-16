package org.javace.social.webservice.service.impl;

import javax.jws.WebService;

import org.javace.social.webservice.service.AutorizadorWS;
import org.springframework.stereotype.Service;

@Service("webService")
@WebService(targetNamespace = "http://v1.webservice.javacesocial", endpointInterface = "org.javace.social.webservice.service.AutorizadorWS", serviceName = "webService")
public class AutorizadorWSImpl implements AutorizadorWS {

	@Override
	public Integer servico(String valor) {
		return 1;
	}

//	@Override
//	public void cancelarVendaComMinuta(String nsu) {
//		autorizacaoDeVendaComMinutaService.cancela(new NSU(nsu));
//	}
}

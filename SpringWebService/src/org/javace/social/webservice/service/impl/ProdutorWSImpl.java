package org.javace.social.webservice.service.impl;

import javax.jws.WebService;

import org.javace.social.webservice.service.ProdutorWS;
import org.javace.social.webservice.service.ValueComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("produtorWS")
@WebService(targetNamespace = "http://v1.webservice.javacesocial", endpointInterface = "org.javace.social.webservice.service.ProdutorWS", serviceName = "produtorWS")
public class ProdutorWSImpl implements ProdutorWS {

	private final ValueComponent valueComponent;

	@Autowired
	public ProdutorWSImpl(ValueComponent valueComponent) {
		this.valueComponent = valueComponent;
	}
	
	@Override
	public String servico(String valor) {
		return valueComponent.getValue();
	}

//	@Override
//	public void cancelarVendaComMinuta(String nsu) {
//		autorizacaoDeVendaComMinutaService.cancela(new NSU(nsu));
//	}
}

package org.javace.social.service.impl;

import javacesocial.webservice.v1.AutorizadorWS;

import org.javace.social.service.WebService;
import org.springframework.stereotype.Service;

@Service
public class WebServiceImpl implements WebService {

	private final javacesocial.webservice.v1.WebService servico = new javacesocial.webservice.v1.WebService();
	private final AutorizadorWS webService = servico.getAutorizadorWSImplPort();

//	@Autowired
//	public WebServiceImpl(AutorizadorWS webService) {
//		this.webService = webService;
//		
//	}
	
	public void consome() {
		System.out.println(webService.servico("qualquer"));
		System.out.println("CONSUMIU");
	}

}

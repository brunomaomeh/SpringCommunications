package org.javace.social.service.app.impl;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.javace.social.service.app.WebService;
import org.javace.social.service.webservice.ProdutorWS;
import org.springframework.stereotype.Service;

@Service
public class WebServiceImpl implements WebService {

	private final javacesocial.webservice.v1.ProdutorWS servico = new javacesocial.webservice.v1.ProdutorWSLocator();
	private ProdutorWS webService;
	
	public WebServiceImpl() {
		try {
			webService = servico.getProdutorWSImplPort();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

	public String consome() {
		try {
			return webService.servico("qualquer");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return "";
	}

}

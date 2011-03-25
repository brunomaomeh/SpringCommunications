package org.javace.social.service.jms.impl;

import org.javace.social.service.jms.JMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JMSServiceImpl implements JMSService {

	private final JmsTemplate jmsTemplate;
	
	@Autowired
	public JMSServiceImpl(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void enviaParaAFila(String message) {
		jmsTemplate.convertAndSend("queue01", message);
	}

	public void enviaParaOTopico(String message) {
		// TODO Auto-generated method stub
		
	}
	
}


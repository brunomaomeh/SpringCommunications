package org.javace.social.service.jms.impl;

import org.javace.social.service.jms.JMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JMSServiceImpl implements JMSService {

	private final JmsTemplate jmsTemplateFila;
	private final JmsTemplate jmsTemplateTopico;
	
	@Autowired
	public JMSServiceImpl(JmsTemplate jmsTemplateFila, JmsTemplate jmsTemplateTopico) {
		this.jmsTemplateFila = jmsTemplateFila;
		this.jmsTemplateTopico = jmsTemplateTopico;
	}

	public void enviaParaAFila(String message) {
		jmsTemplateFila.convertAndSend(message);
	}

	public void enviaParaOTopico(String message) {
		jmsTemplateTopico.convertAndSend(message);
	}
	
}


package org.javace.social.controller;

import org.javace.social.service.jms.JMSService;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class FilaDeMensagemController {

	private final Result result;
	private final JMSService jmsService;

	public FilaDeMensagemController(Result result, JMSService jmsService) {
		this.result = result;
		this.jmsService = jmsService;
	}
	
	@Get
	@Path("/filaDeMensagem")
	public void index() { }
	
	@Post
	@Path("/filaDeMensagem/enviaParaAFila")
	public void enviaParaAFila(String mensagem) {
		jmsService.enviaParaAFila(mensagem);
		result.redirectTo(this).index();
	}
	
	@Post
	@Path("/filaDeMensagem/enviaParaOTopico")
	public void enviaParaOTopico(String mensagem) {
		jmsService.enviaParaOTopico(mensagem);
		result.redirectTo(this).index();
	}
	
}

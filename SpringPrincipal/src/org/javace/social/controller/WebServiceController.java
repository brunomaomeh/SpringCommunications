package org.javace.social.controller;

import org.javace.social.service.app.WebService;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class WebServiceController {

	private final Result result;
	private final WebService webService;

	@Autowired
	public WebServiceController(Result result, WebService webService) {
		this.result = result;
		this.webService = webService;
	}
	
	@Get
	@Path("/webService")
	public void index() {
		
	}
	
	@Post
	@Path("/webService/consome")
	public void consome() {
		String valorConsumido = webService.consome();
		result.include("valorConsumido", valorConsumido);
		result.forwardTo(this).index();
	}
	
}

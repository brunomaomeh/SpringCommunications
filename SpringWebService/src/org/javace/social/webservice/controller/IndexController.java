package org.javace.social.webservice.controller;

import org.javace.social.webservice.service.ValueComponent;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {

	private final Result result;
	private final ValueComponent valueComponent;

	public IndexController(Result result, ValueComponent valueComponent) {
		this.result = result;
		this.valueComponent = valueComponent;
	}
	
	@Path("/")
	public void index() {
	}
	
	@Post
	@Path("/webService/alteraValor")
	public void alteraValor(String valor) {
		this.valueComponent.setValue(valor);
		result.include("valor", valor);
		result.forwardTo(this).index();
	}
	
}

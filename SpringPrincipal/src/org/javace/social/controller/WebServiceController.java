package org.javace.social.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class WebServiceController {

	private final Result result;

	public WebServiceController(Result result) {
		this.result = result;
	}
	
	@Get
	@Path("/webService")
	public void index() {
		
	}
	
	@Post
	@Path("/webService/consome")
	public void consome() {
		System.out.println("consumiu");
		result.redirectTo(this).index();
	}
	
}

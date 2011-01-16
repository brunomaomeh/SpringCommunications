package org.javace.social.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class FilaDeMensagemController {

	private final Result result;

	public FilaDeMensagemController(Result result) {
		this.result = result;
	}
	
	@Get
	@Path("/filaDeMensagem")
	public void index() {
		
	}
	
	@Post
	@Path("/filaDeMensagem/envia")
	public void consome() {
		System.out.println("enviou");
		result.redirectTo(this).index();
	}
	
}

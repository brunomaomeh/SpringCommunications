package org.javace.social.webservice.service.impl;

import java.io.Serializable;

import org.javace.social.webservice.service.ValueComponent;
import org.springframework.stereotype.Component;

import br.com.caelum.vraptor.ioc.SessionScoped;

@Component
@SessionScoped
public class ValueComponentImpl implements Serializable, ValueComponent {

	private static final long serialVersionUID = 1L;
	private String value = "0";
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
}

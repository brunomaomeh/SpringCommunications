package org.javace.social.service.impl;

import java.util.List;

import org.javace.social.service.TopicoService;
import org.springframework.stereotype.Service;

@Service
public class TopicoServiceImpl implements TopicoService {

	public List<String> consome() {
		System.out.println("consumiu");
		return null;
	}

}

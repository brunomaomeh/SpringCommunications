jQuery("#mensagemParaFila").click(function() {
	jQuery.post('filaDeMensagem/enviaParaAFila', 
		{
			mensagem: jQuery('#mensagem').val()
		}, 
		function(data) {
		     alert("mensagem enviada para a fila");
		},
		"html");
	}
);

jQuery("#mensagemParaTopico").click(function() {
	jQuery.post('filaDeMensagem/enviaParaOTopico', 
		{
			mensagem: jQuery('#mensagem').val()
		},
		function(data) {
		     alert("mensagem enviada para o topico");
		},
		"html");
	}
);
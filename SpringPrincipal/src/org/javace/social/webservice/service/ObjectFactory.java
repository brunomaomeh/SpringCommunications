package org.javace.social.webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.javace.social.webservice.service
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _ServicoResponse_QNAME = new QName(
			"http://service.webservice.social.javace.org/", "servicoResponse");
	private final static QName _Servico_QNAME = new QName(
			"http://service.webservice.social.javace.org/", "servico");
	private final static QName _ServicoResponseReturn_QNAME = new QName("",
			"return");
	private final static QName _ServicoNumeroDoCartao_QNAME = new QName("",
			"numeroDoCartao");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: org.javace.social.webservice.service
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ServicoResponse }
	 * 
	 */
	public ServicoResponse createServicoResponse() {
		return new ServicoResponse();
	}

	/**
	 * Create an instance of {@link Servico }
	 * 
	 */
	public Servico createServico() {
		return new Servico();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ServicoResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.social.javace.org/", name = "servicoResponse")
	public JAXBElement<ServicoResponse> createServicoResponse(
			ServicoResponse value) {
		return new JAXBElement<ServicoResponse>(_ServicoResponse_QNAME,
				ServicoResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Servico }{@code
	 * >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.social.javace.org/", name = "servico")
	public JAXBElement<Servico> createServico(Servico value) {
		return new JAXBElement<Servico>(_Servico_QNAME, Servico.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code
	 * >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = ServicoResponse.class)
	public JAXBElement<Integer> createServicoResponseReturn(Integer value) {
		return new JAXBElement<Integer>(_ServicoResponseReturn_QNAME,
				Integer.class, ServicoResponse.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "numeroDoCartao", scope = Servico.class)
	public JAXBElement<String> createServicoNumeroDoCartao(String value) {
		return new JAXBElement<String>(_ServicoNumeroDoCartao_QNAME,
				String.class, Servico.class, value);
	}

}

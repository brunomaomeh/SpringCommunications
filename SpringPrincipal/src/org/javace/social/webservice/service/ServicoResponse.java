package org.javace.social.webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for servicoResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="servicoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicoResponse", propOrder = { "_return" })
public class ServicoResponse {

	@XmlElementRef(name = "return", type = JAXBElement.class)
	protected JAXBElement<Integer> _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link Integer }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<Integer> getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link Integer }
	 *            {@code >}
	 * 
	 */
	public void setReturn(JAXBElement<Integer> value) {
		this._return = ((JAXBElement<Integer>) value);
	}

}

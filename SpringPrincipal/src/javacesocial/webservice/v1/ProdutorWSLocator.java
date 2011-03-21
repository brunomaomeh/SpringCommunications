/**
 * ProdutorWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package javacesocial.webservice.v1;

public class ProdutorWSLocator extends org.apache.axis.client.Service implements javacesocial.webservice.v1.ProdutorWS {

    public ProdutorWSLocator() {
    }


    public ProdutorWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProdutorWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProdutorWSImplPort
    private java.lang.String ProdutorWSImplPort_address = "http://localhost:8080/SpringWebService/webservice/v1/WebService";

    public java.lang.String getProdutorWSImplPortAddress() {
        return ProdutorWSImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProdutorWSImplPortWSDDServiceName = "ProdutorWSImplPort";

    public java.lang.String getProdutorWSImplPortWSDDServiceName() {
        return ProdutorWSImplPortWSDDServiceName;
    }

    public void setProdutorWSImplPortWSDDServiceName(java.lang.String name) {
        ProdutorWSImplPortWSDDServiceName = name;
    }

    public org.javace.social.webservice.service.ProdutorWS getProdutorWSImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProdutorWSImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProdutorWSImplPort(endpoint);
    }

    public org.javace.social.webservice.service.ProdutorWS getProdutorWSImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            javacesocial.webservice.v1.ProdutorWSSoapBindingStub _stub = new javacesocial.webservice.v1.ProdutorWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getProdutorWSImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProdutorWSImplPortEndpointAddress(java.lang.String address) {
        ProdutorWSImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.javace.social.webservice.service.ProdutorWS.class.isAssignableFrom(serviceEndpointInterface)) {
                javacesocial.webservice.v1.ProdutorWSSoapBindingStub _stub = new javacesocial.webservice.v1.ProdutorWSSoapBindingStub(new java.net.URL(ProdutorWSImplPort_address), this);
                _stub.setPortName(getProdutorWSImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProdutorWSImplPort".equals(inputPortName)) {
            return getProdutorWSImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://v1.webservice.javacesocial", "produtorWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://v1.webservice.javacesocial", "ProdutorWSImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProdutorWSImplPort".equals(portName)) {
            setProdutorWSImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

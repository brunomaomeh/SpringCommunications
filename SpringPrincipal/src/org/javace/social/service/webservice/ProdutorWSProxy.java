package org.javace.social.service.webservice;
//package org.javace.social.webservice.service;
//
//public class ProdutorWSProxy implements org.javace.social.webservice.service.ProdutorWS_PortType {
//  private String _endpoint = null;
//  private org.javace.social.webservice.service.ProdutorWS_PortType produtorWS_PortType = null;
//  
//  public ProdutorWSProxy() {
//    _initProdutorWSProxy();
//  }
//  
//  public ProdutorWSProxy(String endpoint) {
//    _endpoint = endpoint;
//    _initProdutorWSProxy();
//  }
//  
//  private void _initProdutorWSProxy() {
//    try {
//      produtorWS_PortType = (new javacesocial.webservice.v1.ProdutorWS_ServiceLocator()).getProdutorWSImplPort();
//      if (produtorWS_PortType != null) {
//        if (_endpoint != null)
//          ((javax.xml.rpc.Stub)produtorWS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
//        else
//          _endpoint = (String)((javax.xml.rpc.Stub)produtorWS_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
//      }
//      
//    }
//    catch (javax.xml.rpc.ServiceException serviceException) {}
//  }
//  
//  public String getEndpoint() {
//    return _endpoint;
//  }
//  
//  public void setEndpoint(String endpoint) {
//    _endpoint = endpoint;
//    if (produtorWS_PortType != null)
//      ((javax.xml.rpc.Stub)produtorWS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
//    
//  }
//  
//  public org.javace.social.webservice.service.ProdutorWS_PortType getProdutorWS_PortType() {
//    if (produtorWS_PortType == null)
//      _initProdutorWSProxy();
//    return produtorWS_PortType;
//  }
//  
//  
//}
package webservice;

public class AlmacenVinosWSSoapProxy implements webservice.AlmacenVinosWSSoap {
  private String _endpoint = null;
  private webservice.AlmacenVinosWSSoap almacenVinosWSSoap = null;
  
  public AlmacenVinosWSSoapProxy() {
    _initAlmacenVinosWSSoapProxy();
  }
  
  public AlmacenVinosWSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initAlmacenVinosWSSoapProxy();
  }
  
  private void _initAlmacenVinosWSSoapProxy() {
    try {
      almacenVinosWSSoap = (new webservice.AlmacenVinosWSLocator()).getAlmacenVinosWSSoap();
      if (almacenVinosWSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)almacenVinosWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)almacenVinosWSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (almacenVinosWSSoap != null)
      ((javax.xml.rpc.Stub)almacenVinosWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservice.AlmacenVinosWSSoap getAlmacenVinosWSSoap() {
    if (almacenVinosWSSoap == null)
      _initAlmacenVinosWSSoapProxy();
    return almacenVinosWSSoap;
  }
  
  public webservice.ConsultaResponseConsultaResult consulta() throws java.rmi.RemoteException{
    if (almacenVinosWSSoap == null)
      _initAlmacenVinosWSSoapProxy();
    return almacenVinosWSSoap.consulta();
  }
  
  
}
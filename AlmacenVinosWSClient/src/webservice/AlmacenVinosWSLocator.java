/**
 * AlmacenVinosWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class AlmacenVinosWSLocator extends org.apache.axis.client.Service implements webservice.AlmacenVinosWS {

    public AlmacenVinosWSLocator() {
    }


    public AlmacenVinosWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AlmacenVinosWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AlmacenVinosWSSoap12
    private java.lang.String AlmacenVinosWSSoap12_address = "http://localhost:52606/AlmacenVinosWS.asmx";

    public java.lang.String getAlmacenVinosWSSoap12Address() {
        return AlmacenVinosWSSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AlmacenVinosWSSoap12WSDDServiceName = "AlmacenVinosWSSoap12";

    public java.lang.String getAlmacenVinosWSSoap12WSDDServiceName() {
        return AlmacenVinosWSSoap12WSDDServiceName;
    }

    public void setAlmacenVinosWSSoap12WSDDServiceName(java.lang.String name) {
        AlmacenVinosWSSoap12WSDDServiceName = name;
    }

    public webservice.AlmacenVinosWSSoap getAlmacenVinosWSSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AlmacenVinosWSSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAlmacenVinosWSSoap12(endpoint);
    }

    public webservice.AlmacenVinosWSSoap getAlmacenVinosWSSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservice.AlmacenVinosWSSoap12Stub _stub = new webservice.AlmacenVinosWSSoap12Stub(portAddress, this);
            _stub.setPortName(getAlmacenVinosWSSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAlmacenVinosWSSoap12EndpointAddress(java.lang.String address) {
        AlmacenVinosWSSoap12_address = address;
    }


    // Use to get a proxy class for AlmacenVinosWSSoap
    private java.lang.String AlmacenVinosWSSoap_address = "http://localhost:52606/AlmacenVinosWS.asmx";

    public java.lang.String getAlmacenVinosWSSoapAddress() {
        return AlmacenVinosWSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AlmacenVinosWSSoapWSDDServiceName = "AlmacenVinosWSSoap";

    public java.lang.String getAlmacenVinosWSSoapWSDDServiceName() {
        return AlmacenVinosWSSoapWSDDServiceName;
    }

    public void setAlmacenVinosWSSoapWSDDServiceName(java.lang.String name) {
        AlmacenVinosWSSoapWSDDServiceName = name;
    }

    public webservice.AlmacenVinosWSSoap getAlmacenVinosWSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AlmacenVinosWSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAlmacenVinosWSSoap(endpoint);
    }

    public webservice.AlmacenVinosWSSoap getAlmacenVinosWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservice.AlmacenVinosWSSoapStub _stub = new webservice.AlmacenVinosWSSoapStub(portAddress, this);
            _stub.setPortName(getAlmacenVinosWSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAlmacenVinosWSSoapEndpointAddress(java.lang.String address) {
        AlmacenVinosWSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservice.AlmacenVinosWSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                webservice.AlmacenVinosWSSoap12Stub _stub = new webservice.AlmacenVinosWSSoap12Stub(new java.net.URL(AlmacenVinosWSSoap12_address), this);
                _stub.setPortName(getAlmacenVinosWSSoap12WSDDServiceName());
                return _stub;
            }
            if (webservice.AlmacenVinosWSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                webservice.AlmacenVinosWSSoapStub _stub = new webservice.AlmacenVinosWSSoapStub(new java.net.URL(AlmacenVinosWSSoap_address), this);
                _stub.setPortName(getAlmacenVinosWSSoapWSDDServiceName());
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
        if ("AlmacenVinosWSSoap12".equals(inputPortName)) {
            return getAlmacenVinosWSSoap12();
        }
        else if ("AlmacenVinosWSSoap".equals(inputPortName)) {
            return getAlmacenVinosWSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "AlmacenVinosWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "AlmacenVinosWSSoap12"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "AlmacenVinosWSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AlmacenVinosWSSoap12".equals(portName)) {
            setAlmacenVinosWSSoap12EndpointAddress(address);
        }
        else 
if ("AlmacenVinosWSSoap".equals(portName)) {
            setAlmacenVinosWSSoapEndpointAddress(address);
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

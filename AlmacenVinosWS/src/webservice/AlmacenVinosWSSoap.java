/**
 * AlmacenVinosWSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface AlmacenVinosWSSoap extends java.rmi.Remote {
    public webservice.ConsultaResponseConsultaResult consulta() throws java.rmi.RemoteException;
    public boolean comprobarStock(java.lang.String v) throws java.rmi.RemoteException;
    public int cambiarStock(java.lang.String s, java.lang.String v) throws java.rmi.RemoteException;
}

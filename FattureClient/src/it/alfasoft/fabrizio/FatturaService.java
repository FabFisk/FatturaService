/**
 * FatturaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.fabrizio;

public interface FatturaService extends javax.xml.rpc.Service {
    public java.lang.String getFatturaAddress();

    public it.alfasoft.fabrizio.Fattura getFattura() throws javax.xml.rpc.ServiceException;

    public it.alfasoft.fabrizio.Fattura getFattura(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

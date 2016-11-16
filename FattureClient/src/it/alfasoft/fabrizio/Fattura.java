/**
 * Fattura.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.fabrizio;

public interface Fattura extends java.rmi.Remote {
    public it.alfasoft.fabrizio.FatturaModel[] getFatture() throws java.rmi.RemoteException;
    public it.alfasoft.fabrizio.FatturaModel getFattura(java.lang.String codice) throws java.rmi.RemoteException;
}

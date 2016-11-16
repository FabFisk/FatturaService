/**
 * FatturaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.fabrizio;

public class FatturaServiceLocator extends org.apache.axis.client.Service implements it.alfasoft.fabrizio.FatturaService {

    public FatturaServiceLocator() {
    }


    public FatturaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FatturaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Fattura
    private java.lang.String Fattura_address = "http://localhost:8082/Fatture/services/Fattura";

    public java.lang.String getFatturaAddress() {
        return Fattura_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FatturaWSDDServiceName = "Fattura";

    public java.lang.String getFatturaWSDDServiceName() {
        return FatturaWSDDServiceName;
    }

    public void setFatturaWSDDServiceName(java.lang.String name) {
        FatturaWSDDServiceName = name;
    }

    public it.alfasoft.fabrizio.Fattura getFattura() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Fattura_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFattura(endpoint);
    }

    public it.alfasoft.fabrizio.Fattura getFattura(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.alfasoft.fabrizio.FatturaSoapBindingStub _stub = new it.alfasoft.fabrizio.FatturaSoapBindingStub(portAddress, this);
            _stub.setPortName(getFatturaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFatturaEndpointAddress(java.lang.String address) {
        Fattura_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.alfasoft.fabrizio.Fattura.class.isAssignableFrom(serviceEndpointInterface)) {
                it.alfasoft.fabrizio.FatturaSoapBindingStub _stub = new it.alfasoft.fabrizio.FatturaSoapBindingStub(new java.net.URL(Fattura_address), this);
                _stub.setPortName(getFatturaWSDDServiceName());
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
        if ("Fattura".equals(inputPortName)) {
            return getFattura();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fabrizio.alfasoft.it", "FatturaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fabrizio.alfasoft.it", "Fattura"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Fattura".equals(portName)) {
            setFatturaEndpointAddress(address);
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

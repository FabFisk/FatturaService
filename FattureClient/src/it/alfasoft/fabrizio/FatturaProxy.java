package it.alfasoft.fabrizio;

public class FatturaProxy implements it.alfasoft.fabrizio.Fattura {
  private String _endpoint = null;
  private it.alfasoft.fabrizio.Fattura fattura = null;
  
  public FatturaProxy() {
    _initFatturaProxy();
  }
  
  public FatturaProxy(String endpoint) {
    _endpoint = endpoint;
    _initFatturaProxy();
  }
  
  private void _initFatturaProxy() {
    try {
      fattura = (new it.alfasoft.fabrizio.FatturaServiceLocator()).getFattura();
      if (fattura != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fattura)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fattura)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fattura != null)
      ((javax.xml.rpc.Stub)fattura)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.alfasoft.fabrizio.Fattura getFattura() {
    if (fattura == null)
      _initFatturaProxy();
    return fattura;
  }
  
  public it.alfasoft.fabrizio.FatturaModel[] getFatture() throws java.rmi.RemoteException{
    if (fattura == null)
      _initFatturaProxy();
    return fattura.getFatture();
  }
  
  public it.alfasoft.fabrizio.FatturaModel getFattura(java.lang.String codice) throws java.rmi.RemoteException{
    if (fattura == null)
      _initFatturaProxy();
    return fattura.getFattura(codice);
  }
  
  
}
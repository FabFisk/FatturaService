package it.alfasoft.fabrizio;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Fattura implements IFattura {
	
	private FatturaDAO fDAO = new FatturaDAO();
	
	@Override
	@WebMethod
	public FatturaModel getFattura(String codice){
		return fDAO.getFattura(codice);
	}
	
	@Override
	@WebMethod
	public FatturaModel[] getFatture(){
		return fDAO.getFatture();
	}

}

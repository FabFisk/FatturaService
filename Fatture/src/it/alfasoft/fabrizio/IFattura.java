package it.alfasoft.fabrizio;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IFattura {

	@WebMethod
	public abstract FatturaModel getFattura(String codice);

	@WebMethod
	public abstract FatturaModel[] getFatture();

}
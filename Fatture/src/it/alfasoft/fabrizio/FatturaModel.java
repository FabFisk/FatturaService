package it.alfasoft.fabrizio;

public class FatturaModel {
	
	private String codCliente;
	private String ragSociale;
	private double totale;

	public FatturaModel(){}
	public FatturaModel(String codCliente, String ragSociale, double totale) {
		this.codCliente = codCliente;
		this.ragSociale = ragSociale;
		this.totale = totale;
	}
	public String getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}
	public String getRagSociale() {
		return ragSociale;
	}
	public void setRagSociale(String ragSociale) {
		this.ragSociale = ragSociale;
	}
	public double getTotale() {
		return totale;
	}
	public void setTotale(double totale) {
		this.totale = totale;
	}
	
}

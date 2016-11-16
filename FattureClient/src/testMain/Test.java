package testMain;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import it.alfasoft.fabrizio.Fattura;
import it.alfasoft.fabrizio.FatturaModel;
import it.alfasoft.fabrizio.FatturaServiceLocator;

public class Test {

	public static void main(String[] args) {
		FatturaServiceLocator locator = new FatturaServiceLocator();
		try {
			Fattura f = locator.getFattura();
			FatturaModel fat = f.getFattura("Cliente4");
			FatturaModel[] fatt= f.getFatture();
			
			System.out.println(fat.getCodCliente()+"\t"+fat.getRagSociale()+"\t"+fat.getTotale());
			System.out.println();
			for(int i=0; i<fatt.length; i++){
				System.out.println(fatt[i].getCodCliente()+"\t"+fatt[i].getRagSociale()+"\t"+fatt[i].getTotale());
			}
						
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package it.alfasoft.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FatturaDAO {
	
	private Map<String, FatturaModel> fatture;
	private FatturaModel[] fatt;
	
	public FatturaDAO(){
		fatture = new TreeMap<String, FatturaModel>();
		FatturaModel fat1 = new FatturaModel("Cliente1", "AAA", 100);
		FatturaModel fat2 = new FatturaModel("Cliente2", "BBB", 200);
		FatturaModel fat3 = new FatturaModel("Cliente3", "CCC", 300);
		FatturaModel fat4 = new FatturaModel("Cliente4", "DDD", 400);
		FatturaModel fat5 = new FatturaModel("Cliente5", "EEE", 500);
		fatture.put(fat1.getCodCliente(), fat1);
		fatture.put(fat2.getCodCliente(), fat2);
		fatture.put(fat3.getCodCliente(), fat3);
		fatture.put(fat4.getCodCliente(), fat4);
		fatture.put(fat5.getCodCliente(), fat5);
	}
	
	public FatturaModel getFattura(String codCliente){
		return fatture.get(codCliente);
	}
	
	public FatturaModel[] getFatture(){
		List<FatturaModel> fatTemp = new ArrayList<FatturaModel>(fatture.values());
		fatt = new FatturaModel[fatTemp.size()];
		for(int i=0; i<fatTemp.size(); i++){
			fatt[i] = fatTemp.get(i);
		}
		return fatt;
	}

}

package org.sid.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.sid.entities.Produit;


public class CatalogueDAOImpl implements ICatalogueDAO {
	private Map<String, Produit> produits = new HashMap<String,Produit>();
	Logger log = Logger.getLogger(this.getClass());
	
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		produits.put(p.getReference(), p);
	}

	public List<Produit> listProduits() {
		// TODO Auto-generated method stub
		return new ArrayList<Produit>(produits.values());
	}

	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return produits.get(ref);
	}

	public void deleteProduit(String ref) {
		// TODO Auto-generated method stub
		produits.remove(ref);
	}

	public void updateProduit(Produit p) {
		// TODO Auto-generated method stub
		produits.put(p.getReference(), p);
	}
	
	public void initialisation(){
		addProduit(new Produit("ref102","tronconeuse",400, 12, true));
		addProduit(new Produit("ref122","radiateur",120, 9, true));
		addProduit(new Produit("ref272","télé",100, 15, false));
		log.info("Initialiation du catalogue");
	}

}

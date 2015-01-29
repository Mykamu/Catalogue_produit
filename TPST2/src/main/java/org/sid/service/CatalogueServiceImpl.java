package org.sid.service;

import java.util.List;

import org.sid.dao.ICatalogueDAO;
import org.sid.entities.Produit;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CatalogueServiceImpl implements ICatalogueService {
	private ICatalogueDAO dao;
	
	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}

	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		dao.addProduit(p);
	}

	public List<Produit> listProduits() {
		// TODO Auto-generated method stub
		return dao.listProduits();
	}

	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return dao.getProduit(ref);
	}

	public void deleteProduit(String ref) {
		// TODO Auto-generated method stub
		dao.deleteProduit(ref);
	}

	public void updateProduit(Produit p) {
		// TODO Auto-generated method stub
		dao.updateProduit(p);
	}

}

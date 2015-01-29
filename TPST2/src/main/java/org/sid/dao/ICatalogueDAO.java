package org.sid.dao;

import java.util.List;

import org.sid.entities.Produit;

public interface ICatalogueDAO {
	public void addProduit(Produit p);
	public List<Produit> listProduits();
	public Produit getProduit(String ref);
	public void deleteProduit(String ref);
	public void updateProduit(Produit p);
}

package org.sid.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.sid.entities.Produit;
import org.sid.service.ICatalogueService;
import org.sid.service.SingletonService;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class ProduitAction extends ActionSupport{
	
	public Produit produit =new Produit();
	public List<Produit> produits;
	public String ref;
	public boolean editMode= false;
	@Autowired
	private ICatalogueService service;
	Logger log = Logger.getLogger(this.getClass());
	
	public String index(){
		produits=service.listProduits();
		return SUCCESS;
	}
	public String save(){
		if (editMode==false){
		service.addProduit(produit);
		produit= new Produit();
		}
		else{
			service.updateProduit(produit);
			editMode=false;
			produit= new Produit();
		}
		produits=service.listProduits();
		return SUCCESS;
	}
	public String delete(){
		service.deleteProduit(ref);;
		produits=service.listProduits();
		return SUCCESS;
	}
	public String edit(){
		editMode = true;
		produit= service.getProduit(ref);
		produits=service.listProduits();
		return SUCCESS;
	}
}

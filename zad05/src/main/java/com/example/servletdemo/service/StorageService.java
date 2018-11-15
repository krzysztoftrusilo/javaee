package com.example.servletdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletdemo.domain.Wardrobe;

public class StorageService {
	
	private List<Wardrobe> db = new ArrayList<Wardrobe>();
	private List<Wardrobe> shoppingCart = new ArrayList<Wardrobe>();
	
	public void addToDatabase(Wardrobe wardrobe) {
		Wardrobe newWardrobe = new Wardrobe(wardrobe.getId(), wardrobe.getName(), wardrobe.getProductionDate(), wardrobe.getWeight(), wardrobe.isWood());
		db.add(newWardrobe);
	}
	
	public void addToShoppingCart(Wardrobe wardrobe) {
		Wardrobe newWardrobe = new Wardrobe(wardrobe.getId(), wardrobe.getName(), wardrobe.getProductionDate(), wardrobe.getWeight(), wardrobe.isWood());
		shoppingCart.add(newWardrobe);
	}
	
	public List<Wardrobe> getAllWardrobes() {
		return db;
	}
	
	public List<Wardrobe> getShoppingCart() {
		return shoppingCart;
	}

}

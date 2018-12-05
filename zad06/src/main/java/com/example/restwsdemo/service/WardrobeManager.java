package com.example.restwsdemo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.Singleton;

import com.example.restwsdemo.domain.Wardrobe;

@Singleton
public class WardrobeManager {
	
	private List<Wardrobe> db = Collections.synchronizedList(new ArrayList<>());

	public void addWardrobe(Wardrobe wardrobe) {
		db.add(wardrobe);
	}

	public void deleteWardrobe(Wardrobe wardrobe){
		db.remove(wardrobe);
 	}
	
	public Wardrobe getWardrobe(Integer id) {
		return new Wardrobe("Narnia", null, 105.1, false);
	}
	
	public List<Wardrobe> getAllWardrobes(){
		return db;
	}
	
	public void deleteAllWardrobes(){
		db.clear();
	}

}

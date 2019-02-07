package com.example.ktrusilo.zad07.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.example.ktrusilo.zad07.domain.Wardrobe;
import com.example.ktrusilo.zad07.domain.Owner;

@Stateless
public class WardrobeManager {
	
	@PersistenceContext
	EntityManager em;

	public Wardrobe getWardrobe(int id) {
		return em.find(Wardrobe.class, id);
	}
	
	public void addWardrobe(Wardrobe wardrobe) {
		em.persist(wardrobe);
	}

	public Wardrobe updateWardrobe(Wardrobe wardrobe, int id) {
		wardrobe.setId(id);
		Wardrobe old = getWardrobe(id);
		if(old != null) {
			em.merge(wardrobe);
		}
		return old;
	}

	public void deleteWardrobe(int id) {
		Wardrobe wardrobe = getWardrobe(id);
		if(wardrobe != null) {
			em.remove(wardrobe);
		}
 	}

	@SuppressWarnings("unchecked")
	public List<Wardrobe> getAllWardrobes(){
		return em.createNamedQuery("wardrobe.getAll").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Owner> getAllOwners(){
		return em.createNamedQuery("wardrobe.Owner").getResultList();
	}
	
	public void deleteAllWardrobes(){
		em.createNamedQuery("wardrobe.deleteAll").executeUpdate();
	}

}

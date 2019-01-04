package ug.ktrusilo.javaee.REST.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ug.ktrusilo.javaee.REST.domain.Wardrobe;

@Stateless
public class WardrobeManager {

	@PersistenceContext()
	EntityManager em;
	
	public void addWardrobe(Wardrobe wardrobe)
	{
		em.persist(wardrobe);
	}
	
	public void deleteWardrobe(Wardrobe wardrobe)
	{
		em.remove(wardrobe);
	}
	
	@SuppressWarnings("unchecked")
	public List<Wardrobe> getAll()
	{
		return em.createNamedQuery("wardrobe.all").getResultList();
	}
	
	public Wardrobe getById(long id)
	{
		return em.find(Wardrobe.class, id);
	}
}

package com.example.ktrusilo.zad07.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.ktrusilo.zad07.domain.Owner;

@Stateless
public class OwnerManager {
	
	 @PersistenceContext
	    EntityManager em;
	 
	    public Owner getOwner(int id) {
	        return em.find(Owner.class, id);
	    }	    
	    
	    public void addOwner(Owner owner) {
	        em.persist(owner);
	    }

	    public Owner updateOwner(Owner owner, int id) {
	    	owner.setId(id);
	    	Owner old = getOwner(id);
	        if(old != null) {
	            em.merge(owner);
	        }
	        return old;
	    }

	    public void deleteOwner(int id) {
	    	Owner owner = getOwner(id);
	        if(owner != null) {
	            em.remove(owner);
	        }
	    }

	    @SuppressWarnings("unchecked")
	    public List<Owner> getAllOwners() {
	        return em.createNamedQuery("owner.getAll").getResultList();
	    }


	    public void deleteAllOwners(){
	        em.createNamedQuery("owner.deleteAll").executeUpdate();
	    }   

}

package com.example.ktrusilo.zad07.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.example.ktrusilo.zad07.domain.Number;

@Stateless
public class NumberManager {

	 @PersistenceContext
	 EntityManager em;
	 
	    public void addNumber(Number number) {
	        em.persist(number);
	    }

	    public Number updateNumber(Number number, int id) {
	    	number.setId(id);
	        Number old = getNumber(id);
	        if(old != null) {
	            em.merge(number);
	        }
	        return old;
	    }
	    
	    public void deleteNumber(int id) {
	    	Number number = getNumber(id);
	        if(number != null) {
	            em.remove(number);
	        }
	    }

	    public Number getNumber(int id) {
	        return em.find(Number.class, id);
	    }

	    @SuppressWarnings("unchecked")
	    public List<Number> getAllNumber() {
	        return em.createNamedQuery("number.getAll").getResultList();
	    }

	    public void deleteAllNumber(){
	        em.createNamedQuery("number.deleteAll").executeUpdate();
	    }
	 
}

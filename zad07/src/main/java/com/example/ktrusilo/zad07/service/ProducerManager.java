package com.example.ktrusilo.zad07.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.ktrusilo.zad07.domain.Producer;

@Stateless
public class ProducerManager {
	
	  @PersistenceContext
	    EntityManager em;

	  
	  public void addProducer(Producer producer) {
	        em.persist(producer);
	  }

	   public Producer updateProducer(Producer producer, int id) {
	        producer.setId(id);
	        Producer old = getProducer(id);
	        if(old != null) {
	            em.merge(producer);
	        }
	        return old;
	   }  
	   
	   public void deleteProducer(int id) {
		   Producer producer = getProducer(id);
	        if(producer != null) {
	            em.remove(producer);
	        }
	    }
	   
	    public Producer getProducer(int id) {
	        return em.find(Producer.class, id);
	    }	   
	     
	    @SuppressWarnings("unchecked")
	    public List<Producer> getAllProducer() {
	        return em.createNamedQuery("producer.getAll").getResultList();
	    }	    

	    public void deleteAllProducer(){
	        em.createNamedQuery("producer.deleteAll").executeUpdate();
	    }	    

}

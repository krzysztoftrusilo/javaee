package com.example.servletdemo.service;

import java.util.HashMap;
import java.util.Map;

import com.example.servletdemo.domain.Sock;


public class StorageService {
	
	private Map<Long, Sock> db = new HashMap<Long, Sock>();

	public void add(Sock sock) {
		Sock newSock = new Sock(sock.getName(), sock.isToes(), sock.getPrice(), sock.getProductionDate());
		db.put(newSock.getId(), newSock);
	}

	public Map<Long, Sock> getAllSocks(){
		return db;
	}

}

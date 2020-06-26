package com.gui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gui.dao.DaoImpl;

@Service
public class ServiceImpl implements ServiceI {
	
	@Autowired
	private DaoImpl daoImpl;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void play(int id1, int id2) {
		
		daoImpl.add(id1);
		
		int result = daoImpl.query(id2);
		if(result < 1000) {
			System.out.println("余额不足");
			throw new RuntimeException();
		}else {
			daoImpl.sub(id2);	
		}
		
	}

}

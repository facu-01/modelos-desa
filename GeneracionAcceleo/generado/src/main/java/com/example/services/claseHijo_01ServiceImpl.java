package com.example.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.entities.claseHijo_01;
import com.example.api.repositories.claseHijo_01Repository;
import com.example.api.repositories.BaseRepository;

@Service
public class claseHijo_01ServiceImpl extends BaseServiceImpl<claseHijo_01, Long> implements claseHijo_01Service{

	@Autowired
	private claseHijo_01Repository clasehijo_01Repository;
	
	public claseHijo_01ServiceImpl(BaseRepository<claseHijo_01, Long> baseRepository){
		super(baseRepository);
	}
}

package com.example.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.entities.Base;
import com.example.api.repositories.BaseRepository;
import com.example.api.repositories.BaseRepository;

@Service
public class BaseServiceImpl extends BaseServiceImpl<Base, Long> implements BaseService{

	@Autowired
	private BaseRepository baseRepository;
	
	public BaseServiceImpl(BaseRepository<Base, Long> baseRepository){
		super(baseRepository);
	}
}

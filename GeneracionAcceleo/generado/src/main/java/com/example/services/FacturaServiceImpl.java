package com.example.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.entities.Factura;
import com.example.api.repositories.FacturaRepository;
import com.example.api.repositories.BaseRepository;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService{

	@Autowired
	private FacturaRepository facturaRepository;
	
	public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository){
		super(baseRepository);
	}
}

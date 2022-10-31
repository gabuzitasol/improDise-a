package com.impro.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.impro.ecommerce.model.DetalleOrden;
import com.impro.ecommerce.repository.IDetalleOrdenRepository;

@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService{
	
	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}

}

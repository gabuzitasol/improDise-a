package com.impro.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.impro.ecommerce.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}

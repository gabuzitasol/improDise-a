package com.impro.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.impro.ecommerce.model.Orden;
import com.impro.ecommerce.model.Usuario;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
	List<Orden> findByUsuario (Usuario usuario);
}

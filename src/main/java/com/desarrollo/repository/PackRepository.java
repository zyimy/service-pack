package com.desarrollo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desarrollo.entity.Pack;

public interface PackRepository extends JpaRepository<Pack, Long>{
	
	List<Pack>findByRestauranteId(Long idRestaurante);
	
	boolean existsByRestauranteId(Long idRestaurante);
}

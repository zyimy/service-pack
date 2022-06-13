package com.desarrollo.service;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrollo.config.BadRequestException;
import com.desarrollo.config.NotFoundException;
import com.desarrollo.dto.PackDto;
import com.desarrollo.entity.Pack;
import com.desarrollo.mapper.PackMapper;
import com.desarrollo.repository.PackRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PackService {

	@Autowired
	private PackRepository packRepository;

	@Autowired
	private PackMapper packMapper;

	public PackDto createPack(PackDto packDto) {

		Pack pack = packMapper.packToPackDto(packDto);
		log.info("Creando el pack  " );
		packRepository.save(pack);
		log.info("objeto creado con id: " + pack.getIdPack());
		return packMapper.packDtoToPack(pack);

	}
	
	
	public List<PackDto>listPack(){
		List<Pack>lista = packRepository.findAll();
		
		if (!lista.isEmpty()) {
			log.info("iniciando lista: " +lista);
			return packMapper.listPackDtoToListPack(lista);
		}else {
			log.error("Lista vacia");
			throw new BadRequestException("Lista vacia");
		}
		
		
	}
	
	
	public List<PackDto>listIdRestaurant(Long idRestaurant){
		boolean exits = packRepository.existsByRestauranteId(idRestaurant);
		
		if (!exits) {
			log.error("el id: "+idRestaurant+"  No esxiste");
			throw new NotFoundException("idRestaurante no existe");
		}else {
			List<Pack>lista = packRepository.findByRestauranteId(idRestaurant);
			
			return packMapper.listPackDtoToListPack(lista);
		}
	}

}

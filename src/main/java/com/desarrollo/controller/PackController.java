package com.desarrollo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desarrollo.dto.PackDto;
import com.desarrollo.service.PackService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("pack")
@Slf4j
public class PackController {

	@Autowired
	private PackService packService;

	@PostMapping
	public ResponseEntity<PackDto> savePack(@RequestBody PackDto packDto) {
		log.info("enviando creacion del pack: " + packDto);

		return ResponseEntity.ok(packService.createPack(packDto));
	}
	
	@GetMapping
	public ResponseEntity<List<PackDto>>listPack(){
		
		List<PackDto> list = packService.listPack();
		
		if (list.isEmpty()) {
			
			log.info("Lista pack vacia: ");	
		return	ResponseEntity.noContent().build();
		
		}else {
			log.info("enviando la lista pack: ");	
		return	ResponseEntity.ok(list);
		}
	}
	
	
	@GetMapping("/getPack/{idRestaurante}")
	public ResponseEntity<List<PackDto>>listIdRestaurant(@PathVariable("idRestaurante")Long idRestaurante){
		
		List<PackDto> list = packService.listIdRestaurant(idRestaurante);
		
		if (list.isEmpty()) {
			
			log.info("Lista pack vacia: ");	
		return	ResponseEntity.noContent().build();
		
		}else {
			log.info("enviando la lista pack: ");	
		return	ResponseEntity.ok(list);
		}
	}
}

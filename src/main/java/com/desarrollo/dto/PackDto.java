package com.desarrollo.dto;



import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PackDto implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	
	@NotBlank
	@JsonProperty("id_pack")
	private Long idPack;

	@NotBlank
	@JsonProperty("nombre")
	private String nombre;
	
	@NotBlank
	@JsonProperty("descripcion")
	private String descripcion;
	
	@NotBlank
	@JsonProperty("imagen")
	private String imagen;
	
	@NotBlank
	@JsonProperty("status")
	private String status;
	
	@NotBlank
	@JsonProperty("hora_disponible")
	private String horaDisponible;
	
	@NotBlank
	@JsonProperty("direccion")
	private String direccion;
	
	@NotNull
	@JsonProperty("precio")
	private double precio;
	
	@NotNull
	@JsonProperty("restaurante_id")
	private Long restauranteId;
	
	@NotBlank
	@JsonProperty("fecha")
	private String fecha;


}

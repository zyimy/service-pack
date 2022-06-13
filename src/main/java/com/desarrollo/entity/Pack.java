package com.desarrollo.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pack")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pack {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPack;
	
	@NotBlank
	private String nombre;
	
	@NotBlank
	private String descripcion;
	
	@NotBlank
	private String imagen;
	
	@NotBlank
	private String status;
	
	@NotBlank
	private String horaDisponible;
	
	@NotBlank
	private String direccion;
	
	@NotNull
	private double precio;
	
	@NotNull
	private Long restauranteId;
	
	@NotNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate fecha;
	
	

	

}

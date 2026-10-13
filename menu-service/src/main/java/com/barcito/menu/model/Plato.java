package com.barcito.menu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "plato")
public class Plato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	private String descripcion;
	private Integer precio;
	
	public Plato() {
		
	}
	
	public Plato(Long id, String titulo, String descripcion, Integer precio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getTitulo() { return titulo; }
	public void setTitulo(String titulo) { this.titulo = titulo; }

	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

	public Integer getPrecio() { return precio; }
	public void setPrecio(Integer precio) { this.precio = precio; }
 
}

package com.barcito.menu.controller;

import com.barcito.menu.model.Bebida;
import com.barcito.menu.service.BebidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/bebida")
public class BebidaController {

	@Autowired
	private BebidaService bebidaService;
	
	@GetMapping
	public List<Bebida> obtenerBebidas(){
		return bebidaService.listarBebidas();
	}
	@PostMapping
	public Bebida crearBebida(@RequestBody Bebida bebida){
		return bebidaService.guardarBebida(bebida);
	}
	@GetMapping("/{id}")
	public Optional<Bebida> obtenerBebidaPorId(@PathVariable long id){
		return bebidaService.buscarPorId(id);
	}
	@DeleteMapping("/{id}")
	public void eliminarBebida(@PathVariable long id){
		bebidaService.eliminarBebida(id);
	}
	
	
}

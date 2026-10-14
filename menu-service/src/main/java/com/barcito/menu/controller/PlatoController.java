package com.barcito.menu.controller;

import com.barcito.menu.model.Plato;
import com.barcito.menu.service.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/platos")
public class PlatoController {

	@Autowired
	private PlatoService platoService;
	
	@GetMapping
	public List<Plato> obtenerPlatos(){
		return platoService.listarPlatos();
	}
	@PostMapping
	public Plato crearPlato(@RequestBody Plato plato){
		return platoService.guardarPlato(plato);
	}
	@GetMapping("/{id}")
	public Optional<Plato> obtenerPlatoPorId(@PathVariable long id){
		return platoService.buscarPorId(id);
	}
	@DeleteMapping("/{id}")
	public void eliminarPlato(@PathVariable long id){
		platoService.eliminarPlato(id);
	}
	
	
}

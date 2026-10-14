package com.barcito.menu.controller;

import com.barcito.menu.model.Postre;
import com.barcito.menu.service.PostreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/postre")
public class PostreController {

	@Autowired
	private PostreService postreService;
	
	@GetMapping
	public List<Postre> obtenerPostres(){
		return postreService.listarPostre();
	}
	@PostMapping
	public Postre crearPlato(@RequestBody Postre postre){
		return postreService.guardarPostre(postre);
	}
	@GetMapping("/{id}")
	public Optional<Postre> obtenerPostrePorId(@PathVariable long id){
		return postreService.buscarPorId(id);
	}
	@DeleteMapping("/{id}")
	public void eliminarPostre(@PathVariable long id){
		postreService.eliminarPostre(id);
	}
	
	
}

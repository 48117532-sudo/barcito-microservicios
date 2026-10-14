package com.barcito.menu.controller;

import com.barcito.menu.model.Menu;
import com.barcito.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	@GetMapping
	public List<Menu> obtenerMenu(){
		return menuService.listarMenu();
	}
	@PostMapping
	public Menu crearMenu(@RequestBody Menu menu){
		return menuService.guardarMenu(menu);
	}
	@GetMapping("/{id}")
	public Optional<Menu> obtenerMenuPorId(@PathVariable long id){
		return menuService.buscarPorId(id);
	}
	@DeleteMapping("/{id}")
	public void eliminarMenu(@PathVariable long id){
		menuService.eliminarMenu(id);
	}
	
	
}

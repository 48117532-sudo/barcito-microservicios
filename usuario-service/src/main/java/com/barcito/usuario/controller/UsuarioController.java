package com.barcito.usuario.controller;

import com.barcito.usuario.model.Usuario;
import com.barcito.usuario.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	@Autowired
	public UsuarioService usuarioService;
		
	@GetMapping
	public List<Usuario> obtenerUsuarios(){
		return usuarioService.listarUsuario();
	}
	@PostMapping
	public Usuario crearUsuarios(@RequestBody Usuario usuario){
		return usuarioService.guardarUsuario(usuario);
	}
	@GetMapping("/{id}")
	public Optional<Usuario> obtenerUsuarioPorId(@PathVariable Long id){
		return usuarioService.buscarPorId(id);
	}
	@DeleteMapping("/{id}")
	public void eliminarUsuario(@PathVariable Long id){
		usuarioService.eliminarUsuario(id);
	}
}

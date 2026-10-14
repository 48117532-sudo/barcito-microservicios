package com.barcito.usuario.service;

import com.barcito.usuario.model.Usuario;
import com.barcito.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listarUsuario(){
		return usuarioRepository.findAll();
	}
	public Usuario guardarUsuario(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	public Optional<Usuario> buscarPorId(Long id){
		return usuarioRepository.findById(id);
	}
	public void eliminarUsuario(Long id){
		usuarioRepository.deleteById(id);
	}
}

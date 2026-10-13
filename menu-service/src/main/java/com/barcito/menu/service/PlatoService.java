package com.barcito.menu.service;

import com.barcito.menu.model.Plato;
import com.barcito.menu.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlatoService {

	@Autowired
	private PlatoRepository platoRepository;
	
	public List<Plato> listarPlatos(){
		return platoRepository.findAll();
	}
	public Plato guardarPlato(Plato plato) {
        return platoRepository.save(plato);
    }
	public Optional<Plato> buscarPorId(Long id) {
        return platoRepository.findById(id);
    }
	public void eliminarPlato(Long id) {
        platoRepository.deleteById(id);
    }
	
}

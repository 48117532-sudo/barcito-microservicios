package com.barcito.menu.service;

import com.barcito.menu.model.Bebida;
import com.barcito.menu.repository.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BebidaService {

	@Autowired
	private BebidaRepository bebidaRepository;

	BebidaService(BebidaRepository bebidaRepository) {
		this.bebidaRepository = bebidaRepository;
	}
	
	public List<Bebida> listarBebidas(){
		return bebidaRepository.findAll();
	}
	public Bebida guardarBebida(Bebida bebida) {
        return bebidaRepository.save(bebida);
    }
	public Optional<Bebida> buscarPorId(Long id) {
        return bebidaRepository.findById(id);
    }
	public void eliminarBebida(Long id) {
        bebidaRepository.deleteById(id);
    }
	
}

package com.barcito.menu.service;

import com.barcito.menu.model.Postre;
import com.barcito.menu.repository.PostreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostreService {

	@Autowired
	private PostreRepository postreRepository;

	PostreService(PostreRepository postreRepository) {
		this.postreRepository = postreRepository;
	}
	
	public List<Postre> listarPostre(){
		return postreRepository.findAll();
	}
	public Postre guardarPostre(Postre postre) {
        return postreRepository.save(postre);
    }
	public Optional<Postre> buscarPorId(Long id) {
        return postreRepository.findById(id);
    }
	public void eliminarPostre(Long id) {
        postreRepository.deleteById(id);
    }
	
}

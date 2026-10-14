package com.barcito.menu.service;

import com.barcito.menu.model.Menu;
import com.barcito.menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

	@Autowired
	private MenuRepository MenuRepository;

	MenuService(MenuRepository menuRepository) {
		this.MenuRepository = menuRepository;
	}
	
	public List<Menu> listarMenu(){
		return MenuRepository.findAll();
	}
	public Menu guardarMenu(Menu menu) {
        return MenuRepository.save(menu);
    }
	public Optional<Menu> buscarPorId(Long id) {
        return MenuRepository.findById(id);
    }
	public void eliminarMenu(Long id) {
        MenuRepository.deleteById(id);
    }
	
}

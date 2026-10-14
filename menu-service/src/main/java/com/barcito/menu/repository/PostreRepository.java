package com.barcito.menu.repository;

import com.barcito.menu.model.Postre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostreRepository extends JpaRepository<Postre, Long>{

}

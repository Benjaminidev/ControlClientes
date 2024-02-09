package com.bmd.dao;

import com.bmd.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}

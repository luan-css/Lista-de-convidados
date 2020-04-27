package com.spring.codeblog.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.codeblog.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}

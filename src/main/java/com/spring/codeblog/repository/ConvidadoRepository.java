package com.spring.codeblog.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.codeblog.model.Convidado;
import com.spring.codeblog.model.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}

package com.crud.mongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DocumentoRepository extends MongoRepository<Documento, String>{
	List<Documento> findByIdade(int idade);

	List<Documento> findByNome(String nome);

	List<Documento> findByCidade(String cidade);
}

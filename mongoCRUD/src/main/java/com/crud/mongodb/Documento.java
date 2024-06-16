package com.crud.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "minha_colecao")
public class Documento {
	
	@Id
	private String id;
	@Indexed(unique = true)
	private String nome;
	private int idade;
	private String cidade;
	
	public Documento(String nome, Integer idade, String cidade) {
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}
}

package com.crud.mongodb;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoCrudApplication implements CommandLineRunner{

	@Autowired
	private DocumentoService documentoService;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoCrudApplication.class, args);
		System.out.println("\n\nDone!");
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Inserir um único documento*/
		
//		Documento documento = new Documento("Alice", 25, "Nova York");
//		try {
//			this.documentoService.save(documento);
//		} catch (Exception e) {
//			System.out.println("\nVerifique se o nome já foi cadastrado");
//		}
		
/*--------------------------------------------------------------------------------------*/
		
		/*Inserir múltiplos documentos*/
		
//		Documento documento1 = new Documento("Bob", 30, "San Francisco");
//		Documento documento2 = new Documento("Charlie", 35, "Chicago");
//		List<Documento> documentos = Arrays.asList(documento1, documento2);
//		try {
//			this.documentoService.saveAll(documentos);
//		} catch (Exception e) {
//			System.out.println("\nVerifique se algum dos nomes já foi cadastrado");
//		}
		
/*--------------------------------------------------------------------------------------*/
		
		/*Buscar todos os documentos*/
		
//		List<Documento> documentos = this.documentoService.findAll();
//		System.out.println("\n\nTodos os documentos:");
//		for (Documento documento : documentos) {
//			System.out.println("\nNome: " + documento.getNome()
//					+"\nIdade: " +  documento.getIdade()
//					+"\nCidade: " +  documento.getCidade()
//					);
//		}
		
/*--------------------------------------------------------------------------------------*/
		
		/*Buscar documentos com um filtro*/
		
//		int idade = 25;
//		List<Documento> documentos = this.documentoService.findByIdade(idade);
//		System.out.println("\n\nDocumentos encontrados:");
//		for (Documento documento : documentos) {
//			System.out.println("\nNome: " + documento.getNome()
//					+"\nIdade: " +  documento.getIdade()
//					+"\nCidade: " +  documento.getCidade()
//					);
//		}
		
/*--------------------------------------------------------------------------------------*/
		
		/*Atualizar um único documento*/
		
//		String nome = "Alice";
//		int idadeNovo = 25;
//		Optional<Documento> documento = this.documentoService.updateByNome(nome, idadeNovo);
//		documento.ifPresentOrElse(
//				doc -> System.out.println("\nDocumento atualizado"
//						+"\nNome: " + doc.getNome()
//						+"\nIdade: " +  doc.getIdade()
//						+"\nCidade: " +  doc.getCidade()
//						), 
//				() -> System.out.println("\nDocumento não encontrado"));

/*--------------------------------------------------------------------------------------*/
		
		/*Atualizar múltiplos documentos*/
		
//		String cidade = "Chicago";
//		String cidadeNovo = "Houston";
//		Optional<List<Documento>> documentosAtualizados = this.documentoService.updateByCidade(cidade, cidadeNovo);
//		documentosAtualizados.ifPresentOrElse(
//                docs -> {
//                    System.out.println("\nDocumentos atualizados:");
//                    for (Documento documento : docs) {
//                        System.out.println("\nNome: " + documento.getNome()
//                        + "\nIdade: " + documento.getIdade()
//                        + "\nCidade: " + documento.getCidade());
//                    }
//                },
//                () -> System.out.println("\nNenhum documento encontrado")
//            );
		
/*--------------------------------------------------------------------------------------*/
		
		/*Excluir um único documento*/
		
//		String nome = "Bob";
//		if(this.documentoService.deleteByNome(nome)) {
//			System.out.println("\nDocumento excluido");
//		} else {
//			System.out.println("\nDocumento não encontrado");
//		}
		
/*--------------------------------------------------------------------------------------*/
		
		/*Excluir múltiplos documentos*/
		
//		int idade = 25;
//		if (this.documentoService.deleteByIdade(idade)) {
//			System.out.println("\nDocumentos excluidos");
//		} else {
//			System.out.println("\nDocumentos não encontrados");
//		}

	}
}

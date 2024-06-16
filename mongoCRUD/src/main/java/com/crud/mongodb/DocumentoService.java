package com.crud.mongodb;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentoService {
	
	@Autowired
	private DocumentoRepository documentoRepository;

	public void save(Documento documento) {
		this.documentoRepository.save(documento);
	}

	public void saveAll(List<Documento> documentos) {
		this.documentoRepository.saveAll(documentos);
		
	}

	public List<Documento> findAll() {
		return this.documentoRepository.findAll();
	}

	public List<Documento> findByIdade(int idade) {
		return this.documentoRepository.findByIdade(idade);
	}

	public List<Documento> findByNome(String nome) {
		return this.documentoRepository.findByNome(nome);
	}

	public Optional<Documento> updateByNome(String nome, int idadeNovo) {
		List<Documento> documentos = this.documentoRepository.findByNome(nome);
		if (documentos.isEmpty()) {
			return Optional.empty();
		}
		Documento documentoAtualizar = documentos.get(0);
		documentoAtualizar.setIdade(idadeNovo);
		return Optional.of(this.documentoRepository.save(documentoAtualizar));
	}

	public List<Documento> findByCidade(String cidade) {
		return this.documentoRepository.findByCidade(cidade);
	}

	public Optional<List<Documento>> updateByCidade(String cidade, String cidadeNovo) {
		List<Documento> documentos = this.documentoRepository.findByCidade(cidade);
		if (documentos.isEmpty()) {
			return Optional.empty();
		}
		List<Documento> documentosAtualizados = new ArrayList<>();
		for (Documento documento : documentos) {
			documento.setCidade(cidadeNovo);
			documentosAtualizados.add(this.documentoRepository.save(documento));
		}
		return Optional.of(documentosAtualizados);
	}

	public boolean deleteByNome(String nome) {
		List<Documento> documento = this.documentoRepository.findByNome(nome);
		if(!documento.isEmpty()) {
			this.documentoRepository.delete(documento.get(0));
			return true;
		}
		return false;
	}

	public boolean deleteByIdade(int idade) {
		List<Documento> documentos = this.documentoRepository.findByIdade(idade);
		if(documentos.isEmpty()) {
			return false;
		} else {
			for (Documento documento : documentos) {
				this.documentoRepository.delete(documento);
			}
			return true;
		}
		
	}
	
	
}

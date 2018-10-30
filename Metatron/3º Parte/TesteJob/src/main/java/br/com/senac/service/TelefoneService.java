package br.com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.dominio.Telefone;
import br.com.senac.repositorio.TelefoneRepositorio;



@Service
public class TelefoneService {

	@Autowired
	TelefoneRepositorio telefoneRepo;

	public List<Telefone> listaTelefones() {
		return telefoneRepo.findAll();
	}
	
	public Telefone inserir(Telefone telefone) {
		// estou colocando um objeto novo entao o id precisa ser null
		telefone.setId(null);
		return telefoneRepo.save(telefone);
	}
}

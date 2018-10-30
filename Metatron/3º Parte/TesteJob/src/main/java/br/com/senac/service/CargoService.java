package br.com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.dominio.Cargo;
import br.com.senac.repositorio.CargoRepositorio;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CargoService {

	@Autowired
	CargoRepositorio cargoRepo;

	public List<Cargo> listaCargo() {
		return cargoRepo.findAll();
	}

	public Cargo buscar(String nome) throws ObjectNotFoundException {
		Cargo objCurso = cargoRepo.findByNome(nome);
		return objCurso;
	}
	
	public Cargo inserir(Cargo cargo) {
		// estou colocando um objeto novo entao o id precisa ser null
		cargo.setId(null);
		return cargoRepo.save(cargo);
	}
	
	
}

package br.com.senac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.dominio.Usuario;
import br.com.senac.repositorio.UsuarioRepositorio;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepositorio userRepo;

	public List<Usuario> listaUsuarios() {
		return userRepo.findAll();
	}

	public Usuario buscar(String nome) throws ObjectNotFoundException {
		Usuario objCurso = userRepo.findByNome(nome);
		return objCurso;
	}
	
	
}

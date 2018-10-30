package br.com.senac.inicializacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.dominio.Cargo;
import br.com.senac.dominio.Telefone;
import br.com.senac.dominio.Usuario;

import br.com.senac.repositorio.CargoRepositorio;

import br.com.senac.repositorio.TelefoneRepositorio;
import br.com.senac.repositorio.UsuarioRepositorio;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	CargoRepositorio cr;

	@Autowired
	TelefoneRepositorio tr;

	@Autowired
	UsuarioRepositorio ur;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {

		System.out.println("Iniciou a aplicação");
		List<Usuario> list = new ArrayList<Usuario>();
		Cargo cargo = new Cargo();
		Telefone telefone = new Telefone();

		Usuario usuario = new Usuario();

		usuario.setNome("Danilo");

		cargo.setNome("Programador");

		list.add(usuario);

//		cargo.setList(list);

//		usuario.setCargo(cargo);

		cr.save(cargo);

		ur.save(usuario);

		telefone.setNumero(12345678);
		telefone.setDdd(21);
//		telefone.setUsuario(usuario);

		tr.save(telefone);

	}
}

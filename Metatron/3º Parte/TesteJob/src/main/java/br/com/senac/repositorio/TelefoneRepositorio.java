package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.dominio.Telefone;



@Repository
public interface TelefoneRepositorio extends JpaRepository<Telefone, Integer>{
	
	

}

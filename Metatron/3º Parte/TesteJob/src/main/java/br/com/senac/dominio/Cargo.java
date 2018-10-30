package br.com.senac.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Cargo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;

	@Column(name="cargo_nome")
	private String nome;

	@OneToMany(mappedBy = "cargo", cascade = CascadeType.ALL)
	private List<Usuario> list = new ArrayList<Usuario>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Usuario> getList() {
		return list;
	}

	public void setList(List<Usuario> list) {
		this.list = list;
	}
	
	
}

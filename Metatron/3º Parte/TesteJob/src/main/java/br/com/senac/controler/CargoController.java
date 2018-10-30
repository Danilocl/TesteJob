package br.com.senac.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.dominio.Cargo;
import br.com.senac.service.CargoService;
import br.com.senac.service.TelefoneService;
import br.com.senac.service.UsuarioService;
import javassist.tools.rmi.ObjectNotFoundException;


@Controller
public class CargoController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CargoService cargoService;
	
	@Autowired
	private TelefoneService telefoneService;
	
//	@GetMapping("/indexControl")
//	public ModelAndView index() {
//		ModelAndView mv = new ModelAndView("index");
//		mv.addObject("cargos", cargoService.listaCargo());
//		return mv;
//
//	}
	
	@GetMapping("/listarCargos/{nome}") 
	public ModelAndView listarCargos(@PathVariable("nome") String nome) throws ObjectNotFoundException {
		ModelAndView mv = new ModelAndView("paginaBuscaCargo");
		mv.addObject("cargos", cargoService.buscar(nome));
		mv.addObject("cargos",cargoService.listaCargo());
		mv.addObject("usuarios",usuarioService.listaUsuarios());
		mv.addObject("telefones",telefoneService.listaTelefones());
		return mv;
		
	}
	
//	@PostMapping("/salvar")
//	public ModelAndView inserir(Cargo categoria) {
//		cargoService.inserir(categoria);
//		return index();
//	}
}

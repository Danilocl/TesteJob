package br.com.senac.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.service.CargoService;
import br.com.senac.service.TelefoneService;
import br.com.senac.service.UsuarioService;
import javassist.tools.rmi.ObjectNotFoundException;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CargoService cargoService;
	
	@Autowired
	private TelefoneService telefoneService;
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("usuarios", usuarioService.listaUsuarios());
		return mv;

	}
	
	@GetMapping("/listarUsuario/{nome}") 
	public ModelAndView listarUsuario(@PathVariable("nome") String nome) throws ObjectNotFoundException {
		ModelAndView mv = new ModelAndView("paginaBuscaUsuario");
		mv.addObject("usuarios", usuarioService.buscar(nome));
		mv.addObject("cargos",cargoService.listaCargo());
		mv.addObject("usuarios",usuarioService.listaUsuarios());
		mv.addObject("telefones",telefoneService.listaTelefones());
		return mv;
		
	}
	

	
}

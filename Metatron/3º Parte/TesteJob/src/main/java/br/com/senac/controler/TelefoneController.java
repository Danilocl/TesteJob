package br.com.senac.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.service.TelefoneService;
import javassist.tools.rmi.ObjectNotFoundException;

@Controller
public class TelefoneController {


	@Autowired
	private TelefoneService telefoneService;

//	@GetMapping("/indexTelefone")
//	public ModelAndView index() {
//		ModelAndView mv = new ModelAndView("index");
//		mv.addObject("cargos", telefoneService.listaTelefones());
//		return mv;
//
//	}

}

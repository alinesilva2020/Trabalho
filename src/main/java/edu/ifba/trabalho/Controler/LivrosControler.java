package edu.ifba.trabalho.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.ifba.trabalho.Model.Livros;
import edu.ifba.trabalho.Service.ILivrosService;

@Controller
public class LivrosControler {

	@Autowired
	private ILivrosService service;
	
	@GetMapping("/Livros/listar")
	public String findAll(Model model) {
		model.addAttribute("Livros", service.findAll());
		return "/Livros/listar";//listar é a pagina html
	}
	@GetMapping("/Livros/deletar/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/Livros/listar";
		
	}
	
	@GetMapping("/Livros/detalhes/{id}")
	public String find(@PathVariable Integer id, Model mode){
		mode.addAttribute("Livros", service.find(id));
		mode.addAttribute("mode", "view");
			
		return "Livros/formulario";
		
	}
	
	@GetMapping({"Livros/save/{id}", "Livros/save"})
	public String loadRegistrationForm(@PathVariable(required = false)
	Integer id, Model model){
		Livros l;
		String mode = null;
		if(id==null) {
			mode = "create";
			l=new Livros();
		} else {
			mode = "update";
			l=service.find(id);	
		}
		model.addAttribute("Livros",l);
		model.addAttribute("mode", mode);
		return "Livros/formulario";
}
}
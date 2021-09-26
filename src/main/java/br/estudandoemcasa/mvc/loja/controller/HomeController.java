package br.estudandoemcasa.mvc.loja.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.estudandoemcasa.mvc.loja.repositories.PedidoRepository;

/*
 * Minhas Actions
 * Métodos que atendem requisições HTTP são chamados de action
 */
@Controller
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/home")
	public String home(Model resquest) {
		resquest.addAttribute("pedidos", pedidoRepository.findAll().stream().collect(Collectors.toList()));
		return "home";
	}
}

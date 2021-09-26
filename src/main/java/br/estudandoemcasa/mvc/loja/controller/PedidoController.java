package br.estudandoemcasa.mvc.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Minhas Actions
 * Métodos que atendem requisições HTTP são chamados de action
 */
@Controller
@RequestMapping("/pedido")
public class PedidoController {

	@GetMapping("/formulario")
	public String formulario(Model resquest) {
		return "pedido/formulario";
	}
}

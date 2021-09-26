package br.estudandoemcasa.mvc.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.estudandoemcasa.mvc.loja.dto.PedidoDTO;
import br.estudandoemcasa.mvc.loja.model.Pedido;
import br.estudandoemcasa.mvc.loja.repositories.PedidoRepository;

/*
 * Minhas Actions
 * Métodos que atendem requisições HTTP são chamados de action
 */
@Controller
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@GetMapping("/formulario")
	public String formulario(Model resquest) {
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	public String novo(PedidoDTO pedidoDTO) {
		
		Pedido pedido = pedidoDTO.toPedido();
		pedidoRepository.save(pedido);
		return "pedido/formulario";
	}
}

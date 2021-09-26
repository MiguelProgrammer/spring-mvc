package br.estudandoemcasa.mvc.loja.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.estudandoemcasa.mvc.loja.model.Pedido;

/*
 * Minhas Actions
 * Métodos que atendem requisições HTTP são chamados de action
 */
@Controller
public class HomeController {
	
	@PersistenceContext
	private EntityManager entityManager;

	@GetMapping("/home")
	public String home(Model resquest) {

		Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
		
		@SuppressWarnings("unchecked")
		List<Pedido> pedidos = query.getResultList();
		resquest.addAttribute("pedidos", pedidos);
		return "home";
	}
}

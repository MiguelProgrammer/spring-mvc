package br.estudandoemcasa.mvc.loja.controller;

import java.util.Arrays;
import java.util.List;

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

	@GetMapping("/home")
	public String home(Model resquest) {

		Pedido pedido = new Pedido();
		pedido.setNome("Playstation 4");
		pedido.setUrlImagem("https://images-americanas.b2w.io/produtos/01/00/img/3292904/4/3292904422_1SZ.jpg");
		pedido.setUrlProduto("https://www.americanas.com.br/produto/3292904406?sellerId=00776574000660&epar=bp_pl_00_go_gm_jogos_todas_geral_gmv&opn=YSMESP&WT.srch=1&gclid=Cj0KCQjwkbuKBhDRARIsAALysV6IkzRYU5fzkuL1wgSx_QKGkZ3cqoAL5bf0YIFLWMvRNgAAcp1nCa0aApo3EALw_wcB");
		pedido.setDescricao("Console Playstation 4 Hits 1tb Bundle 18 - Games God Of War + Ratchet And Clank + Ghost Of Tsushima");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		resquest.addAttribute("pedidos", pedidos);
		return "home";
	}
}

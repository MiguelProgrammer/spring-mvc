package br.estudandoemcasa.mvc.loja.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import br.estudandoemcasa.mvc.loja.model.Pedido;

public class PedidoDTO {

	@NotBlank @Min(10) @Max(30)
	private String nomeProduto;
	
	@NotBlank @Min(20) @Max(200)
	private String urlProduto;
	
	@NotBlank @Min(20) @Max(200)
	private String urlImagem;
	private String descricao;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String getUrlProduto() {
		return urlProduto;
	}
	
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	
	public String getUrlImagem() {
		return urlImagem;
	}
	
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pedido toPedido() {
		
		Pedido pedido = new Pedido();
		
		pedido.setDescricao(descricao);
		pedido.setNome(nomeProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setUrlProduto(urlProduto);
		
		return pedido;
	}
	
}

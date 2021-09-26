package br.estudandoemcasa.mvc.loja.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.estudandoemcasa.mvc.loja.model.Pedido;

@Repository
public class PedidoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Pedido> getPedidos(){
		Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
		return query.getResultList();
	}
}

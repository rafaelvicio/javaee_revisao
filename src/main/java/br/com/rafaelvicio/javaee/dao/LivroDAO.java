package br.com.rafaelvicio.javaee.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelvicio.javaee.models.Livro;

public class LivroDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Livro livro) {
		manager.persist(livro);
	}
	

}

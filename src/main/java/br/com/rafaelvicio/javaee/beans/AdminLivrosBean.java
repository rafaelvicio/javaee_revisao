package br.com.rafaelvicio.javaee.beans;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.rafaelvicio.javaee.dao.LivroDAO;
import br.com.rafaelvicio.javaee.models.Autor;
import br.com.rafaelvicio.javaee.models.Livro;

@Named(value = "adminLivrosBean")
@RequestScoped
public class AdminLivrosBean {

	private Livro livro = new Livro();

	@Inject
	private LivroDAO dao;

	@Transactional
	public void salvar() {
		dao.salvar(livro);
		System.out.println("Livro Cadastrado: " + livro);
	}

	public List<Autor> getAutores() {
		return Arrays.asList(
				new Autor(1, "Paulo Silveira"),
				new Autor(2, "Sérgio Lopes")
				);
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}

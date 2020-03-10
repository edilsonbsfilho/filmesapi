package br.com.unboxculture.filmesapi.servicos;

import java.util.List;

import br.com.unboxculture.filmesapi.entidades.Filme;

public interface FilmeServico {

	Filme salvar(Filme filme);
	
	Filme alterar(Filme filme);
	
	void excluir(Long id);
	
	List<Filme> listar();
	
	Filme obter(Long id);	
}

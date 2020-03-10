package br.com.unboxculture.filmesapi.servicos;

import java.util.List;

import br.com.unboxculture.filmesapi.entidades.Genero;

public interface GeneroServico {

	Genero obter(Long id);
	
	List<Genero> listar();
}

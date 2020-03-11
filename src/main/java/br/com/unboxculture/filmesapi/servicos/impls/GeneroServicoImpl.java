package br.com.unboxculture.filmesapi.servicos.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unboxculture.filmesapi.entidades.Genero;
import br.com.unboxculture.filmesapi.repositorios.GeneroRepositorio;
import br.com.unboxculture.filmesapi.servicos.GeneroServico;

/**
 * Classe responsável por acessar a camada de persistência relacionada a entidade Genero
 * 
 * @author Edilson
 *
 */
@Service
public class GeneroServicoImpl implements GeneroServico {

	@Autowired
	private GeneroRepositorio generoRepositorio;
	
	/**
	 * @see GeneroServico#obter(Long)
	 */
	@Override
	public Genero obter(Long id) {
		return generoRepositorio.buscarPorId(id);
	}

	/**
	 * @see GeneroServico#listar()
	 */
	@Override
	public List<Genero> listar() {
		return generoRepositorio.findAll();
	}

}

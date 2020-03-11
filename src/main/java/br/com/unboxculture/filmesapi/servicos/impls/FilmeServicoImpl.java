package br.com.unboxculture.filmesapi.servicos.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unboxculture.filmesapi.entidades.Filme;
import br.com.unboxculture.filmesapi.repositorios.FilmeRepositorio;
import br.com.unboxculture.filmesapi.servicos.FilmeServico;

/**
 * Classe responsável por acessar a camada de persistência relacionada a entidade Filme
 * 
 * @author Edilson
 *
 */
@Service
public class FilmeServicoImpl implements FilmeServico {

	@Autowired
	private FilmeRepositorio filmeRepositorio;
	
	/**
	 * @see FilmeServico#salvar(Filme)
	 */
	@Override
	public Filme salvar(Filme filme) {
		return  filmeRepositorio.save(filme);
	}

	/**
	 * @see FilmeServico#alterar(Filme)
	 */
	@Override
	public Filme alterar(Filme filme) {
		return filmeRepositorio.saveAndFlush(filme);
	}

	/**
	 * @see FilmeServico#excluir(Long)
	 */
	@Override
	public void excluir(Long id) {
		filmeRepositorio.deleteById(id);		
	}

	/**
	 * @see FilmeServico#listar()
	 */
	@Override
	public List<Filme> listar() {
		return filmeRepositorio.findAll();
	}

	/**
	 * @see FilmeServico#obter(Long)
	 */
	@Override
	public Filme obter(Long id) {
		return filmeRepositorio.buscarPorId(id);
	}

}

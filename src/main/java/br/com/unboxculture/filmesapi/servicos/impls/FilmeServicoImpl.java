package br.com.unboxculture.filmesapi.servicos.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unboxculture.filmesapi.entidades.Filme;
import br.com.unboxculture.filmesapi.repositorios.FilmeRepositorio;
import br.com.unboxculture.filmesapi.servicos.FilmeServico;

@Service
public class FilmeServicoImpl implements FilmeServico {

	@Autowired
	private FilmeRepositorio filmeRepositorio;
	
	@Override
	public Filme salvar(Filme filme) {
		return filmeRepositorio.save(filme);
	}

	@Override
	public Filme alterar(Filme filme) {
		return filmeRepositorio.saveAndFlush(filme);
	}

	@Override
	public void excluir(Long id) {
		filmeRepositorio.deleteById(id);		
	}

	@Override
	public List<Filme> listar() {
		return filmeRepositorio.findAll();
	}

	@Override
	public Filme obter(Long id) {
		return filmeRepositorio.getOne(id);
	}

}

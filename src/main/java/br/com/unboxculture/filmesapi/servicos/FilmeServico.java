package br.com.unboxculture.filmesapi.servicos;

import java.util.List;

import br.com.unboxculture.filmesapi.entidades.Filme;

/**
 * Serviço reponsável pelas operações relacionadas a entidade Filme
 * 
 * Não foram implementados as validações de cada serviço (Ex.: private Boolean validarFilme(Filme filme))
 * 
 * @author Edilson
 *
 */
public interface FilmeServico {

	/**
	 * Método responsável por encaminhar os dados do filme para persistência (Inclusão de novo registro)
	 * @param filme
	 * @return
	 */
	Filme salvar(Filme filme);
	
	/**
	 * Método responsável por encaminhar os dados do filme para persistência (Alteração de um registro existente)
	 * @param filme
	 * @return
	 */
	Filme alterar(Filme filme);
	
	/**
	 * Método responsável por encaminhar os dados do filme para persistência (Exclusão de um registro existente)
	 * @param id
	 */
	void excluir(Long id);
	
	/***
	 * Método responsável por solicitar os dados de todos os filmes à persistência (Listagem dos registros existentes)
	 * @return
	 */
	List<Filme> listar();
	
	/***
	 * Método responsável por obter os dados de um filme pela persistência (Obtenção de registro específico)
	 * @param id
	 * @return
	 */
	Filme obter(Long id);	
}

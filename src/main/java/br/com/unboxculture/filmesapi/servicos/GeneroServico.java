package br.com.unboxculture.filmesapi.servicos;

import java.util.List;

import br.com.unboxculture.filmesapi.entidades.Genero;

/**
 * Serviço reponsável pelas operações relacionadas a entidade Genero
 * 
 * Não foram implementados as validações de cada serviço (Ex.: private Boolean validarGenero(Genero genero))
 * 
 * @author Edilson
 *
 */
public interface GeneroServico {

	/***
	 * Método responsável por obter os dados de um gênero pela persistência (Obtenção de registro específico)
	 * @param id
	 * @return
	 */
	Genero obter(Long id);
	
	/***
	 * Método responsável por solicitar os dados de todos os gêneros à persistência (Listagem dos registros existentes)
	 * @return
	 */
	List<Genero> listar();
}

package br.com.unboxculture.filmesapi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.unboxculture.filmesapi.entidades.Filme;

/**
 * Repósitório responsável pela persistência da entidade Filme.
 * 
 * @author Edilson
 *
 */
@Repository
public interface FilmeRepositorio extends JpaRepository<Filme, Long> {

	/**
	 * Método customizado para buscar um filme por ID
	 * @param id
	 * @return
	 */
	@Query("SELECT f FROM Filme f JOIN f.genero WHERE f.id = :codigo")
	Filme buscarPorId(@Param("codigo") Long id);
}

package br.com.unboxculture.filmesapi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.unboxculture.filmesapi.entidades.Genero;

/**
 * Repósitório responsável pela persistência da entidade Genero.
 * 
 * @author Edilson
 *
 */
@Repository
public interface GeneroRepositorio extends JpaRepository<Genero, Long> {

	/**
	 * Método customizado para buscar um gênero por ID
	 * @param id
	 * @return
	 */
	@Query("SELECT g FROM Genero g JOIN FETCH g.filmes WHERE g.id = :codigo")
	Genero buscarPorId(@Param("codigo") Long id);
}

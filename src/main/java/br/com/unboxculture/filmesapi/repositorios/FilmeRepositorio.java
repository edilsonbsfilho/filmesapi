package br.com.unboxculture.filmesapi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unboxculture.filmesapi.entidades.Filme;

@Repository
public interface FilmeRepositorio extends JpaRepository<Filme, Long>{

}

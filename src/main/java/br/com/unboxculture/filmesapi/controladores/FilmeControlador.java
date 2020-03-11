package br.com.unboxculture.filmesapi.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unboxculture.filmesapi.entidades.Filme;
import br.com.unboxculture.filmesapi.servicos.FilmeServico;

/**
 * Classe responsável por fornecer os serviços relacionados aos filmes.
 * 
 * @author Edilson
 *
 */
@RestController
@RequestMapping("filme")
public class FilmeControlador {

	@Autowired
	private FilmeServico filmeServico;
	
	/**
	 * @see FilmeServico#listar()
	 */
	@GetMapping
	public List<Filme> listar() {
		return filmeServico.listar();
	}
	
	/**
	 * @see FilmeServico#obter(Long)
	 */
	@GetMapping("/{id_filme}")
	public Filme obter(@PathVariable(name = "id_filme") Long id) {
		return filmeServico.obter(id);
	}
	
	/**
	 * @see FilmeServico#excluir(Long)
	 */
	@DeleteMapping("/excluir/{id_filme}")
	public void excluir(@PathVariable(name = "id_filme") Long id) {
		filmeServico.excluir(id);
	}
	
	/**
	 * @see FilmeServico#salvar(Filme)
	 */
	@PostMapping
	public Filme salvar(@RequestBody Filme filme) {
		return filmeServico.salvar(filme);
	}
	
	/**
	 * @see FilmeServico#alterar(Filme)
	 */
	@PutMapping("/alterar")
	public Filme alterar(@RequestBody Filme filme) {
		return filmeServico.alterar(filme);
	}
}

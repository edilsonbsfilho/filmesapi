package br.com.unboxculture.filmesapi.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unboxculture.filmesapi.entidades.Filme;
import br.com.unboxculture.filmesapi.servicos.FilmeServico;

@RestController
@RequestMapping("filme")
public class FilmeControlador {

	@Autowired
	private FilmeServico filmeServico;
	
	@GetMapping("/todos")
	public List<Filme> listar() {
		return filmeServico.listar();
	}
	
	@GetMapping("/codigo/{id_filme}")
	public Filme obter(@PathVariable(name = "id_filme") Long id) {
		return filmeServico.obter(id);
	}
	
	@DeleteMapping("/excluir/{id_filme}")
	public void excluir(@PathVariable(name = "id_filme") Long id) {
		filmeServico.excluir(id);
	}
	
	@PostMapping("/salvar")
	public Filme salvar(Filme filme) {
		return filmeServico.salvar(filme);
	}
	
	@PutMapping("/alterar")
	public Filme alterar(Filme filme) {
		return filmeServico.alterar(filme);
	}
}

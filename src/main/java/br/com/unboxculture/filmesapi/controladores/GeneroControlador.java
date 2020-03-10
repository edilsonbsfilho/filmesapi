package br.com.unboxculture.filmesapi.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unboxculture.filmesapi.entidades.Genero;
import br.com.unboxculture.filmesapi.servicos.GeneroServico;

@RestController
@RequestMapping("genero")
public class GeneroControlador {

	@Autowired
	private GeneroServico generoServico;
	
	@GetMapping("/codigo/{id_genero}")
	public Genero obter(@PathVariable(name = "id_genero") Long id) {
		return generoServico.obter(id);
	}
	
	@GetMapping("/todos")
	public List<Genero> listar() {
		return generoServico.listar();
	}
}

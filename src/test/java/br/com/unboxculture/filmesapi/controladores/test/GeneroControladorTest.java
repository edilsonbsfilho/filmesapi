package br.com.unboxculture.filmesapi.controladores.test;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import br.com.unboxculture.filmesapi.controladores.GeneroControlador;

/**
 * Classe de teste do Controlador de Genero
 * 
 * @author Edilson
 *
 */
@SpringBootTest
class GeneroControladorTest {

	private static final int QTD_GENEROS_CADASTRADOS = 2;

	private MockMvc mockMvc;
	
	@Autowired
	private GeneroControlador generoControlador;
	
	@BeforeEach
	void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(generoControlador).build();
	}

	/**
	 * Teste do EndPoint /genero
	 * O referido método lista todos os gêneros cadastrados no banco.
	 * O resultado esperado tem que ser do tipo JSON, tem que ter o status OK (200) e o tamanho da lista retornada
	 * 	contém exatamente a quantidade cadastrada na tabela.
	 * @throws Exception
	 */
	@Test
	void testListar() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/genero").accept(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.*", Matchers.hasSize(QTD_GENEROS_CADASTRADOS)));
	}

}

package br.org.iel.recrutaif.controllers.validators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.text.ParseException;
import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import br.org.iel.recrutaif.model.entity.Usuario;
import br.org.iel.recrutaif.model.entity.Vaga;

class UsuarioValidatorTest {

	/*
	Testa limite de caracteres de no maximo 100
	*/
	
	@Test
	@DisplayName("Limite de 100 caracteres respeitado")
	public void LimiteDe100CaracteresRespeitado() throws ParseException {
		String Cem = "Rá";
		
		Usuario validaVaga = new Usuario();
		
		validaVaga.setNome(Cem);
		assertTrue("O campo está dentro de cinquenta caracteres", validaVaga.getNome().isEmpty());
	}
	
	@Test
	@DisplayName("Limite de 100 caracteres NOK")
	public void LimiteDe100CaracteresNOK() throws ParseException {
		String Cem = "NaMinhaMaquinaFuncionaRádfffffffffffffffffffffffffffffffffffffffffddddddddddddddddddddd"
				+ "fdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"
				+ "sdssssssdsfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"
				+ "fdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"
				+ "sdssssssdsfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"
				+ "fdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"
				+ "sdssssssdsfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"
				+ "fdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"
				+ "sdssssssdsfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"
				+ "fdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"
				+ "sdssssssdsfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff";
		
		Usuario validaVaga = new Usuario();
		
		validaVaga.setNome(Cem);
		assertFalse("O campo está dentro de cinquenta caracteres", validaVaga.getNome().isEmpty());
	}
	
	
	/*
	Testa se o campo esta vazio
	*/
	
	@Test
	@DisplayName("Retorna OK se o campo estiver vazio")
	public void RetornarOKSeOCampoEstiverVazio() throws ParseException {

		String conteudo = "";
		Vaga vagaTeste = new Vaga();
		vagaTeste.setTitulo(conteudo);
		
/*			VagaValidator.validar(vagaTeste);*/
	}

	@Test
	@DisplayName("Retorna Erro se o campo estiver preenchido")
	public void RetornarErroSeOCampoEstiverPreenchido() throws ParseException {

		String conteudo = "dasdasd";
		Vaga vagaTeste = new Vaga();
		vagaTeste.setTitulo(conteudo);
		assertTrue("O campo está preenchido", vagaTeste.getTitulo().isEmpty());
	}


}





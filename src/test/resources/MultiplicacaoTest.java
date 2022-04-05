package test.resources;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.resources.Multiplicacao;

public class MultiplicacaoTest {

	@Test
	public void test() {
		Multiplicacao mult = new Multiplicacao();	
		double resultado = mult.doCalcular(3, 27);
		
		double checagem = 3 * 27;
		
		assertEquals(String.valueOf(resultado), String.valueOf(checagem));
	}

}

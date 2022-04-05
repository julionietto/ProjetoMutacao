package test.resources;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.resources.Subtracao;

public class SubtracaoTest {

	@Test
	public void test() {
		Subtracao sub = new Subtracao();	
		double resultado = sub.doCalcular(9, 7);
		
		double checagem = 9 - 7;
		
		assertEquals(String.valueOf(resultado), String.valueOf(checagem));
	}

}

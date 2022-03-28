package test.resources;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.resources.Subtracao;

public class SubtracaoTest {

	@Test
	public void test() {
		System.out.println("calculando");
		Subtracao sub = new Subtracao();	
		double resultado = sub.doCalcular(1, 1);
		
		double checagem = 1 - 1;
		
		assertEquals(String.valueOf(resultado), String.valueOf(checagem));
	}

}

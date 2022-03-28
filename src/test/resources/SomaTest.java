package test.resources;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.resources.Soma;

public class SomaTest {

	@Test
	public void test() {
		Soma som = new Soma();	
		double resultado = som.doCalcular(1, 1);
		
		double checagem = 1 + 1;
		
		assertEquals(String.valueOf(resultado), String.valueOf(checagem));
	}

}

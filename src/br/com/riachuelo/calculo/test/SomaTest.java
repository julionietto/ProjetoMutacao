package br.com.riachuelo.calculo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.riachuelo.calculo.Soma;

public class SomaTest {

	@Test
	public void test() {
		Soma som = new Soma();	
		double resultado = som.doCalcular(1, 1);
		
		double checagem = 1 + 1;
		
		assertEquals(String.valueOf(resultado), String.valueOf(checagem));
	}

}

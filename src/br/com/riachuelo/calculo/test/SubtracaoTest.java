package br.com.riachuelo.calculo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.riachuelo.calculo.Subtracao;

public class SubtracaoTest {

	@Test
	public void test() {
		Subtracao sub = new Subtracao();	
		double resultado = sub.doCalcular(1, 1);
		
		double checagem = 1 - 1;
		
		assertEquals(String.valueOf(resultado), String.valueOf(checagem));
	}

}

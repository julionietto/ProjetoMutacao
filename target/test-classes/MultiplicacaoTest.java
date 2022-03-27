package br.com.riachuelo.calculo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.riachuelo.calculo.Multiplicacao;

public class MultiplicacaoTest {

	@Test
	public void test() {
		Multiplicacao mult = new Multiplicacao();	
		double resultado = mult.doCalcular(1, 1);
		
		double checagem = 1 * 1;
		
		assertEquals(String.valueOf(resultado), String.valueOf(checagem));
	}

}

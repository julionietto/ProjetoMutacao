package br.com.riachuelo.calculo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.riachuelo.calculo.Divisao;

public class DivisaoTest {

	@Test
	public void test() {
		Divisao div = new Divisao();	
		double resultado = div.doCalcular(1, 1);
		
		double checagem = 1 / 1;
		
		assertEquals(String.valueOf(resultado), String.valueOf(checagem));
	}

}

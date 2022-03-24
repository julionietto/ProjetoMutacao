package br.com.riachuelo.calculo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Calculadora {
	
	Soma           som  = null;
	Subtracao      sub  = null;
	Multiplicacao  mult = null;
	Divisao        div  = null;
	
	public static void main (String args[]) {
		Calculadora p = new Calculadora();
		
		p.calcular();
		
		System.exit(0);
	}
	
	private void calcular() {
		String conta = "";
		while (true) {
			conta = "";
			double pNumber = 0;
			
			try {
				pNumber = Double.parseDouble(JOptionPane.showInputDialog(null, 
						                                                 conta, 
						                                                 "Entre com o primeiro número", 
						                                                 JOptionPane.INFORMATION_MESSAGE).replace(',', '.'));
			} catch (Exception e) {
				if (pNumber == 0) {
					break;
				}
			}
			
			conta = String.valueOf(pNumber);
			
			String oper = "";
			while (true) {
				oper = JOptionPane.showInputDialog(null, conta, "Entre com o operador (+ - / *)", JOptionPane.INFORMATION_MESSAGE);
				oper = oper.trim();
				if (oper.equalsIgnoreCase("+") || oper.equalsIgnoreCase("-") || oper.equalsIgnoreCase("/") || oper.equalsIgnoreCase("*")) {
					break;
				}
			}
			
			conta = conta + " " + oper;
			
			double sNumber = 0;
			while (true) {
				try {
					sNumber = Double.parseDouble(JOptionPane.showInputDialog(null, 
							                                                 conta, 
							                                                 "Entre com o segundo número ", 
							                                                 JOptionPane.INFORMATION_MESSAGE).replace(',', '.'));
					
					if (sNumber == 0) {
						if (oper.equalsIgnoreCase("/")) {
							JOptionPane.showMessageDialog(null, "Divisão por ZERO é ílegal", oper, JOptionPane.ERROR_MESSAGE);
						}
					} else {
						conta = conta + " " + String.valueOf(sNumber);
						String resultado = doProcessar(pNumber, oper, sNumber);
						
						String mensagem = conta + " = " + resultado;
						JOptionPane.showMessageDialog(null, mensagem);
						break;
					}
				} catch (Exception e) {
				}
			}
		}
	}
	
	private String doProcessar(double pNum, String op, double sNum) {
		double resultado = 0;

		if (op.equalsIgnoreCase("+")) {
			
			if (som == null) {
				som = new Soma();
			}
			
			resultado = som.doCalcular(pNum, sNum);
			
		} else if (op.equalsIgnoreCase("-")) {

			if (sub == null) {
				sub = new Subtracao();
			}
			
			resultado = sub.doCalcular(pNum, sNum);
			
		} else if (op.equalsIgnoreCase("/")) {

			if (div == null) {
				div = new Divisao();
			}
			
			resultado = div.doCalcular(pNum, sNum);

		} else if (op.equalsIgnoreCase("*")) {

			if (mult == null) {
				mult = new Multiplicacao();
			}
			
			resultado = mult.doCalcular(pNum, sNum);

		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		return df.format(resultado).replace(',', '.');
	}
}

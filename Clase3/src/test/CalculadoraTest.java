package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import Ejercicios.Calculadora;

public class CalculadoraTest {
	@Test
	public void sumarDosNumerosOk() {
		Number n1 = 1, n2 = 1;
		Calculadora calculadora = new Calculadora();
		double resultado = (double) calculadora.sumar(n1, n2);
		
		Assert.assertEquals(2, resultado, 0);
	}
	
	@Test
	public void restarDosNumerosOk() {
		int n1 = 1, n2 = 1;
		Calculadora calculadora = new Calculadora();
		int resultado = (int) calculadora.restar(n1, n2);
		
		Assert.assertEquals(0, resultado);
	}
	
	@Test
	public void dividirUnNumeroOk() {
		int n1 = 1, n2 = 1;
		Calculadora calculadora = new Calculadora();
		int resultado = (int) calculadora.dividir(n1, n2);
		
		Assert.assertEquals(1, resultado);
	}
	
	@Test
	public void dividirUnNumeroPorCeroException() {
		int n1 = 1, n2 = 0;
		
		try {
			Calculadora calculadora = new Calculadora();
			int resultado = (int) calculadora.dividir(n1, n2);
			
			Assert.fail();
		} catch (RuntimeException e) {
			Assert.assertTrue(true);
		}
	}
}

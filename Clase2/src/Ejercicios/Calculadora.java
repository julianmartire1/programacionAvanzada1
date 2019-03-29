package Ejercicios;

import java.util.Scanner;

public class Calculadora  implements ICalcular{

	
	public Number numero1;
	public Number numero2;
	public Double resultado;
	public Calculadora(){
		
	}
	public static void main(String[] args) {
		Calculadora miCalculadora = new Calculadora();
		int operador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Primer numero");
		miCalculadora.numero1 = Double.parseDouble(sc.nextLine());
		System.out.println("Ingrese Segundo numero");
		miCalculadora.numero2 = Double.parseDouble(sc.nextLine());
		System.out.println("Ingrese Operador");
		System.out.println("1 para +");
		System.out.println("2 para -");
		System.out.println("3 para *");
		System.out.println("4 para /");
		operador = Integer.parseInt(sc.nextLine());
		
		switch(operador){
			case 1:
				System.out.println(miCalculadora.sumar(miCalculadora.numero1, miCalculadora.numero2));
				break;
			case 2:
				System.out.println(miCalculadora.restar(miCalculadora.numero1, miCalculadora.numero2));
				break;
			case 3:
				System.out.println(miCalculadora.multiplicar(miCalculadora.numero1, miCalculadora.numero2));
				break;
			case 4:
				System.out.println(miCalculadora.dividir(miCalculadora.numero1, miCalculadora.numero2));
				break;
		}
	}
	
	@Override
	public double sumar(Number N1, Number N2) {
		double resultado = N1.doubleValue() + N2.doubleValue();
		return  resultado;
	}

	@Override
	public double restar(Number N1, Number N2) {
		double resultado = N1.doubleValue() - N2.doubleValue();
		return resultado;
	}

	@Override
	public double multiplicar(Number N1, Number N2) {
		double resultado = N1.doubleValue() * N2.doubleValue();
		return resultado;
	}

	@Override
	public double dividir(Number N1, Number N2) {
		/*try{
		if(N2.doubleValue() == 0)
			throw new MiExcepcion("El denominador no puede ser 0");
		double resultado = N1.doubleValue() / N2.doubleValue();
		return resultado;
		}
		catch(MiExcepcion ex){
			System.out.println(ex.getMessage());
			return 0;
		}*/
		if(N2.doubleValue() == 0)//Si hereda del RunTime no nesecita try y catch
			throw new MiExcepcion("El denominador no puede ser 0");
		double resultado = N1.doubleValue() / N2.doubleValue();
		return resultado;
	}

}

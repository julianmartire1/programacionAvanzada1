package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		//System.out.println(texto);
		
		//Cantidad de caracteres
		System.out.println(texto.length());
		
		//Imprimir primera mitad de los caracteres 
		String nuevoTexto = texto.substring(0,texto.length()/2);
		System.out.println(nuevoTexto);
		
		//Imprimir el ultimo caracter
		System.out.println(texto.substring(texto.length()-1));
		
		
		//Imprimir en forma inversa
		String palabrainvertida = ""; 
		for (int i = texto.length()-1; i>=0; i--){
            palabrainvertida += texto.charAt(i);
        }
		System.out.println(palabrainvertida);
		
		//Imprimir cada caracter separado con guion
		String textoGuion = "";
		for (int i = 0; i<texto.length(); i++){
			if(i < texto.length()-1)
				textoGuion += texto.charAt(i) + "-";
			else
				textoGuion += texto.charAt(i);
        }
		System.out.println(textoGuion);
		
		//Buscar palabra hola
		if(texto.toUpperCase().contains("HOLA"))
			System.out.println("SI");
		else
			System.out.println("NO");
	}
}

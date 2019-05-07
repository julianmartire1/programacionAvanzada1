package Ejercicios;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class ClaseLista {
	public static void main(String[] args) {
		
		/*Los list guardan de manera secuencial, los Set no*/
		
		//ArrayList lento para remover y ordenar
		/*List<String> nombre = new ArrayList<String>();
		
		nombre.add("a");
		nombre.add("b");
		nombre.add("c");
		
		for (Object o : nombre) {
			System.out.println(o);
		}*/
		
		//LinkedList rapido para reomover y ordenar
		
		//List<String> apellido = new LinkedList();
		
		/*
		 * Set - HashSet no se puede guardar dos objetos iguales,El mas rapido para leer y guardar
		 * Se necesita sobrescribir el hashCode y el Equals
		 * 
		 * Set<Object> object = new HashSet<Object>();
		*/
		
		/*
		 * Set - TreeSet no se puede guardar dos objetos iguales,El mas rapido para leer y guardar
		 * sirve para ordenar
		 * Se necesita sobrescribir el hashCode y el Equals
		 * 
		 * Set<Object> object = new TreeSet<Object>();
		*/
		
		
		/*
		 * Map<key,value> map = new HashMap<key,value>();
		 * 
		 * para agregar -> map.put("key", value);
		 * para obtener -> map.get("key");
		 * 
		 * 	Map<String, String> map = new HashMap<String,String>();
			map.put("asd", "asd");
			
			
			for (String o : map.keySet()) {
				System.out.println(o);
			}
		 */
		
		
	}
}

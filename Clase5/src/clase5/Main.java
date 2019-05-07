package clase5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		//leer();
		//escribir();
		//copiarArchivos();
		
		try {
			File origen = new File("D:\\Sample Pictures");
			
			File destino = new File("D:\\Imagenes");
			
			copyDirectory(origen, destino);
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void copy(File sourceLocation, File targetLocation) throws IOException {
	    if (sourceLocation.isDirectory()) {
	        copyDirectory(sourceLocation, targetLocation);
	    } else {
	        copyFile(sourceLocation, targetLocation);
	    }
	}

	private static void copyDirectory(File source, File target) throws IOException {
	    if (!target.exists()) {
	        target.mkdir();
	    }

	    for (String f : source.list()) {
	        copy(new File(source, f), new File(target, f));
	    }
	}

	private static void copyFile(File source, File target) throws IOException {        
	    try (
	    		FileInputStream in = new FileInputStream(source);
	    		FileOutputStream out = new FileOutputStream(target)
	    ) {
	        byte[] buf = new byte[1024];
	        int length;
	        while ((length = in.read(buf)) > 0) {
	            out.write(buf, 0, length);
	        }
	    }
	}	
	
	
	
	private static void copiarArchivos() {
		try {
			File origen = new File("D:\\","img.png");
			File destino = new File("D:\\","copia.png");
			
			FileInputStream fi = new FileInputStream(origen);
			BufferedInputStream bi = new BufferedInputStream(fi);
			
			FileOutputStream fo = new FileOutputStream(destino);
			BufferedOutputStream bo = new BufferedOutputStream(fo);
			
			int cant = 1024;
			byte[] aux = new byte[cant];
			int leidos;
			
			while((leidos = bi.read(aux, 0, cant)) != -1) {
				bo.write(aux, 0, leidos);
			}
			
			bo.flush();
			bo.close();
			bi.close(); 
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void leer() {
		//Antes de java 7
		/*File f = new File("D:\\","algo.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//java 7 en adelante
		try(BufferedReader br = new BufferedReader(
			new FileReader("D:\\algo.txt")
		)) {
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void escribir() {
		File f = new File("D:\\","algo.txt");
		try {
			if(f.exists()) {
				
				System.out.println("Existe");
				//Para escribir en el archivo
				//true sobreescribe
				FileWriter fw = new FileWriter(f,false);
				//De que manera escribira el archivo
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write("Texto");
				//Limpia el buffer y escribe el disco
				bw.flush();
				//Cierra el archivo
				bw.close();
				
			} else {
				f.createNewFile();
				System.out.println("Archivo creado");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

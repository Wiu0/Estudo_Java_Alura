package br.com.java.alura.io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * O InputStream do Java trata em utilizar bytes como representação dos caracteres. 
 * @author wiu
 */
public class IOInputStream {

	public static void main(String[] args) throws IOException {
		
		File file = createFile();
		InputStream is = new FileInputStream(file);
		
		int byti;
		
		System.out.println("Byte      Char " );
		while((byti = is.read()) != -1){
					System.out.println(String.format("%1$03d", byti) + "         " + (char) byti);
		}
		
		is.close();
		
	}

	private static File createFile() throws IOException {
		File file = new File("leitura.txt");
		System.out.println("Criando arquivo:" + file.getAbsolutePath());
		if(!file.exists())
			file.createNewFile();
		return file;
	}
	
	
	
}

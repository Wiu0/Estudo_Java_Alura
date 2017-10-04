package br.com.java.alura.io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * O InputStreamReader do Java trata em utilizar bytes como representação dos caracteres e possui o tratamento por enconding. 
 * @author wiu
 */
public class IOInputStreamReader {

	public static void main(String[] args) throws IOException {
		
		File file = createFile();
		InputStream is = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		
		int byti;
		while((byti = isr.read()) != -1){
					System.out.println(String.format("%1$03d", byti) + "         " + (char) byti);
		}
		
		isr.close();
		
	}

	private static File createFile() throws IOException {
		File file = new File("leitura.txt");
		System.out.println("Criando arquivo:" + file.getAbsolutePath());
		if(!file.exists())
			file.createNewFile();
		return file;
	}
	
	
	
}

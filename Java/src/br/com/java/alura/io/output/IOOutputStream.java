package br.com.java.alura.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * O InputStream do Java trata em utilizar bytes como representação dos caracteres. 
 * @author wiu
 */
public class IOOutputStream {

	public static void main(String[] args) throws IOException {
		
		File file = createFile();
		OutputStream os = new FileOutputStream(file);
		
		os.write(new byte[] {87, 105});
		os.close();
		System.out.println("Fim");
		
	}

	private static File createFile() throws IOException {
		File file = new File("escrita.txt");
		System.out.println("Criando arquivo:" + file.getAbsolutePath());
		if(!file.exists())
			file.createNewFile();
		return file;
	}
	
	
	
}

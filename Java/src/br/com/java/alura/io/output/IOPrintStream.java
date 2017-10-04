package br.com.java.alura.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * O InputStream do Java trata em utilizar bytes como representação dos caracteres. 
 * @author wiu
 */
public class IOPrintStream {

	public static void main(String[] args) throws IOException {
		
		File file = createFile();
		OutputStream os = new FileOutputStream(file);
		PrintStream ps = new PrintStream(os);
		
		ps.println("william 2");
		ps.flush();
		ps.close();
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

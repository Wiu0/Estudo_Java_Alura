package br.com.java.alura.io.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * O InputStream do Java trata em utilizar caracter como representação do texto no arquivo. 
 * @author wiu
 */
public class IOBufferedReader {

	public static void main(String[] args) throws IOException {

		File file = createFile();
		InputStream is = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(is, "ISO-8859-1");
		BufferedReader br = new BufferedReader(isr);

		String linha;

		while((linha = br.readLine()) != null){
			System.out.println(linha);
		}

		br.close();
	}

	private static File createFile() throws IOException {
		File file = new File("leitura.txt");
		System.out.println("Criando arquivo:" + file.getAbsolutePath());
		if(!file.exists())
			file.createNewFile();
		return file;
	}



}

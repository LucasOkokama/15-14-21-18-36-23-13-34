package br.com.company.companyclasses;

import java.io.File;
import java.io.IOException;

import br.com.company.gen.util.ManipulaArquivos;

public class TestesDobraArquivos {
	/*				
		Dado o array String[] arquivo = { "criacao", "de", "arquivo" };
		
		Crie um arquivo chamado arquivo.txt com o conteúdo de String[] arquivo		
		Verifique se o arquivo.txt existe
		
		Renomeie o arquivo.txt para arquivo2.txt (utilize a classe File)
		Verifique se o arquivo.txt existe
	*/
	
	public static void main(String[] args) throws IOException {
		String[] arquivo = { "criacao", "de", "arquivo" };
		
		String path = "C:\\Users\\lucas\\Downloads\\arquivo.txt";
		String pathRenameFile = "C:\\Users\\lucas\\Downloads\\arquivo2.txt";
		
		
		ManipulaArquivos.criaArquivo(path, arquivo);
		System.out.println(ManipulaArquivos.existe(path));
		
		
		File originalFile = new File(path);
		File newFileName = new File(pathRenameFile);
		originalFile.renameTo(newFileName);
		System.out.println(ManipulaArquivos.existe(pathRenameFile));
	}
}

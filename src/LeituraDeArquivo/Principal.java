package LeituraDeArquivo;
import java.io.*;
import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;



public class Principal {

	public static void main(String[] args) {
		
		String texto = "Vincius--31 Anos--Brasil--Porto Alegre";
		
		//Metodo split retorna num array dividido pelo arugimento que passei
		String separa[] = texto.split("--");
		for(int i =0; i < separa.length; i++) {
			System.out.println(separa[i]);
		}
		
		//Usando a classe File para abrir um arquivo, objeto File com o arquivo.
		File arquivo = new File("produtos.txt");
		
		//Alguns metodos da classe File do Java
		System.out.println("Nome do Arquivo: "+arquivo.getName());
		System.out.println("Caminho do Arquivo lido: "+arquivo.getPath());
		System.out.println("Caminho Absoluto do Arquivo: "+arquivo.getAbsolutePath());
		System.out.println("Diretório pai: "+arquivo.getParent());
		System.out.println(arquivo.exists() ? "Arquivo encontrado.":"Arquivo não encontrado");
		System.out.println(arquivo.canWrite()? "Arquivo pode ser gravado": "Arquivo não pode ser gravado");
		System.out.println(arquivo.canRead()? "Arquivo pode ser lido": "Arquivo NÃO pode ser lido");
		System.out.println(arquivo.isDirectory()? "É um diretório": "É um arquivo");
		
		try {
			FileReader fr = new FileReader(arquivo);// Abrir/Ler Arquivo
			BufferedReader in = new BufferedReader(fr); //Ler e guardar a leitura do arquivo.
			
			String line = in.readLine(); //readLine de in Lendo uma linha do arquivo que guardei no buffer
			while(line != null) {
				String celulaLine[] = line.split("\\*"); //Criando o array para receber uma linha e split para seprar palavra * palavra
				System.out.println(line);//imprime a linha
				for(int i = 0; i < celulaLine.length; i++) {
					celulaLine[i] = celulaLine[i].trim();// trim para tirar os espaços das palavra separadas com o split,array recebe s/ espaços
					System.out.println(celulaLine[i]);//impimrme a palvra crua
				}
				
				line = in.readLine();//le a proxima linha
			}
			in.close();//fechar o buffer que está o arquivo.
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo "+arquivo.getName()+ " não encontrado!.");
		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo "+arquivo.getName());
		}
		
	}

}

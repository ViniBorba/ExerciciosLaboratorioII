package EscreverArquivo;
import java.io.*;

public class CriarArquivo {

	public static void main(String[] args) throws Exception {
		//Cria um arquivo
		File arquivoCriado = new File("arquivoCriado.txt");
		
		//Escreve no ARQUIVO
		FileWriter fr = new FileWriter(arquivoCriado);
		
		//Classe para printar no arquivo
		PrintWriter escrever = new PrintWriter (fr);
		
		//escrevendo no arquivo
		escrever.println("Primeira linha");
		escrever.println("Segunda linha");
		escrever.println("Terceira linha");
		escrever.println("Quarta linha");
		
		escrever.close();//fechar o arquivo

	}

}

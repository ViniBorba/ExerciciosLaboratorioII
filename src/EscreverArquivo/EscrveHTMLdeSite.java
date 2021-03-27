package EscreverArquivo;
import java.io.*;
import java.net.*;

public class EscrveHTMLdeSite {

	public static void main(String[] args) throws Exception{
		//Cria uma String que é um URL
		URL site = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");
		
		//InputStreamReader leitor de fluxo de entrada
		InputStreamReader abreSite = new InputStreamReader(site.openStream());
		
		//Le e guarda no buffer
		BufferedReader guardaSiteAberto = new BufferedReader(abreSite);
		
		//String para guardar linha
		String guardaLinha;
		
		//Cria um arquivo
		File arquivoCriado = new File("novoArquivo.html");
		
		//Escreve em um arquivo
		FileWriter fr = new FileWriter(arquivoCriado);
		
		//Printa em um arquivo fr
		PrintWriter escrever = new PrintWriter(fr);
		
		//escrever.print
		while((guardaLinha = guardaSiteAberto.readLine()) != null) {//readLine para ler uma linha do site que esta no BufferReader
			escrever.println(guardaLinha);
		}
		escrever.close();
		guardaSiteAberto.close();

	}

}

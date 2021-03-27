package LeituraDeArquivo;
import java.net.*;
import java.io.*;

public class LeituraURL {

	public static void main(String[] args) throws Exception {
		//Cria uma string do tipo URL que pega o endre�o do site
		URL site = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");
		//bufferedReader guarda
		BufferedReader in = new BufferedReader( new InputStreamReader(site.openStream()));
		
		String inputLine;//Para guardar a linha	
		while((inputLine = in.readLine()) != null) {//Enquanto documento n�o terminar, input line n�o for null
			System.out.println(inputLine);
		}
		in.close();//Fecha o Buffered
	}

}

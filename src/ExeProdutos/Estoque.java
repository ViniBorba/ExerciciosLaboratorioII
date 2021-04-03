package ExeProdutos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Estoque {
	private Produto[] produtos;
	//private Produto produtos[] = new Produto[22];
	
	//Construtor
	//Estoque(Produto produtos[]) {
		//this.produtos = produtos;s
	//}
	
	//metodo para criar array de Produto com os produtos
	public void preencheEstoque(String nomeDoArquivo) {
		int aux = 0;
		try {
			FileReader fr1 = new FileReader(nomeDoArquivo);//ler o arquivo
			BufferedReader in1 = new BufferedReader(fr1);//guardar o arquivo no buffer de memoria
			
			//long auxIndice = in.lines().count();
			produtos = new Produto[(int)in1.lines().count()];//conversao long para int por conviccao
			//fr.read();//abrindo arquivo de novo pq ele fechou quando chamei line e count
			//in.read();
			FileReader fr = new FileReader(nomeDoArquivo);//ler o arquivo
			BufferedReader in = new BufferedReader(fr);//guardar o arquivo no buffer de memoria
			//
			String line = in.readLine();// linha que rece uma linha do arquivo
			
			//String arquivo = in.toString();// trnasofmr ao texto todo em String
			//in.readLine();//pra pular a primeira linha
			while(line != null) {
				//int aux = 0;
				//Estoque.classificaProduto(line);
				//for(int i = 0; i < produtos.length; i++) {
					//this.produtos[i] = Estoque.classificaProduto(line);
				this.produtos[aux] = Estoque.classificaProduto(line);	
				aux++;	
				line = in.readLine();
				//}
			}
			
			in.close();//fechar o arquivo guardado no buffer de memoria
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo");
		}
	}
	
	//metodo para ver qual é o tipo de produto
	private static Produto classificaProduto(String linha) {
		String umProduto[] = linha.split("\\*");// o split cria o array com posicao correta epassa os valores
		for(int i =0; i < umProduto.length; i++) {
			umProduto[i] = umProduto[i].trim();//tirar os espacos em branco
		}
		try {
			if(umProduto[3].equalsIgnoreCase("alimento")) {
				SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
				Date data = formataData.parse(umProduto[4]);
				Alimento novoAlimento = new Alimento(umProduto[0].toString(), umProduto[1], Double.valueOf(umProduto[2]).doubleValue(), umProduto[3], data);
				return novoAlimento;
			}
			if(umProduto[3].equalsIgnoreCase("Vestuario")) {
				Vestuario novaPeca = new Vestuario(umProduto[0].toString(), umProduto[1], Double.valueOf(umProduto[2]).doubleValue(), umProduto[3], Integer.valueOf(umProduto[4]).intValue());
				return novaPeca;
			}
			if(umProduto[3].equalsIgnoreCase("Eletrodomestico")) {
				Eletrodomestico novoEletro = new Eletrodomestico(umProduto[0].toString(), umProduto[1], Double.valueOf(umProduto[2]).doubleValue(), umProduto[3], Double.valueOf(umProduto[4]).doubleValue());
				return novoEletro;
			}
		} catch(ParseException e) {
			System.out.println("Erro na convercao da data");
		} catch (NumberFormatException e) {
			System.out.println("Erro na convecao do int");
		}
		
		 //Alimento() semProduto = new Alimento(null,null,null,null);
		 return null;
		/*
		//tentar ver se o elemento 4 do array e um int
		try {
				Vestuario novaPeca = new Vestuario(umProduto[0], umProduto[1], Double.valueOf(umProduto[2]).doubleValue(), umProduto[3], Integer.valueOf(umProduto[4]).intValue());
				return novaPeca;
			
		} catch (NumberFormatException e) {
			System.out.println("Erro na convecao do int");
		}
		
		//tentar ver se o elemento 4 do array e um double
		try {
			Eletrodomestico novoEletro = new Eletrodomestico(umProduto[0], umProduto[1], Double.valueOf(umProduto[2]).doubleValue(), umProduto[3], Double.valueOf(umProduto[4]).doubleValue());
			return novoEletro;
		} catch (NumberFormatException e) {
			System.out.println("Erro na convecao do double");
		}
		
		//tentar ver se o elemento 4 do array e uma data
		try {
			SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
			Date data = formataData.parse(umProduto[4]);
			Alimento novoAlimento = new Alimento(umProduto[0], umProduto[1], Double.valueOf(umProduto[2]).doubleValue(), umProduto[3], data);
			return novoAlimento;
		} catch(ParseException e) {
			System.out.println("Erro na convecao da data");
		}
		*/
	}
	
	public Produto[] getProdutos() {
		return this.produtos;
	}
	
	
}

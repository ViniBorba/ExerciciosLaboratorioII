package ExeProdutos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Estoque meuEstoque = new Estoque();
		
		File criaArquivo = new File("info.txt");
		try{
			FileWriter fr = new FileWriter(criaArquivo);
			PrintWriter printar = new PrintWriter(fr);
		

		//try para entrada errada do nome do arquivo, ou não precisa pq já tem essa opcao em Estoque
		System.out.println("Informa o nome do arquivo a ser lido: ");
		meuEstoque.preencheEstoque(entrada.next());
		//meuEstoque.preencheEstoque("produtos.txt");
		
		double valorDoAlimento = 0;
		String nomeDoAlimentoMaisCaro = " ";
		
		double valorDoEletro = 0;
		String nomeDoEletroMaisBarato = " ";
		
		int estoqueVestuario = 0;
		
		for(int i =0; i < meuEstoque.getProdutos().length; i++) {
			if(meuEstoque.getProdutos()[i] instanceof Alimento) {
				
				if(meuEstoque.getProdutos()[i].getPreco() >= valorDoAlimento) {
					valorDoAlimento = meuEstoque.getProdutos()[i].getPreco();
					nomeDoAlimentoMaisCaro = meuEstoque.getProdutos()[i].getNome();
				}
			}
			if(meuEstoque.getProdutos()[i] instanceof Eletrodomestico) {
				
				if(meuEstoque.getProdutos()[i].getPreco() <= valorDoEletro) {
					valorDoEletro = meuEstoque.getProdutos()[i].getPreco();
					nomeDoEletroMaisBarato = meuEstoque.getProdutos()[i].getNome();
				}
			}
			if(meuEstoque.getProdutos()[i] instanceof Vestuario) {
				printar.println("Nome do vestuario: "+meuEstoque.getProdutos()[i].getNome());
				estoqueVestuario ++;
			}
		}
		
		printar.println("Vestuario em Estoque: "+estoqueVestuario);
		printar.println("\n------------------------\n");
		printar.println("O alimento mais caro é o: "+nomeDoAlimentoMaisCaro);
		printar.println("Seu valor é: "+valorDoAlimento);
		printar.println("\n------------------------\n");
		printar.println("O Eletrodomestico mais barato é o :"+nomeDoEletroMaisBarato);
		printar.println("Seu valor é: "+estoqueVestuario);
		//fechar o arquivo
		printar.close();
	} catch (IOException e) {
		System.out.println("Não é possível escrever no arquivo"+ criaArquivo.getName());
	}
		

	}

}

package filaex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExcDoisPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		Queue<String> livros = new LinkedList<String>();
		String elemento;
		int opcao = -1;

		do {
		System.out.println("""
		****************************************

		1 - Adicionar um novo livro na pilha
		2 - Listar todos os livros na pilha
		3 - Retirar um livro da pilha
		0 - Sair
		
		****************************************
		""");
		System.out.println("Digite uma opção: ");
		opcao = leia.nextInt();
		leia.nextLine();

		switch(opcao) {
		case 0:
		System.out.println("Programa Finalizado!");
		break;
		case 1:
		System.out.println("Entre com o nome do livro: ");
		livros.add(leia.nextLine());
		System.out.println("Pilha: \n");
		for ( String livross : livros ) {
		System.out.println(livross);
		}
		System.out.println("\nLivro Adicionado!");
		break;
		case 2:
		System.out.println("Lista de livros na pilha: \n");
		for (String livross : livros ) {
		System.out.println(livross);
		}
		break;
		case 3:
		if (livros.isEmpty()) {
		System.out.println("A pilha está vazia!");
		} else {
		livros.remove();

		System.out.println("Lista de livros na pilha: \n");
		for (String livross : livros ) {
		System.out.println(livross);
		}
		System.out.println("Um livro foi retirado da pilha!");

		}
		break;
		default:
		System.out.println("Entre com uma opção válida!");
		break;
		}
		} while (opcao != 0);

		}

	}
package io.altar.jseproject.textinterface;

import java.util.Scanner;

import io.altar.jseproject.model.Product;

public class TextInterface {
	Scanner s = new Scanner(System.in);
	public static void mainMenu() {
		System.out.println("Por favor selecione uma das seguintes opções:\n" + "1) Listar produtos\n"
				+ "2) Listar prateleiras\n" + "3) Sair\n");

		int input = getInput(1, 3);
		switch (input) {
		case 1:
			menu1();
			break;

		case 2:
			menu2();
			break;
			
		case 3:
			
			break;
		}
	}

	public static int getInput(int min, int max) {
		Scanner s = new Scanner(System.in);
		int input = 0;
		
		while (true) {
			if (s.hasNextInt()) {
				input = s.nextInt();
				if (input >= min && input <= max) {
					return input;
				} else {
					System.out.println("Por favor introduza um numero entre " + min + " e " + max);
				}
			} else {
				System.out.println("Por favor introduza um número");
				s.next();
			}
		}
	}
	
	static void menu1(){
		System.out.println("Por favor selecione uma das seguintes opções:\n" 
				+ "1) Criar novo produto\n" 
				+ "2) Editar um produto existente\n" 
				+ "3) Consultar o detalhe de um produto\n" 
				+ "4) Remover um produto\n" 
				+ "5) Voltar ao ecrã anterior");
		
		int input = getInput(1, 5);
		Scanner s = new Scanner(System.in);
		
		switch (input) {
		case 1:
			System.out.println("Por favor, introduza o id do produto, "
					+ "o valor unitário de desconto, "
					+ "o IVA e "
					+ "o PVP");
			
			
			id = s.next();
			desconto = s.next();
			iva = s.next();
			pvp = s.next();
			
			Product produto1 = new Product(id, desconto, iva, pvp);
			
			break;

		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
			
		case 5:
			break;
		}

	}
	
	static void menu2(){
		System.out.println("Por favor selecione uma das seguintes opções:\n" + 
				"1) Criar novo produto\n" + 
				"2) Editar um produto existente\n" + 
				"3) Consultar o detalhe de um produto\n" + 
				"4) Remover um produto\n" + "5) Voltar ao ecrã anterior");
	}
}

//	int input;
//		Scanner s = new Scanner(System.in); 
//		
//		while(!s.hasNextInt() ){
//			System.out.println("Por favor, introduza 1, 2 ou 3");
//			s.next();
//		}
//		input = s.nextInt();
//		
//		if (input< 1 || input>3){
//			System.out.println("Por favor, introduza 1, 2 ou 3");
//			s.next();
//		}
//		
//		
//		s.close();
//		System.out.println(input);
//		
//		switch (input)
//		{
//		case '1': 
//			System.out.println("Listar produtos");
//            break;
//		case '2': 
//			System.out.println("Listar prateleiras");
//            break;
//		case '3': 
//			System.out.println("Sair");
//            break;
//		}
//	} 
//}

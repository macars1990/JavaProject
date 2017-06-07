package io.altar.jseproject.textinterface;

import java.util.Scanner;

import io.altar.jseproject.model.*;
import io.altar.jseproject.repository.*;

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
	
	public static int validateInt(){
		Scanner s = new Scanner(System.in);
		int inputvalue = 0;
		
		while(true){
			if(s.hasNextInt()){
				inputvalue = s.nextInt();
				if(inputvalue > 0){			
					return inputvalue;
				}else{
				System.out.println("Por favor introduza um número positivo");
				}
			}else{	
				System.out.println("Por favor introduza um número");
				s.next();
			}
		}
	}
	
	public static double validateDouble(){
		Scanner s = new Scanner(System.in);
		double inputvalue = 0;
		
		while(true){
			if(s.hasNextDouble() || s.hasNextInt()){
				inputvalue = s.nextDouble();
				if(inputvalue > 0){			
					return inputvalue;
				}else{
				System.out.println("Por favor introduza um número positivo");
				}
			}else{	
				System.out.println("Por favor introduza um número");
				s.next();
			}
		}
	}
	
	public static int validateIVA(){
		Scanner s = new Scanner(System.in);
		int inputvalue = 0;
		
		while(true){
			if(s.hasNextInt()){
				inputvalue = s.nextInt();
				switch (inputvalue){
					case 6:
					case 13:
					case 21:
					case 23:
						return inputvalue;
					default:
						System.out.println("Por favor introduza um valor de IVA válido (6,13,21 ou 23)");
				}
			}else{
				System.out.println("Por favor introduza um número");
				s.next();
			}
		}
		
	}
	
	
	public static void menu1(){
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
			System.out.println("Por favor, introduza"
					+ "o valor unitário de desconto, "
					+ "o IVA e "
					+ "o PVP");
			
			
			criarproduto();
			
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
	
	public static void menu2(){
		System.out.println("Por favor selecione uma das seguintes opções:\n" + 
				"1) Criar nova prateleira\n" + 
				"2) Editar uma prateleira existente\n" + 
				"3) Consultar o detalhe de uma prateleira\n" + 
				"4) Remover uma prateleira\n" + 
				"5) Voltar ao ecrã anterior");
		
		int input = getInput(1, 5);
		Scanner s = new Scanner(System.in);
		
		switch (input) {
		case 1:
			System.out.println("Por favor, introduza"
					+ "a localizacão, "
					+ "a capacidade"
					+ "e o preco de aluguer");
			
			
			criarprateleira();
			
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


	public static void criarproduto(){
		
//		int Id = ProductRepository.productNextId();
//		System.out.println("O producto tem o ID:" + Id);
		
		System.out.println("Introduza o valor de desconto do produto");
		double discount = validateDouble();
		System.out.println("Introduza o valor do IVA do produto");
		int tax = validateIVA();
		System.out.println("Introduza o preço de venda ao público do produto");
		double salePrice = validateDouble();
		
		new Product (discount, tax, salePrice);
		
		TextInterface.menu1();
		
	}
	
	public static void editarproduto(){
	
	}
	
	public static void criarprateleira(){
		
//		int Id = EntityRepository.shelfNextId();
//		System.out.println("A prateleira tem o ID:" + Id);
		
		System.out.println("Introduza o código da prateleira");
		int location = validateInt();
		System.out.println("Introduza a capacidade da prateleira");
		int capacity = validateInt();
		System.out.println("Introduza o preço de aluguer da prateleira");
		int price = validateInt();
		
		new Shelf (location, capacity, price);
		
		TextInterface.menu2();
	}
		
		
		
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

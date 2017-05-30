package io.altar.jseproject.textinterface;

import java.util.Scanner;

public class TextInterface {
	public static void main(String[] args) {
		System.out.println("Por favor selecione uma das seguintes opções:\n"+
		"1) Listar produtos\n"+
		"2) Listar prateleiras\n"+ 
		"3) Sair\n");
		
		int input;
		Scanner s = new Scanner(System.in); 
		
		while(!s.hasNextInt() ){
			System.out.println("Por favor, introduza 1, 2 ou 3");
			s.next();
		}
		input = s.nextInt();
		
		if (input< 1 || input>3){
			System.out.println("Por favor, introduza 1, 2 ou 3");
			s.next();
		}
		
		
		s.close();
		System.out.println(input);
		
		switch (input)
		{
		case '1': 
			System.out.println("Listar produtos");
            break;
		case '2': 
			System.out.println("Listar prateleiras");
            break;
		case '3': 
			System.out.println("Sair");
            break;
		}
	} 
}

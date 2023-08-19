package Aplicacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import Entidades.Quarto;
import servicos.Comparadordequartos;

import java.util.Collections;

public class Programa {

	public static void main(String[] args) {
		List <Quarto> list = new ArrayList<>();
		int op,numero,v;
		String nome, email;
		Quarto quarto;
		Scanner sc = new Scanner(System.in);
		System.out.println("quantos quartos?");
		v = sc.nextInt();
		do {
			System.out.println("nome");
			nome = sc.next();
			System.out.println("email");
			sc.nextLine();
			email = sc.next();
			System.out.println("quarto");
			numero = sc.nextInt();
			System.out.println("continuar? (1)sim ou(2)nao");
			op = sc.nextInt();
			 quarto = new Quarto(nome, email, numero);
			 list.add(quarto);
		}while(op == 1);
		
		Collections.sort(list,new Comparadordequartos());
	
		
		for (Quarto x : list) {
			System.out.println(x);
		}
		
		
		

	}

}

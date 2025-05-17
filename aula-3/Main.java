/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		double hamburger = 20.0;
		
		double pizza = 34.99;
		
		double batata = 12.50;
		
		double hotdog = 15.0;
		
		double coxinha = 6.0;
		
		double dinheiro_cliente = 50.0;
		
		double carrinho_cliente = 0.0;
		
		System.out.println("aqui estao os pratos e seus preços");
		
		System.out.println("oque voce quer do cardapio?");
		
		System.out.println("1 - hamburger - 2 pizza - 3 batata - 4 hotdog - 5 coxinha");

		int item = sc.nextInt();

		System.out.println("quanto voce quer");

		int quantidade = sc.nextInt();

		switch(item) {
		case 1:
		    carrinho_cliente = quantidade*hamburger;
            break;
		case 2:
		    carrinho_cliente = quantidade*pizza;
			break;
	    case 3:
		     carrinho_cliente = quantidade*batata;
		    break;
		case 4:
		    carrinho_cliente = quantidade*hotdog;
			break;
	    case 5:
		    carrinho_cliente = quantidade*coxinha;
			break;
		}


		if (item < dinheiro_cliente){

		System.out.println("voce pode pagar por isso");
		
	  } else if (item == dinheiro_cliente){
		
		System.out.println("voce pode pagar po isso");
		System.out.println("voce nao tem mais dinheiro");
		
	  } else {
		
		System.out.println("voce nao tem o sufuciente");

      }

	}
}

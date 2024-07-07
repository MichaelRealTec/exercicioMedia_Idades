package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Exercício media_idades
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade;
		int contador = 0;
		double media = 0.00;
		
		System.out.println("Digite as idades: ");
		idade = sc.nextInt();
				
		if(idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}else {
			while(idade >= 0) {
				media += idade;								
				contador++;
				idade = sc.nextInt();
			}
			System.out.printf("MEDIA = %.2f%n", media / contador);
		}
		
		
		sc.close();
	}

}

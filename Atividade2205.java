package Vetor;

import java.util.Scanner;

public class Atividade2205 {

	public static void main(String[] args) {
		int a[] = new int[5];
		int soma = 0;
		Scanner ler = new Scanner(System.in);
		for (int i = 0; i<5; i++) {
			System.out.println("informe um número:");
			a[i] = ler.nextInt();
			soma += a[i];
		}
		
		if (soma > 30) {
		System.out.println(" A soma dos números é: " + soma);
		}
		else {
			System.out.println("O valor é menor que 30");
		}
	}

}

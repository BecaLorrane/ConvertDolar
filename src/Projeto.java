import java.util.Locale;
import java.util.Scanner;

import entities.Dolar;

public class Projeto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Dolar dolar = new Dolar();

		System.out.println("Quanto o dolar est� neste momento? ");
		dolar.cotacaoDolar = sc.nextDouble();

		System.out.println("Quantos reais voc� quer converter? ");
		dolar.reais = sc.nextDouble();

		System.out.printf("Convertendo ser�: %.2f%n", dolar.conversao());
	}
}

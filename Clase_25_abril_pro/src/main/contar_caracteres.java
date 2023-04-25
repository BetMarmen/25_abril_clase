package main;

import java.util.Scanner;

public class contar_caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la palabra: ");
		String words = scan.nextLine();
		int countador = words.length();
		System.out.println("Longitud:");
		System.out.println(countador);
	}

}

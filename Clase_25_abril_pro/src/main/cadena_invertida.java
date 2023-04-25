package main;

import java.util.Scanner;

public class cadena_invertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la cadena :");
		String cadena = scan.nextLine();
	    String reversa = "";
	   
	        
	    for (int i = 0; i < cadena.length(); i++) {
	      reversa = cadena.charAt(i) + reversa;
	    }
	    
	    System.out.println("Cadena Inversa: "+ reversa);
	}

}

package main;

import java.util.Scanner;

public class edad_clasificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int edad;
		do
		{
			System.out.println("Ingrese la edad: ");
			edad = scan.nextInt();
		}
		while(edad<1);
		if(edad<10)
		{
			System.out.println("Es niño");
		}
		else if(edad>=10 && edad <=15)
		{
			System.out.println("Es adolescente");
		}
		else if (edad>15 && edad<=20)
		{
			System.out.println("Es joven");
		}
		else if(edad>20 && edad<30)
		{
			System.out.println("Es adulto");
		}
		else if(edad>=30 && edad<=50)
		{
			System.out.println("Es señor");
		}

	}

}

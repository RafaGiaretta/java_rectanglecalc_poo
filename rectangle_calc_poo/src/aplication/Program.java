package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		System.out.println("Enter witdh: ");
		r.width = sc.nextDouble();
		System.out.println("Enter height: ");
		r.height = sc.nextDouble();
		
		System.out.println(r);
		
		
		sc.close();
	}

}

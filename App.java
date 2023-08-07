package fr.jseb.programme.library;


import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {

		start();
	}

	public static void start() {
			
		int choixDepart;

		Scanner sc = new Scanner(System.in);
		

		System.out.println("Bonjour Voulez-vous");
		System.out.println("Emprunter un livre? --choix 1--");
		System.out.println("Rendre un livre? --choix 2--");
		System.out.println("Donner un livre? --choix 3--");
		 choixDepart = sc.nextInt();
		
		// condition par rapport au choix de départ
		 
		 switch (choixDepart) {
		 
		 case 1 :
			 Book1.recording();
			 break;
		 case 2 :
			 System.out.print("choix2");
			 break;
		 case 3 :
			 Book1.recording();
			 break;
		 }
		 
		
	}

}

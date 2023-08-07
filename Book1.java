package fr.jseb.programme.library;


import java.util.*;

public class Book1 {
	
	// méthode enregistrement d'un livre
	static void recording() {
		
		// attributs du livre
		String bookTitle;
		String bookAuthor;
		int isbnNumber;
		Boolean available = true;
		
		Scanner sc = new Scanner(System.in);
		Random alea = new Random();
		 
		//Demande de renseignement du livre 
		
		System.out.println("Vous rendez ou donnez un livre --merci--");
		System.out.println("--------------------");
		System.out.println("Quel est le titre du livre ?");
		bookTitle = sc.next();
		
		System.out.println("Quel en est l'auteur ?");
		bookAuthor = sc.next();
		
		// Nb aléatoir pour isbn
		isbnNumber = alea.nextInt(100);
		
		
	}

	
		
	}

 
package com.edu;

import java.util.HashMap;

import java.util.Map;
class Book{
	int id;
	String name,author,publisher;
	int quantity; 
	public Book(int id, String name, String author, String publishor, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publishor;
		this.quantity = quantity;
	}
}
public class MapBookExample {
	public static void main(String[] args) {
		 //Creating map of Books
		HashMap<Integer, Book>map=new HashMap<Integer, Book>();
		//Creating Books
		Book b1=new Book(111,"Look Into Moon", "Charles","lubei weiwei", 10);
		Book b2=new Book(222, "Cooking Love", "Kennedy", "helan merry", 20);
		Book b3=new Book(333, "God Is ComingSoon", "Neha Kennedy", "petter", 30);
		 //Adding Books to
		//Traversing map 
		 for(Map.Entry<Integer, Book> entry:map.entrySet()){    
		        int key=entry.getKey();  
		        Book b=entry.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		    }    
		
	}

}

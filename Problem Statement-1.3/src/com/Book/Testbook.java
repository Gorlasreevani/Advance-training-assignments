package com.Book;

import java.util.Scanner;

public class Testbook {
	public static void main (String[] args) {
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Book name:");
        String bookname=sc.nextLine();
        
        System.out.println("Enter the price:");
        int price=sc.nextInt();
        sc.nextLine();
        
        
        Book obj=new Book();
        obj.setBookName(bookname);
        obj.setBookPrice(price);
        System.out.println("Book Details");
        System.out.println("Book Name :"+obj.getBookName());
        System.out.println("Book Price :"+obj.getBookPrice());
       
    }
}



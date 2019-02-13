	// ----------------------------------------------------------
	// Assignment#1
	// Question: part I & II
	// Written by: David Nguyen-Huu
	// ----------------------------------------------------------
	/**
	 * 
	 * @author David Nguyen-Huu <br>
	 * COMP249	<br>
	 * Assignment #1	<br>
	 * Due Date:  Friday February 1st 2019
	 *
	 */
	public class Book {
	  /** 
		 * This program is divided into two parts.
		 * Part 1: A class named BOOK which stores information such as title, name, ISBN and price.
		 * Part 2: A software which helps store owner keep track of their books.
		 */
		
		//private varialbes (attributes)
		private String title;        		
		private String name;					
		private long ISBN;			
		private double price;				
		private static int counter=0;		

		
		//Default Constructor
		public Book() {
			this.title=null;
		    this.name=null;
		    this.ISBN=0;
		    this.price=0.0;
		    counter++;
		}
		
		//The constructor with parameters
		public Book(String title, String name, long ISBN, double price){
	    this.title=title;
	    this.name=name;
	    this.ISBN=ISBN;
	    this.price=price;
	    counter++;
		}
		
		//Copy constructor
		public Book(Book abook) {
			this.title=abook.title;
		    this.name=abook.name;
		    this.ISBN=abook.ISBN;
		    this.price=abook.price;
		}

		//Accessors & Mutators
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public long getISBN() {
			return ISBN;
		}


		public void setISBN(long ISBN) {
			this.ISBN = ISBN;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}
		
		//toString method
		public String toString() {
			return ("Author: "+name+"\n"+
					"Title: "+title+"\n"+
					"ISBN: "+ISBN+" #"+"\n"+
					"Price: $"+price+"\n");
		}

		//finds number of books created (method)
		public static int findNumberOfCreatedBooks(){
			return counter;
		}

		//Compares two Book objects 
		public boolean equals(Book otherBook){
			return((ISBN==otherBook.ISBN) && (price==otherBook.price));
		}

package HomeWork;
import java.util.Scanner;
import java.io.*;
//RAEKWON WILLIAMS CISC 3130
public class top200LL {
	private Song first; 
	
	public void top299LL() {
		first =null;
	}
	
	//Checks if Linked List is empty returns boolean
	public boolean isEmpty() {
		return first == null;
	}
	
	//Creates the first object for the Linked List
	void setFirst(Song newFirst) {
		
		newFirst.setNext(first);
		
		first = newFirst;
		
	}
	
	//Prints the Position artist and track name of the 
	//top 200 from the linked list
	void displaySongs(PrintWriter out) {
		
		Song newSong = (first);
		
		
		out.println("PRINTED FROM LINKED LIST");
		while (newSong!= null) {
			
			out.println(newSong.toString());	
			
			newSong = newSong.getNext();
			
			out.println("");
			
		}	
	}
	
}

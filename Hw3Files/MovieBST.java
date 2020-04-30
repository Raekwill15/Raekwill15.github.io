package HomeWork3;
import java.io.*;

public class MovieBST {

	private Movie root;
	
	public Movie getRoot() {return root;}
	public void setRoot(Movie movie) {root = movie;}
	
	
	//Takes in parameters for a new movie to be added and compares it to the 
	//parents then decides which side the new movie should be placed on
	public void addMovie(String title,int year,String[] genre) {
		Movie newMovie = new Movie(title,year,genre);
		
		if (root == null) {
			root = newMovie;
		} 
		else {
			Movie tempMovie = root;
			Movie parent;
			
			while(true) {
				parent = tempMovie;
				
				if (title.compareToIgnoreCase(tempMovie.getTitle()) < 0 ){
					tempMovie = tempMovie.getLeft();
					
					if (tempMovie == null) {
						parent.setLeft(newMovie);
						return;
					}
				}
				else {
					tempMovie = tempMovie.getRight();
		
					if(tempMovie == null) {
						parent.setRight(newMovie);
						return;
					}
				}
			}
		}
	}
	
	//Takes tempMovie and prints all nodes beneath it.
	public void printTree(Movie tempMovie, PrintWriter out) {
		
		if (tempMovie != null) {
			printTree(tempMovie.getLeft(),out);
			out.println(tempMovie);
			printTree(tempMovie.getRight(),out);
			
		}	
	}
	
}

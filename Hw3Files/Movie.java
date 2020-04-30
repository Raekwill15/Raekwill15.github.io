package HomeWork3;

public class Movie {

	private String title;
	private int year;
	private String[] genres;
	
	private Movie leftChild;
	private Movie rightChild;
	
	public Movie(String title, int year,String[] genres) {
		this.title = title;
		this.year = year;
		this.genres = genres;
	}
	
	public Movie() {}
	
	public String toString() {
		
		String genre = "";
			for (int x=0;x<genres.length;x++) {
			genre +=  genres[x];
		}
		
		return title + "(" + year + ") " + genre;
	}
	
	public void setTitle(String title) {this.title = title;}
	public void setYear(int year) {this.year = year;}
	public void setGenres(String newGenre) {genres[genres.length] = newGenre;}
	public void setLeft(Movie newMovie) {leftChild = newMovie;}
	public void setRight(Movie newMovie) {rightChild = newMovie;}
	
	public String getTitle() {return title;}
	public int getYear() {return year;}
	public String[] getGenres() {return genres;}
	public Movie getLeft() {return leftChild;}
	public Movie getRight() {return rightChild;}
	
}

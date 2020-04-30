package HomeWork;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
//RAEKWON WILLIAMS CISC 3130
public class Hw1Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\eclipse\\CISC3130Spring20\\src\\HomeWork\\TopArtistList.csv");
		File outFile = new File("D:\\eclipse\\CISC3130Spring20\\src\\HomeWork\\Hw1Output.txt");
		
		PrintWriter out = new PrintWriter(outFile);
		
		String row;
		String[][] myList = new String[201][10];
		top200LL topArtistsLL = new top200LL();
		int x=0,y=0,count;
		
		//Read and split up the CSV file by the ,'s
		BufferedReader csvReader = new BufferedReader (new FileReader(file));		
		while ((row = csvReader.readLine()) != null) {
			StringTokenizer token = new StringTokenizer(row,",");
			count = token.countTokens();
			for	(x=0;x<count;x++) {
				myList[y][x] = token.nextToken();
			}
			y++;
			
		}
			
			sortArray(myList);
			countAppearence(myList);
			createLinkedList(myList, topArtistsLL);
			topArtistsLL.displaySongs(out);
			printArray(myList,out);
			out.flush();
			
			System.out.println("Done");
			csvReader.close();
			out.close();
	}

	//Prints the array of the top 200 artists streamed
	public static void printArray(String[][] top200,PrintWriter out) {
		out.println("PRINTED FROM ARRAY");
		for (int z = 0; z < 201; z++) {
			out.println("------------------");
			for (int v = 0; v < 6; v++) {
			out.println(top200[z][v]);
			}	
		}
	}
	
	//Sorts the array of the top 200 artists in aplhabetical order
	public static void sortArray(String[][] top200) {
		String pos,trackName,artist,streams,url;
		
		for (int z = 1; z < 201; z++) {
			for (int v = z+1; v < 201; v++) {
				if (top200[z][2].compareToIgnoreCase(top200[v][2].toLowerCase()) > 0) {
					pos = top200[v][0];
					trackName = top200[v][1];
					artist = top200[v][2];
					streams = top200[v][3];
					url = top200[v][4];
					
					top200[v][0] = top200[z][0];
					top200[v][1] = top200[z][1];
					top200[v][2] = top200[z][2];
					top200[v][3] = top200[z][3];
					top200[v][4] = top200[z][4];
					
					top200[z][0] = pos;
					top200[z][1] = trackName;
					top200[z][2] = artist;
					top200[z][3] = streams;
					top200[z][4] = url;
				}
			}
		}
	}
	
	//Creates the first first link of the linked list and adds the 
	//top 200 artists to the list as links
	public static void createLinkedList(String[][] top200, top200LL topArtistsLL) {
		String pos,trackName,artist,streams,url;
		
		
		for (int x=200;x>0;x--) {
			pos = top200[x][0];
			trackName = top200[x][1];
			artist = top200[x][2];
			streams = top200[x][3];
			url = top200[x][4];
			
			Song newSong = new Song(pos,trackName,artist,streams,url);
			topArtistsLL.setFirst(newSong);
		}
			
		System.out.println("DONE");
		System.out.println("");
	}
	
	//Counts how many times an artist appears and adds the count to the array
	public static void countAppearence(String[][] top200) {
		int count=0,x,y;
	
		for (x = 1;x < 201; x++) {
			count = 0;
			for (y= 0;y < 201; y++) {
				if(top200[x][2].contentEquals(top200[y][2])) 
					count++;
			}
			top200[x][5] = "Appears: " + count + " times";
		}
		
	}
	
}

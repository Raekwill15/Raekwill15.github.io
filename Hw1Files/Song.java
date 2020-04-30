package HomeWork;
//RAEKWON WILLIAMS CISC 3130
public class Song {
	
	private String artist;
	private String pos;
	private String trackName;
	private String streams;
	private String url;
	private Song next;
	
	//Constructor
	public Song(String pos, String trackName, String artist, String streams, String url) {
		this.artist = artist;
		this.pos = pos;
		this.trackName = trackName;
		this.streams = streams;
		this.url = url;
		
	}
	//Constructor
	public Song(Song newSong) {
		artist = newSong.getArtist();
		pos = newSong.getPos();
		trackName = newSong.getTrack();
		streams = newSong.getStreams();
		url = newSong.getUrl();
	}
	//Setters
	public void setArtist(String name) { artist = name; }
	public void setPos(String Pos) { pos = Pos; }
	public void setTrack(String track) { trackName = track; }
	public void setStreams(String stream) { streams = stream; }
	public void setUrl(String link) { url = link; }
	public void setNext(Song nxt) { next = nxt; }
	
	//Getters
	public String getArtist() { return artist; }
	public String getPos() { return pos; }
	public String getTrack() { return trackName; }
	public String getStreams() { return streams; }
	public String getUrl() { return url; }
	public Song getNext() { return next; }
	
	//Overridden toString()
	public String toString() {	
		return "Position: " + pos + "  Artist: " + artist + " Track Name: " + trackName;  
	}
	
}

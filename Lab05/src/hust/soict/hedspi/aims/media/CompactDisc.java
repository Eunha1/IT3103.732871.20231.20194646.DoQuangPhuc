package hust.soict.hedspi.aims.media;
import java.util.ArrayList;

import hust.soict.hedspi.aims.exception.PlayerException;
// Do Quang Phuc 20194646
public  class CompactDisc extends disc implements Playable{
	private String artist;
	private ArrayList<track> tracks = new ArrayList<>();
	
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(String title) {
		super(title);
	}
	// Constructor theo category, title and cost
	public CompactDisc(String title, String category, float cost) {
		super(title, category , cost);
	}
	// Constructor theo director, category, title and cost
	public CompactDisc(String title, String category, String director, float cost) {
		super(title, category ,director, cost);
	}
	// Constructor theo all attributes: title, category, director, length and cost
	public CompactDisc(String title, String category, String director, int length, float cost) {
		super(title,category,director,length,cost);	
	}
	// Constructor by: title, category, cost, length and director and artist
	public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
		super(title,category,director,length,cost);	
		this.artist = artist;
	}
	// Getter và Setter of the Disc
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public ArrayList<track> getTracks() {
		return tracks;
	}
	public void setTracks(ArrayList<track> tracks) {
		this.tracks = tracks;
	}
	
	// Method addTrack
		public void addTrack(track track_other){
			if(tracks.contains(track_other)) {
				System.out.println("CD Already in Tracks");
			}else {
				tracks.add(track_other);
				System.out.println("CD have added on Tracks");
			}
		}
		
		// Method removeTrack
		public void removeTrack(track track_other){
			if(tracks.contains(track_other)) {
				tracks.remove(track_other);
				System.out.println("CD have removed on Tracks");
			}else {
				System.out.println("CD does not exist in Tracks");
			}
		}
		
		// Method getLength()
		int sumLength = 0;
		public int getLengthCD(){
			for (track element : tracks) {
				sumLength += element.getLength();
		    }  
			return sumLength;
		}
		@Override
		public String play() throws PlayerException {
			if (this.getLength() > 0) {
			String res = "";
			for (track t: tracks) {
				try {
					res.concat(t.play());
				} catch (PlayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				res.concat("\n");
			}
			return res;
			}
			else throw new PlayerException("ERROR: The length of CD is not positive!");
		}
}

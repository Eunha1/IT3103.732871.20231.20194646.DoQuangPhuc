package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

// Do Quang Phuc 20194646
public class track implements Playable {
	private String title ;
	private int length ;

	public track() {
		// TODO Auto-generated constructor stub
	}
	
	//Getter và setter của Track 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	// play() method from Playable
	@Override
	public String play() throws PlayerException  {
		if (this.getLength() > 0) {
		return ("Playing track: " + this.getTitle() + "\nTrack length: " + this.getLength());
		}
    	else throw new PlayerException("ERROR: The length of track is not positive!");
   }
	// Ghi đè phương thức equals theo tittle và length
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof track) {
			track track_another = (track) obj;
			if(this.title.equals(track_another.title)
				&& this.length == track_another.length ) {
				return true;
			}
		}
		return false;	
	}
	
}

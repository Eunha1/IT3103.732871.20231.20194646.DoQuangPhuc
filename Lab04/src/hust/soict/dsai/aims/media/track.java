package hust.soict.dsai.aims.media;
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

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: "+ this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
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

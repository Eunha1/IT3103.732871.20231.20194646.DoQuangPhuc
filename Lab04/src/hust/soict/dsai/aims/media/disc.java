package hust.soict.dsai.aims.media;
// Do Quang Phuc 20194646
public class disc	extends media {
	private String director ; // Thuộc tính đạo diễn
	private int length ; // Thuộc tính độ dài CD
	
	// Defalut constructor of the Disc
	public disc() {
		// TODO Auto-generated constructor stub
	}
	
	// Constructor of the Disc 
	public disc(int id, String title, String category, float cost ,String director, int length) {
		super(id , title , category ,cost );
		this.director = director;
		this.length = length;
	}
	// Constructor of the Disc by title
	public disc(String title) {
		super(title);
	}
	// Constructor theo category, title and cost
	public disc(String title, String category, float cost) {
		super(title, category , cost);
	}
	// Constructor theo director, category, title and cost
	public disc(String title, String category, String director, float cost) {
		super(title, category , cost);
		this.director = director;
	}	
	// Constructor theo all attributes: title, category, director, length and cost
	public disc(String title, String category, String director, int length, float cost) {
		super(title, category ,cost);
		this.director = director;
		this.length = length;	
	}
	
	// Getter và Setter of the Disc
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}


public class DigitalVideoDisc{
	// các thuộc tính có trong một lớp dvd
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	// contructor của lớp DigitalVideoDisc
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	// phương thức in thông tin một dvd
	public void getDvd() {
		System.out.println("Title: " + title +','
				+ " Category: " + category +','
				+ " Director: " + director+',' 
				+" Length: " + length +',' 
				+ " Cost: " + cost);
		System.out.println("-----------------------");
	}
	// các phương thức getter của lớp 
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
}


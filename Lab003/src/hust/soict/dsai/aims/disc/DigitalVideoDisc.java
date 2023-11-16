package hust.soict.dsai.aims.disc;


public class DigitalVideoDisc{
	// các thuộc tính có trong một lớp dvd
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0; // Class attribute 
	int id = 0 ; // Instance attribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// contructor của lớp DigitalVideoDisc
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	// Phương thức khởi tạo theo title
	public DigitalVideoDisc(String title) {
		this.title = title;
		// Mỗi lần gọi hàm contructor thì số lượng DVD tăng lên 1;
		id = nbDigitalVideoDiscs++;
	}		
		// Phương thức khởi tạo theo category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		// Mỗi lần gọi hàm contructor thì số lượng DVD tăng lên 1;
		id = nbDigitalVideoDiscs++;
	}	
		// Phương thức khởi tạo theo director, category, title and cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		// Mỗi lần gọi hàm contructor thì số lượng DVD tăng lên 1;
		id = nbDigitalVideoDiscs++;
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
	// Phương thức gettter và setter của title 
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		// Phương thức gettter và setter của category
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		// Phương thức gettter và setter của director
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		// Phương thức gettter và setter của length
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		// Phương thức gettter và setter của cost
		public float getCost() {
			return cost;
		}
		public void setCost(float cost) {
			this.cost = cost;
		}
		@Override
		public String toString() {
			return "DVD - [" + title + "] - [" + category + "] - [" + director + "] - ["
					+ length + "] : [" + cost + "$]";
		}
}


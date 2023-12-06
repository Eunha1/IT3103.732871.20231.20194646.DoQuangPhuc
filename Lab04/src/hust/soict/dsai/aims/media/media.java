// Do Quang Phuc 20194646
package hust.soict.dsai.aims.media;
import java.util.Comparator;

public class media {
	private int id = 0; // Thuộc tính id của media 
	private String title; // Thuộc tính tiêu đề của media
	private String category ; // Thuộc tính thể loại của media
	private float cost; // Thuộc tính giá tiền của media
	
	//comparators as attributes of the Media class:
	public static final Comparator<media> COMPARE_BY_TITLE_COST =
			new MediaComparatorByTitleCost();
	
	public static final Comparator<media> COMPARE_BY_COST_TITLE =
			new MediaComparatorByCostTitle();
	
	public media() {
		// TODO Auto-generated constructor stub
	}
	// Contrucstor by id , title , category , cost
	public media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	//Contructor by title
	public media(String title) {
		this.title = title ;
	}
		
	//Contructor by title , category , cost
	public media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	// Getter and Setter of ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// Getter and Setter of title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	// Getter and Setter of category
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	//Getter and Setter of cost
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return (id+1) + ".Media - [" + title + "] - [" + category + "] - [" + "] - ["
				+ "] : [" + cost + "$]";
	}
	// Override equals theo title
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof media) {
			media media_another = (media) obj;
			if(this.title.equals(media_another.title)) {
				return true;
			}
		}
		return false;	
	}
}

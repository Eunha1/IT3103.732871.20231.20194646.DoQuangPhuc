// Do Quang Phuc - 20194646
package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class book extends media{
	// private int id ; // Thuoc tinh id cua book
	// private String title; // thuoc tinh title cua book
	// private String category; // thuoc tinh category cua book
	// private float cost; // thuoc tinh cost cua book
	private List<String> authors = new ArrayList<String>(); // ArrayList
	 
	// Constructor by id , title , category , cost , authors
	// public book(int id,String title ,String category ,float cost ,List<String> authors) {
	//	 this.id = id;
	//	 this.title = title;
	//	 this.category = category;
	//	 this.cost = cost;
	//	 this.authors = authors;
	// }
	 
	 // Contructor default
	 public book () {
		 // TODO Auto-generated constructor stub
	 }
	 // contructor by id , title, category, cost , author
	 public book(int id , String title , String category , float cost ,List<String> authors) {
			super(id , title , category , cost);
			this.authors = authors;
		}
	 // contructor by title
	 public book(String title) {
			super(title);
		}
	// Getter and Setter of Authors
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
		
	// Method addAuthor 
	public void addAuthor(String authorName){
		if(authors.contains(authorName)) {
			System.out.println("Author already exist");
		}else {
			authors.add(authorName);
		}
	}
		
	// Method removeAuthor 
	public void removeAuthor(String authorName){
		if(!authors.contains(authorName)) {
			System.out.println("Author does not exist");
		}else {
			authors.remove(authorName);
		}
	}
 }

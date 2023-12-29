// Do Quang Phuc - 20194646
package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class book extends Media{
	 private List<String> authors = new ArrayList<String>(); // ArrayList
	 private String author;
	 // Contructor default
	 public book () {
		 // TODO Auto-generated constructor stub
	 }
	 // contructor by id , title, category, cost , author
	 public book(int id , String title , String category , float cost ,List<String> authors) {
			super(id , title , category , cost);
			this.authors = authors;
	}
	 // contructor title, category, cost , author
	 public book(String title , String category , float cost ,String authors) {
			super(title , category , cost);
			this.author = authors;
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

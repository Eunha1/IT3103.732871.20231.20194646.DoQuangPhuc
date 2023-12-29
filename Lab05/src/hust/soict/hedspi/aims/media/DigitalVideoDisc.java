// Do Quang Phuc 20194646
package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class DigitalVideoDisc extends disc implements Playable  {
	private String director; // thuoc tinh dao dien
	private int length; // thuoc tinh do dai dvd
	
	
	private static int nbDigitalVideoDisc = 0;
	
	// Constructor theo title
	public DigitalVideoDisc (String title) {
		super(title);
		// moi lan goi constructor thi tang len 1
		setId(nbDigitalVideoDisc++);
	}
	// Constructor theo category, title, cost
	public DigitalVideoDisc (String title, String category, float cost) {
		super(title, category, cost);
		// moi lan goi constructor thi tang len 1
		setId(nbDigitalVideoDisc++);
	}
	// Constructor theo category, title, cost, director
	public DigitalVideoDisc (String title, String category,String director, float cost) {
		super(title, category, cost);
		this.director = director;
		// moi lan goi constructor thi tang len 1
		setId(nbDigitalVideoDisc++);
	}

	// Constructor theo all attributes: title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,director,length,cost);
		// Mỗi lần gọi hàm contructor thì biến nbDigitalVideoDisc tăng lên 1;
		setId(nbDigitalVideoDisc++);
	}
	@Override
	public String toString() {
		return (getId()+1) + ".DVD - [" + getTitle() + "] - [" + getCategory() + "] - [" + director + "] - ["
				+ length + "] : [" + getCost() + "$]";
	}
	@Override
	public String play() throws PlayerException{
    	if (this.getLength() > 0) {
    		return ("Playing DVD: " + this.getTitle() + "\nDVD length: " + this.getLength());
    	}
    	else throw new PlayerException("ERROR: The length of DVD is not positive!");
    }
}

package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;
public class Store {	
	private int numOfCurrentDVD = 0 ;
	// Thuộc tính chứa số DVD có sẵn trong cửa hàng
	ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>(); 
	// Phương thức thêm DVD vào cửa hàng	
	public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc... dvds) {
		itemsInStore.add(dvd1);
		numOfCurrentDVD++;
		for(DigitalVideoDisc disc: dvds) {
			itemsInStore.add(disc);
			numOfCurrentDVD++;
		}
	}
	// Phương thức thêm list dvd vào cửa hàng
	public void addDVD(DigitalVideoDisc[] dvds) {
		for(DigitalVideoDisc dvd : dvds) {
			itemsInStore.add(dvd);
			numOfCurrentDVD++;
		}
	}	
	// Phương thức xóa DVD khỏi cửa hàng
	public void removeDVD(DigitalVideoDisc dvd, DigitalVideoDisc... dvds) {
		itemsInStore.remove(dvd);
		numOfCurrentDVD--;
		for(DigitalVideoDisc disc: dvds) {
			itemsInStore.remove(disc);
			numOfCurrentDVD--;
		}
	}
	// Phương thức xóa list dvd
	public void removeDVD(DigitalVideoDisc[] dvds) {
		for(DigitalVideoDisc dvd : dvds) {
			itemsInStore.remove(dvd);
			numOfCurrentDVD--;
		}
	}
}

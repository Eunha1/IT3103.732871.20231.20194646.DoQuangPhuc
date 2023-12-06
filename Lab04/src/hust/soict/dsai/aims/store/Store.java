package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.media;
import java.util.ArrayList;
// Do Quang Phuc  20194646
public class Store {	
	// Thuoc tinh chua so luong dia trong store
	private int numOfCurrentMedia = 0 ;
	// Thuoc tinh mang chua tat ca cac gia tri trong mang
	ArrayList<media> itemsInStore = new ArrayList<media>(); 

	// Phuong thuc them media vao cua hang
	public void addMedia(media media1, media... medias) {
		itemsInStore.add(media1);
		numOfCurrentMedia++;
		for(media disc: medias) {
			itemsInStore.add(disc);
			numOfCurrentMedia++;
		}
	}
	public void addDVD(media[] medias) {
		for(media media : medias) {
			itemsInStore.add(media);
			numOfCurrentMedia++;
		}
	}
	
	// Phuong thuc xoa ca dia khoi cua hang
	public void removeMedia(media media1, media... medias) {
		itemsInStore.remove(media1);
		numOfCurrentMedia--;
		for(media media : medias) {
			itemsInStore.remove(media);
			numOfCurrentMedia--;
		}
	}
	public void removeDVD(media[] medias) {
		for(media media : medias) {
			itemsInStore.remove(media);
			numOfCurrentMedia--;
		}
	}
	// Phuong thuc getter và setter của numOfCurrentMedia
	public int getnumOfCurrentMedia() {
		return numOfCurrentMedia;
	}
	public void setnumOfCurrentMedia(int numOfCurrentMedia) {
		this.numOfCurrentMedia = numOfCurrentMedia;
	}
	
}
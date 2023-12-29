package hust.soict.hedspi.aims.media;
// Do Quang Phuc 20194646
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaTest {

	public static void main(String[] args) {
		
		List<Media> mediae = new ArrayList<Media>();
		
		// create some media here
		CompactDisc cd = new CompactDisc("Gfriend");
		DigitalVideoDisc dvd = new DigitalVideoDisc("Sunrise");
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Summer Rain");
		book book = new book("New Book");
		// add media 
		mediae.add(cd);
		mediae.add(dvd);
		mediae.add(book);
		// Test collections sort
		Collections.sort(mediae, Media.COMPARE_BY_TITLE_COST);
		//Collections.sort(mediae, Media.COMPARE_BY_COST_TITLE);
		for( Media m: mediae) {
			System.out.println(m.toString());
		}
	}

}

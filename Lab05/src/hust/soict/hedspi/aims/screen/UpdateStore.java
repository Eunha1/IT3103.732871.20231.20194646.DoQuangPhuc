package hust.soict.hedspi.aims.screen;
// Do Quang Phuc 2194646
import java.util.Optional;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.book;
import javafx.application.Application;
import javafx.stage.Stage;

public class UpdateStore extends Application {
	// attribute to decide which one will be chosen to do
		public int type;
		// media to get the result
		private Media m;
		// setter to set the type
		public void setType(int type) {
			this.type = type;
		}
		// start method to run
		@Override
		public void start(Stage arg0){
			// show dialog depended by type
			switch (type) {
				case 1: { // type 1: Book
					AddBookToStoreScreen a = new AddBookToStoreScreen(); // create new book dialog
					Optional<book> result = a.d.showAndWait(); // get result from it
					if (result.isPresent()) { // if result is exist
						// try-catch to get error
						try { 
							this.m = (Media) result.get(); // upcast the result to media 
						} catch (Exception e) { // if error is occur
							System.out.println("Huy qua trinh nhap"); // print error
						}			
					}
					break;
				}
				case 2: { // type 2: CD
				AddCDToStoreScreen a = new AddCDToStoreScreen(); // create new CD dialog
				Optional<CompactDisc> result = a.d.showAndWait(); // get result from it
				if (result.isPresent()) {// if result is exist
					// try-catch to get error
					try {
						this.m = (Media) result.get();// upcast the result to media 
						
					} catch (Exception e) { // if error is occur
						System.out.println("Huy qua trinh nhap"); // print error
					}		
				}
				break;
				}
				case 3: { // type 2: DVD
					AddDVDToStoreScreen a = new AddDVDToStoreScreen(); // create new DVD dialog
					Optional<DigitalVideoDisc> result = a.d.showAndWait(); // get result from it
					if (result.isPresent()) {// if result is exist
						// try-catch to get error
						try {
							this.m = (Media) result.get(); // upcast the result to media 
							System.out.println(m.toString());
						} catch (Exception e) { // if error is occur
							System.out.println("Huy qua trinh nhap"); // print error
						}					
					}
					break;
					}
			}
		}
		public Media getM() {
			return m;
		}
}

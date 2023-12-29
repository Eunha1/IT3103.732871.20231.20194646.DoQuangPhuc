package hust.soict.hedspi.aims.screen;
// Do Quang Phuc 20194646
import hust.soict.hedspi.aims.media.book;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
	// new field exclusive to Book type - author
		Label author = new Label("Author: ");
		TextField tauthor = new TextField();
		// dialog create by this class
		Dialog d;	
		// construtor to get everything we need
		public AddBookToStoreScreen() {
			createBook();
		}
		// method to create an add-book dialog
		public Dialog createBook() {
			d = createDialog(); // call the createDialog() method of the parent class
			d.setResult(book.class); // set result type of the dialog to Book
			GridPane grid = setgrid(); // create grid
			addToGrid(grid, author, tauthor); // add author field to it
			addToGrid(grid, this.cost, this.tcost); // add cost field to it
			floatTxtFld(tcost);
			d.getDialogPane().setContent(grid); // add the grid to the dialog
			setbutton(d); // add the button to the dialog
			return d; // return
		}
		// method to create button and handle event
		public void setbutton(Dialog dialog) {
			ButtonType buttonTypeOk = new ButtonType("Okay", ButtonData.OK_DONE); // create new ok button
			dialog.getDialogPane().getButtonTypes().add(buttonTypeOk ); // add it to the dialog
			// set result converter
			dialog.setResultConverter(new Callback<ButtonType, book>() { 
				@Override
				public book call(ButtonType b) {
					if (b == buttonTypeOk) {//so that when we click the button
					//  we get the media
						return new book(ttitle.getText(), tcate.getText(), Float.parseFloat(tcost.getText()), tauthor.getText()); 
					}
					return null;
				}
			});
		}
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Cart {
	// số lượng các đơn hàng tối đa có thể ordered
	public static final int MAX_NUMBER_ORDERED = 20;
	// mảng chứa các dvd
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc [MAX_NUMBER_ORDERED];
	ArrayList<DigitalVideoDisc> list_items = new ArrayList<DigitalVideoDisc>(Arrays.asList(itemsOrdered));
	// số lượng các đơn hàng trong giỏ hàng hiện tại
	private int qtyOrdered = 0 ;
	// tổng giá trị các đơn hàng hiện tại
	private float total = 0;
	// Thêm một dvd vào giỏ hàng
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		// kiểm tra nếu số đơn hàng trong giỏ hàng hiện tại nhỏ hơn lượng tối đa các đơn hàng 
		// thì thêm vào mảng các dvd
		if(qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			System.out.println("The disc has been added");
			qtyOrdered ++;
		}else {
			// hiện thông báo giỏ hàng đã đầy
			System.out.println("The cart is almost full");
		}
	}
	// Tính tổng giá trị của giỏ hàng
	public float totalCost() {
		for (int i = 0; i < qtyOrdered ; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	// xóa bỏ 1 dvd ra khỏi giỏ hàng
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		// vị trí của dvd cần xóa 
		int indexToRemove = -1;
		// tìm kiếm vị trí của dvd cần xóa
		for (int i = 0 ; i < qtyOrdered ; i++) {
			// so sánh giá trị của dvd với từng dvd trong giỏ hàng
			if(itemsOrdered[i] == disc) {
				// nếu bằng thì vị trí cần xóa sẽ được gán cho biến indexToRemove và thoát 
				indexToRemove = i;
				break;
			}
		}
		// nếu tìm được ví trí của dvd cần loại bỏ
		if(indexToRemove != -1 ) {
			// dịch chuyển các phàn tử qua phải một ví trí tính từ vị trí dvd cần loại bỏ
			for( int i = indexToRemove; i < qtyOrdered ; i++) {
				itemsOrdered[i] = itemsOrdered[i+1];
			}
			// phần tử cuối cùng bằng null 
			itemsOrdered[qtyOrdered -1] = null;
			// giảm số lượng các đơn hàng hiện tại trong giỏ đi 1 
			qtyOrdered -- ;
			// in ra thông báo
			System.out.println("The disc have been delete");
		}else {
			// nếu không tìn thấy dvd , in ra thông báo
			System.out.println("The disc was not found in the cart for delete");
		} 
	}
	// in tất cả thông tin các dvd có trong giỏ hàng
	public void printItemsOrdered () {
		// loại bỏ các item null có trong danh sách giỏ hàng
		removeNullItems();
		// nếu có đơn hàng trong giỏ hàng thì in ra thông tin
		if(qtyOrdered > 0) {		
			for(int i = 0; i < qtyOrdered; i++) {
				System.out.println("Title: " + itemsOrdered[i].getTitle()+','
						+ " Category: " + itemsOrdered[i].getCategory()+','
						+ " Director: " + itemsOrdered[i].getDirector()+',' 
						+" Length: " + itemsOrdered[i].getLength()+',' 
						+ " Cost: " + itemsOrdered[i].getCost());
				System.out.println("-----------------------");
			}
		}else {
			// nếu không có đơn trong giỏ hàng thì in ra thông báo
			System.out.println("Your cart is empty! Please add dvd to your cart");
		}
	}
	// sắp xếp theo tiêu đề
	public void sortByTitle () {
		// loại bỏ các item null có trong danh sách giỏ hàng
		removeNullItems();
		// nếu đơn hàng trong giỏ hàng lớn hơn 0
		if(qtyOrdered > 0) {
			// dùng phương thức sort của lớp arrays 
			// sử dụng comparator để tạo một đối tượng Comparator mới đối với lớp DigitalVideoDisc
			Arrays.sort(itemsOrdered, new Comparator<DigitalVideoDisc>() {
				// phương thức so sánh tiêu đề
				public int compare(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
					if (dvd1 == null && dvd2 == null) {
	                    return 0; // Cả hai null, không cần sắp xếp
	                } else if (dvd1 == null) {
	                    return -1; // dvd1 null, đặt trước dvd2
	                } else if (dvd2 == null) {
	                    return 1; // dvd2 null, đặt trước dvd1
	                } else {
	                	// sắp xếp theo tiêu đề
	                    return dvd1.getTitle().compareTo(dvd2.getTitle());
	                }
				}
			});
		}else {
			// thông báo lỗi nếu không có đơn hàng trong giỏ
			System.out.println("Your cart is empty! Please add dvd to your cart");
		}
	}
	// Sắp xếp theo giá cả
	public void sortByCost() {
		// loại bỏ các item null có trong danh sách giỏ hàng
		removeNullItems();
		// nếu đơn hàng trong giỏ hàng lớn hơn 0
		if(qtyOrdered > 0) {	
			// dùng phương thức sort của lớp arrays 
			// sử dụng comparator để tạo một đối tượng Comparator mới đối với lớp DigitalVideoDisc
			Arrays.sort(itemsOrdered,new Comparator<DigitalVideoDisc>() {
				public int compare(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) { 	
					if (dvd1 == null && dvd2 == null) {
	                    return 0; // Cả hai null, không cần sắp xếp
	                } else if (dvd1 == null) {
	                    return -1; // dvd1 null, đặt trước dvd2
	                } else if (dvd2 == null) {
	                    return 1; // dvd2 null, đặt trước dvd1
	                } else {
	                	// sắp xếp theo giá cả
	                	return Float.compare(dvd1.getCost(), dvd2.getCost());
	                }     
				}
			});
		}else {
			// thông báo lỗi nếu không có đơn hàng trong giỏ
			System.out.println("Your cart is empty! Please add dvd to your cart");
		}
	}
	private void removeNullItems() {
	    int count = 0; // Biến đếm để theo dõi số lượng đối tượng hiện có trong mảng newItemsOrdered
	    DigitalVideoDisc[] newItemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED]; // Mảng mới để lưu trữ các đối tượng sau khi loại bỏ null
	    for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
	        // Kiểm tra xem phần tử tại vị trí i có khác null hay không
	        if (itemsOrdered[i] != null) {
	            // Nếu khác null, thêm đối tượng này vào mảng newItemsOrdered
	            newItemsOrdered[count] = itemsOrdered[i];
	            count++; // Tăng biến đếm
	        }
	    }
	    // Gán mảng newItemsOrdered cho mảng itemsOrdered để loại bỏ các phần tử null
	    itemsOrdered = newItemsOrdered;
	    // Cập nhật số lượng đối tượng trong giỏ hàng
	    qtyOrdered = count;
	}

	// Phương thức print - in ra màn hình theo yêu cầu
	public void print() {
		System.out.println("***********************CART***********************");
		
		for(int i = 0 ; i < list_items.size() ; i++) {
			if(list_items.get(i) == null) {
				list_items.remove(i);
			}else {
				System.out.println(list_items.get(i));
			}
		}
		
		System.out.println("Total cost: " + totalCost() + "$");
		System.out.println("***************************************************");
	}
	
	//Phương thức tìm kiếm theo ID và display the search results
	public void searchByID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID for search: ");
		int x = sc.nextInt();
		boolean check = false;
		
		for( int i = 0 ; i < list_items.size() ; i++) {	
			if(list_items.get(i) == null) {
				list_items.remove(i);
			}else {
				if(list_items.get(i).getId() == x) {
					System.out.println(list_items.get(i));
					check = true;
					break;
				}
			}
		}
		if(check == false) {
			System.out.println("No match is found");
		}	
	}
	
	// Phương thức tìm kiếm theo title
	public void isMatchByTitle(String title) {
		boolean check = false;
		
		for( int i = 0 ; i < list_items.size() ; i++) {	
			if(list_items.get(i) == null) {
				list_items.remove(i);
			}else {
				if(title.equals(list_items.get(i).getTitle())) {
					System.out.println(list_items.get(i));
					check = true;
					break;
				}
			}
		}
		if(check == false) {
			System.out.println("No match is found");
		}	

	}
}

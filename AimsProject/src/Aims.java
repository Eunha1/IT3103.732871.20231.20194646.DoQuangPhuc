
import java.util.Scanner;
public class Aims {
	public static void main (String [] args) {
		// khởi tạo các lớp 
		Cart anOrder = new Cart();
		DvDStore dvdStore = new DvDStore();
		// lớp nhập 
		Scanner scanner = new Scanner(System.in);
		// một menu
		while(true) {
			System.out.println("MENU--------------------");
            System.out.println("1. Tìm kiếm DVD theo tiêu đề");
            System.out.println("2. Tìm kiếm DVD theo danh mục");
            System.out.println("3. Tìm kiếm DVD theo giá");
            System.out.println("4. Xem mặt hàng");
            System.out.println("5. Thêm DVD vào giỏ hàng");
            System.out.println("6. Xóa DVD khỏi giỏ hàng");
            System.out.println("7. Sắp xếp đơn hàng trong giỏ hàng theo tiêu đề");
            System.out.println("8. Sắp xếp đơn hàng trong giỏ hàng theo giá cả");
            System.out.println("9. Xem giỏ hàng");
            System.out.println("10. Đặt hàng");
            System.out.println("0. Thoát");
            System.out.println("------------------------");
            int choice = scanner.nextInt();
            switch(choice) {
            	case 1 :  
            		// nhập tiêu đề cần tìm và tìm kiếm 
            		String keyWord;
            		System.out.println("Please enter your title keyWord");
            		scanner.nextLine();
            		keyWord = scanner.nextLine();
            		dvdStore.searchByTitle(dvdStore.getDvdCollection(), keyWord);
            		break;
            	case 2 : 
            		// nhập danh mục cần tìm và tìm kiếm
            		String category;
            		System.out.println("Please enter your category keyWord");
            		scanner.nextLine();
            		category = scanner.nextLine();
            		dvdStore.searchByCategory(dvdStore.getDvdCollection(), category);
            		break;
            	case 3 :
            		// nhập minCost và maxCost
            		System.out.println("Please enter min cost you want");
            		float minCost = scanner.nextFloat();
            		scanner.nextLine();
            		System.out.println("Please anter max cost you want");
            		float maxCost = scanner.nextFloat();
            		scanner.nextLine();
            		dvdStore.searchByCost(dvdStore.getDvdCollection(), minCost, maxCost);
            		break;
            	case 4 :
            		// hiển thị thông tin mặt hàng có trong cửa hàng
            		for(int i = 0; i < dvdStore.getDvdCollection().length; i++) {
            			System.out.printf("Id of DVD : %d\n", i);
            			System.out.println("Infomation\n");
            			dvdStore.dvdCollection[i].getDvd();
            		}
            		break;
            	case 5 :
            		// thêm 1 dvd
            		System.out.println("Please enter your ID of DVD if you want to add");
            		int addID = scanner.nextInt();
            		scanner.nextLine();
            		anOrder.addDigitalVideoDisc(dvdStore.dvdCollection[addID]);
            		break;
            	case 6 :
            		// xóa 1 dvd
            		System.out.println("Please enter your ID of DVD if you want to remove");
            		int removeID = scanner.nextInt();
            		scanner.nextLine();
            		anOrder.removeDigitalVideoDisc(dvdStore.dvdCollection[removeID]);
            		break;
            	case 7 : 
            		// sắp xếp theo tiêu đề
            		System.out.println("Sort by title");
            		anOrder.sortByTitle();
            		break;
            	case 8 : 
            		// sắp xếp theo giá cả
            		System.out.println("Sort by cost");
            		anOrder.sortByCost();
            		break;
            	case 9 : 
            		// hiển thị thông tin mặt hàng trong giỏ hàng
            		System.out.println("List dvd");
            		anOrder.printItemsOrdered();
            		float total = anOrder.totalCost();
            		System.out.printf("Total cost : %f", total);
            		break;
            	case 0 :
            		// thoát chương trình
            		System.out.println("Ứng dụng đã thoát.");
            		scanner.close();
            		return;
                default :
                	System.out.println("Please try again");
            }

		}
	}
}


import java.util.ArrayList;
import java.util.List;

public class DvDStore {
	// khởi tạo các giá trị của dvd trong cửa hàng
	DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD 1", "Action", "Director 1", 120, 9.99f);
	DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD 2", "Comedy", "Director 2", 90, 7.99f);
	DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD 3", "Drama", "Director 3", 150, 12.99f);
	DigitalVideoDisc dvd4 = new DigitalVideoDisc("DVD 4", "Sci-Fi", "Director 4", 110, 10.99f);
	DigitalVideoDisc dvd5 = new DigitalVideoDisc("DVD 5", "Horror", "Director 5", 95, 8.99f);
	DigitalVideoDisc dvd6 = new DigitalVideoDisc ("The Lion King","Animation","Roger Allers",87,19.95f);
	DigitalVideoDisc dvd7 = new DigitalVideoDisc ("Star Wars","Science Fiction","George Lucas",87,24.95f);
	DigitalVideoDisc dvd8 = new DigitalVideoDisc ("Aladin","Animation",null,0,18.99f);
	// thêm vào mảng dvdCollection
	DigitalVideoDisc [] dvdCollection = { dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8 };
	// tìm kiếm theo tiêu đề
	public void searchByTitle(DigitalVideoDisc[] dvdCollection, String keyWord) {
	    List<DigitalVideoDisc> results = new ArrayList<>(); // Danh sách kết quả tìm kiếm
	    // Duyệt qua mảng dvdCollection để tìm các đĩa DVD có tiêu đề chứa từ khóa (không phân biệt chữ hoa/chữ thường)
	    for (DigitalVideoDisc dvd : dvdCollection) {
	        if (dvd != null && dvd.getTitle().toLowerCase().contains(keyWord.toLowerCase())) {
	            results.add(dvd); // Thêm đĩa DVD thỏa mãn vào danh sách kết quả
	        }
	    }
	    // Kiểm tra xem có kết quả tìm kiếm nào không
	    if (results.isEmpty()) {
	        System.out.println("No result is found.");
	    } else {
	        // Hiển thị thông tin của các đĩa DVD thỏa mãn
	        for (DigitalVideoDisc dvd : results) {
	            System.out.println("Title: " + dvd.getTitle() + ','
	                + " Category: " + dvd.getCategory() + ','
	                + " Director: " + dvd.getDirector() + ','
	                + " Length: " + dvd.getLength() + ','
	                + " Cost: " + dvd.getCost());
	            System.out.println("-----------------------");
	        }
	    }
	}
	// tìm kiếm theo danh mục 
	public void searchByCategory(DigitalVideoDisc[] dvdCollection, String keyWord) {
	    List<DigitalVideoDisc> results = new ArrayList<>(); // Danh sách kết quả tìm kiếm

	    // Duyệt qua mảng dvdCollection để tìm các đĩa DVD có danh mục trùng khớp (không phân biệt chữ hoa/chữ thường)
	    for (DigitalVideoDisc dvd : dvdCollection) {
	        if (dvd != null && dvd.getCategory().toLowerCase().equalsIgnoreCase(keyWord.toLowerCase())) {
	            results.add(dvd); // Thêm đĩa DVD thỏa mãn vào danh sách kết quả
	        }
	    }
	    // Kiểm tra xem có kết quả tìm kiếm nào không
	    if (results.isEmpty()) {
	        System.out.println("No result is found.");
	    } else {
	        // Hiển thị thông tin của các đĩa DVD thỏa mãn
	        for (DigitalVideoDisc dvd : results) {
	            System.out.println("Title: " + dvd.getTitle() + ','
	                + " Category: " + dvd.getCategory() + ','
	                + " Director: " + dvd.getDirector() + ','
	                + " Length: " + dvd.getLength() + ','
	                + " Cost: " + dvd.getCost());
	            System.out.println("-----------------------");
	        }
	    }
	}
	// tìm kiếm theo giá cả
	public void searchByCost(DigitalVideoDisc[] dvdCollection, float minCost, float maxCost) {
		// kiểm tra điều kiện min và max là số dương
	    if (minCost >= 0 && maxCost >= 0) {
	    	// min phải nhỏ hơn max
	        if (minCost <= maxCost) {
	            List<DigitalVideoDisc> results = new ArrayList<>(); // Danh sách kết quả tìm kiếm
	            // Duyệt qua mảng dvdCollection để tìm các đĩa DVD có giá nằm trong khoảng [minCost, maxCost]
	            for (DigitalVideoDisc dvd : dvdCollection) {
	                if (dvd.getCost() >= minCost && dvd.getCost() <= maxCost) {
	                    results.add(dvd); // Thêm đĩa DVD thỏa mãn vào danh sách kết quả
	                }
	            }

	            // Kiểm tra xem có kết quả tìm kiếm nào không
	            if (results.isEmpty()) {
	                System.out.println("No result is found.");
	            } else {
	                // Hiển thị thông tin của các đĩa DVD thỏa mãn
	                for (DigitalVideoDisc dvd : results) {
	                    System.out.println("Title: " + dvd.getTitle() + ','
	                        + " Category: " + dvd.getCategory() + ','
	                        + " Director: " + dvd.getDirector() + ','
	                        + " Length: " + dvd.getLength() + ','
	                        + " Cost: " + dvd.getCost());
	                    System.out.println("-----------------------");
	                }
	            }
	        } else {
	            System.out.println("Max cost must be greater than or equal to min cost");
	        }
	    } else {
	        System.out.println("Min cost and max cost must be positive numbers");
	    }
	}
	// trả về mảng dvdCollection
	public DigitalVideoDisc[] getDvdCollection() {
        return dvdCollection;
    }
}

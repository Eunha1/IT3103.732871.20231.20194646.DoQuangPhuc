import java.util.Scanner;
public class DisplayDayofMonth {
	 public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      String[] monthNames = {
	            "January", "February", "March", "April",
	            "May", "June", "July", "August",
	            "September", "October", "November", "December"
	        };
	      int month = -1;
	      while (month < 1 || month > 12) {
	    	  System.out.print("Enter a month (full name, abbreviation, in 3 letters, or number): ");
	          String monthInput = scanner.nextLine().toLowerCase();
	          if (monthInput.matches("^\\d+$")) {
	             month = Integer.parseInt(monthInput);
	             if (month < 1 || month > 12) {
	                System.out.println("Invalid month input.");
	             	}
	             } else {
	               for (int i = 0; i < monthNames.length; i++) {
	                   if (monthNames[i].toLowerCase().startsWith(monthInput)&& monthInput.length() >= 3) {
	                     month = i + 1;
	                     break;
	                   }
	                }
	                if (month < 1 || month > 12) {
	                    System.out.println("Invalid month input.");
	                }
	            }
	        }
	        int year = -1;
	        while (year < 0) {
	            System.out.print("Enter a year (non-negative number with all digits): ");
	            int yearInput = scanner.nextInt();
	            if (yearInput > 0 ) {
	               year = yearInput;
	               break;
	            } else {        	
	            	System.out.println("Invalid year input.");
	            }
	        }
	        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
	        int[] daysInMonth = {31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        System.out.println(monthNames[month - 1] + " " + year + " has " + daysInMonth[month - 1] + " days.");
	        scanner.close();
	    }
}

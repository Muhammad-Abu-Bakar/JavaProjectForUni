package USC_Booking;

import static USC_Booking.Exercise.grp;
import static USC_Booking.U_Booking.modify;
import static USC_Booking.Montly_Report.mr;
import static USC_Booking.Student_reviews.rc;

import java.util.Scanner;


public class Main_Menu_class {

	  
	  
	public static void Main_Menu_class() {
		  
		  
		  
		System.out.println(
				"\tWelcome to the Dashboard\n"+
				 "\t1 Menu \r\n"
	            +"\t2 Attend class Feedback\r\n"
				+"\t3 Booking\r\n"
				+"\t4 Monthly  Report\r\n"
				+"\t5 Winner report\r\n"
				+ "\t6  Exit"
				+"\n Enter Your Choice: ");
		int ch = 0;  //integer variable for choice
		Scanner s = new Scanner(System.in); //Scanner object for user input
		ch = s.nextInt();
		
		switch(ch) {
		
		case 1: 
			grp = new Exercise();
			System.out.println("\tWanna Select the an other option\n");
			Main_Menu_class();
			break;
	
		case 2:
			rc=new Student_reviews();
			System.out.println("\tWanna Select the an other option\n");
			Main_Menu_class();
			
			break;
			
		case 3:
			
			try {
			grp.bookingList();
			modify=new U_Booking();
			System.out.println("\tWanna Select the an other option\n");
			Main_Menu_class();
			}catch(Exception e) {

				System.out.println("\tNo Booking  Avilable \n");
								Main_Menu_class();
			}
			
			
			
			break;
		case 4:
			mr=new Montly_Report();
			mr.ratinglist();
			System.out.println("\tThank You\n");
			Main_Menu_class();
			break;
			
		case 5:
			Montly_Winner_Class cc =new Montly_Winner_Class();
			System.out.println("\tThank You\n");
			Main_Menu_class();
			break;
			
		case 6:
			Main_Menu_class();
			break;
		}
		
		
	}
	public static void main(String[] args) {
		Main_Menu_class();

	}

}

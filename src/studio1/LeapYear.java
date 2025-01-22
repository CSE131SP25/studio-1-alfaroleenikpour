package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("What is the year? ");
		int year = in.nextInt();
		boolean isLeapYear = (year % 4) == 0;
		isLeapYear = (year % 100) != 0; 
		isLeapYear = (year % 400 ) == 0;
		System.out.println(isLeapYear);
		
	}

}

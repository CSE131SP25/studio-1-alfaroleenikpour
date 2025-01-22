package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("What is the value of the first number? ");
		double numOne = in.nextInt();
		System.out.println("What is the value of the second number? ");
		double numTwo = in.nextInt();
		double averageValue = (numOne + numTwo)/2; 
		System.out.println(averageValue);
		
	}

}

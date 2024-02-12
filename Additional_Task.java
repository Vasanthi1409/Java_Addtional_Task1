package Addtional_Task.com;

import java.util.Scanner;

public class Additional_Task {

	public static void main(String[] args) {

		int Discount_Amount, Balance_Amount;

		Scanner SC = new Scanner(System.in);
		System.out.println("Enter Your Bill Amount: ");

		int Bill_Amount = SC.nextInt();
		if (Bill_Amount <= 500) {
			System.out.println("Your Discount is 5%");
			Discount_Amount = Bill_Amount * 5 / 100;
			System.out.println("Your Discount Amount: " + Discount_Amount);
			Balance_Amount = Bill_Amount - Discount_Amount;
			System.out.println("Balance Amount: " + Balance_Amount);
		} else {
			System.out.println("Your Discount is 10%");
			Discount_Amount = Bill_Amount * 10 / 100;
			System.out.println("Your Discount Amount: " + Discount_Amount);
			Balance_Amount = Bill_Amount - Discount_Amount;
			System.out.println("Balance Amount: " + Balance_Amount);
		}
		System.out.println("Thank You Sir Have a Nice Day!!!!!!!");
	}

}

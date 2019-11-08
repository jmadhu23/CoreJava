package com.PerScholas.CoreJava;

import java.util.Scanner;

public class LoanPayment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Loan Amount:");
		double loanAmount = input.nextDouble();
		System.out.println("Enter Yearly Interst Rate:");
		double yearlyIR = input.nextDouble();
		double monthlyIR = (yearlyIR / 100)/12;
		System.out.println("Enter number of years:");
		int noOfYears = input.nextInt();
		int months = noOfYears * 12;
		input.close();
		
		double monthlyPayment = (loanAmount * monthlyIR)/
                 (1.0 - (1.0/Math.pow(1.0 + monthlyIR, months)));
		System.out.println("Loan Amount : "+loanAmount);
		System.out.println(("Interest Rate : "+yearlyIR));
		System.out.println(("No. of months: "+months));
		System.out.println("Monthly payment:"+(monthlyPayment));
	}

}

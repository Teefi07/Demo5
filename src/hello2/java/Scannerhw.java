package hello2.java;

import java.util.Scanner;

public class Scannerhw {
	
	static Scanner hw= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("*********************** SUPER MARKET BROOKLYN **********************************");
		System.out.println("************************** 142 Quentin Road ************************************");
		System.out.println("************************* Brooklyn, NY, 11229 **********************************");
		System.out.println();
		
		System.out.print("Price of Bananas = ");
		int priceofBananas= hw.nextInt();
		
		
		System.out.print("Quantity of Bananas = ");
		int quantityofBananas= hw.nextInt();
		
		System.out.print("Price of Mangoes = ");
		int priceofMangoes= hw.nextInt();
		
		System.out.print("Quantity of Mangoes = ");
		int quantityofMangoes= hw.nextInt();
		
		System.out.print("Price of Oranges = ");
		int priceofOranges= hw.nextInt();
		
		System.out.print("Quantity of Oranges = ");
		int quantityofOranges= hw.nextInt();
		
		double Product1Total= priceofBananas * quantityofBananas;
		double Product2Total= priceofMangoes * quantityofMangoes;
		double Product3Total= priceofOranges * quantityofOranges;
		
		
		System.out.println("********************************************************************************");
		System.out.println("*********************** SUPER MARKET BROOKLYN **********************************");
		System.out.println("************************** INVOICE NO 12 ***************************************");
		System.out.println("********************************************************************************");
		
		
		System.out.println("\tProduct1 Price of Bananas = " + Product1Total + "\n");
		System.out.println("\tProduct2 Price of Mangoes = " + Product2Total + "\n");
		System.out.println("\tProduct3 Price of Oranges = " + Product3Total + "\n");
		
		double GrossAmount = Product1Total + Product2Total + Product3Total;
		double AfterTax = GrossAmount * .0887;
		double NetAmount = AfterTax + GrossAmount;
		
		System.out.println("********************************************************************************");
		
		System.out.println("\tTotal Is = " + GrossAmount);
		System.out.println("\tTax .0887% = " + AfterTax);
		System.out.println("\tTotal Amount After Tax is = " + NetAmount);
		
		
		
		
		System.out.println("********************************************************************************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.juaracoding.main;

import java.util.*;
import java.text.*;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		 
		
		double payment = scan.nextDouble();
		
		Locale INDIA = new Locale("en", "IN");//Creates a new Locale with English as the language and India as teh country;
		
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		
		System.out.println("US: " + us );
		System.out.println("India" + india);
		
		
		

	}

}

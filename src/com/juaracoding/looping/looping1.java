package com.juaracoding.looping;

import java.util.Scanner;

public class looping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] bilangan = {10,20,30,40,50};
		for(int i : bilangan) {
			System.out.println(i);	
			}

		String[] motor = {"honda","yamaha","vespa"};
		for(String i : motor) {
			System.out.println(i);
		}
	
		// gunakan inputan
		// 10, 8, 6, 4 , 2
		// for each kopi = americano, kapal api, good day
		
		int a;
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Masukan Inputan");
		a=ab.nextInt();
		
		for(int b=a; b>=; b=b-2) {
			System.out,println(" "+b);
		}
		

}
}
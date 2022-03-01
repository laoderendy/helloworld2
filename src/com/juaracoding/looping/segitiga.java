package com.juaracoding.looping;

public class segitiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gunakan inputan
		// buat segitiga siku alas 6, tinggi 5
		// mirror ******
		
		for(int i=1; i<5; i++) {
			for(int j=4; j>=1; j++) {
				System.out.println(" * ");
			}
			System.out.println();
		}
		//segitiga siku
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println("*");
				
			}
			System.out.println();
		}

	}

}

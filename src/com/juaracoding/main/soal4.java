package com.juaracoding.main;

import java.util.Scanner;

public class soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int tgl=scan.nextInt();
		int plat=scan.nextInt();
		
		if(tgl%2==1) {
			if(plat%2==1) {
				System.out.println("Tanggal ganjil dan plat nomor ganjil");				
			} else
				System.out.println("Tanggal ganjil dan plat nomor genap");
			
		} else if(plat%2==1) {
		System.out.println("Tanggal genap dan plat nomor genap");
	}else {
		System.out.println("Tanggal genap dan plat nomor ganjil");
	}

	}
}

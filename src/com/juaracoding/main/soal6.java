package com.juaracoding.main;

import java.util.Scanner;
import java.time.LocalDate;


public class soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int tgl = scan.nextInt();
		int bln = scan.nextInt();
		int thn = scan.nextInt();
		
		LocalDate dt = LocalDate.of(thn, bln, tgl);
		System.out.print(dt.getDayOfWeek());
		
	}

}

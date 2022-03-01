package com.juaracoding.main;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String week=scan.nextLine();
		
		switch(week) {
		case("Weekday"):
			System.out.println("Senin Selasa Rabu Kamis Jum'at ");
			break;
		case("Weekend"):
			System.out.println("Sabtu Minggu");
		    break;
		default:
			System.out.println("Invalid Input");
		}
		
	}

}

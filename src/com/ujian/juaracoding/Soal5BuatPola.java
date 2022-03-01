package com.ujian.juaracoding;

import java.util.Scanner;

import java.lang.Math.*;

public class Soal5BuatPola {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("");
		scan.nextInt();
		
	       int x = 5;
	       for (int i = 1; i <= x; i++){
	           for (int j = 4; j >= i; j--) {
	               System.out.print(' ');
	           }
	           for (int k = 1; k <= i; k++){
	               System.out.print('*');
	           }
	           for (int l = 1; l <= i - 1; l++){
	               System.out.print('*');
	           }
	           System.out.println();
	       }
	}

	}



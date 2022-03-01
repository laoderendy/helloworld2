package com.juaracoding.looping;

public class looping4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 
		// 1
		// 1
		// 3
		// 3
		// 3
		
		for (int i = 1; i<4 ; i++) {
			for (int j=1; j<4; j++) {
				if (i == 2) {
					continue;
				}
				System.out.println(i);
				
			}
		}
	}

}

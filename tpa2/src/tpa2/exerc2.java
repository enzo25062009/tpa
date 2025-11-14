package tpa2;

import java.util.Scanner;

public class exerc2 {
	 public static void main(String[] args) {
		 
	        Scanner in = new Scanner(System.in);
	 
	        int[] a = new int[5];
	 
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Insira os numeros");
	            a[i] = in.nextInt();
	        }
	 
	        System.out.println("Numeros da tabuada:");
	        for (int j = 0; j < 5; j++) {
	            for (int i = 1; i <= 10; i++) {
	                System.out.println(a[j] + " x " + i + " = " + (a[j] * i));
	            }
	        }
	    }
	}


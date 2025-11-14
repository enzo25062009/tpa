package tpa2;

import java.util.Scanner;

public class exerc1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(Scanner.in);
		
		int[] a = new int[20];
		int[] b = new int[20];
		
		for (int i = 0;i<20;i++ ) {
			System.out.println("insira os numeros");
			a[i] = in.nextInt();
			
		}
		for (int i= 0; i<20; i++ ) {
			if (a[i] % 2 ==0) {
				b[i] = a[i];
			}
		}
		System.out.println("pares:");
        for (int k = 0; k < 20; k++) {
            if (b[k] != 0) {
                System.out.println(b[k]);
            }
        }
 
        System.out.println("impares:");
        for (int j = 0; j < 20; j++) {
            if (a[j] % 2 != 0) {
                System.out.println(a[j]);
            }
        }
    }
}
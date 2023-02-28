package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt(); 
		int [][] mat = new int [n][n];
		
		for (int c = 0;c < n; c++)
		{
			for (int j = 0;j < n; j++)
			{
				mat[c][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal principal: ");
		for (int c = 0; c < n; c++)
		{
			System.out.println(mat[c][c] + " ");
		}
		int contador=0;
		for (int c = 0;c < n ;c++)
		{
			for(int j = 0; j < n;j++)
			{
				if (mat[c][j]<0)
				{
				contador++;
				}
			}
		}
		System.out.println("números negativos: "+contador);
		
		
		sc.close();
	}

}

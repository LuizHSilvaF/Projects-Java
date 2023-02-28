package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas: ");
		int linhas = sc.nextInt();
		System.out.println("Digite o número de colunas: ");
		int colunas = sc.nextInt();
		int[][] mat = new int [linhas][colunas];
		
		for (int c = 0; c < linhas; c++)
		{
			for (int j = 0; j < colunas; j++)
			{
				System.out.print("Digite");
				mat[c][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		
		for (int c = 0; c < linhas; c++)
		{
			for (int j = 0; j < colunas; j++)
			{
				if (mat [c][j] == x)
				{
					System.out.println("Posição "+ c + ","+ j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[c][j-1]);
					}
					if (c > 0) {
						System.out.println("Up: " + mat[c-1][j]);
					}
					if (j < mat[c].length-1) {
						System.out.println("Right: " + mat[c][j+1]);
					}
					if (c < mat.length-1) {
						System.out.println("Down: " + mat[c+1][j]);
					}
				}
			}
		}
		
		sc.close();

	}

}

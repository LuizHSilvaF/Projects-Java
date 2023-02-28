package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho da pasta:");
		String strPath = sc.nextLine(); 
		
		File path = new File(strPath);
		
		File[] pastas = path.listFiles(File::isDirectory);
		System.out.println("Pastas:");
		
		for (File pasta : pastas)
		{
			System.out.println(pasta);
		}
		
		File[] arquivos = path.listFiles(File::isFile);
		System.out.println("Arquivos:");
		
		for (File arquivo : arquivos)
		{
			System.out.println(arquivo);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Pasta criada: "+success);
		
		sc.close();
	}

}

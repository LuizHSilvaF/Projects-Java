package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo: ");
		String strPath = sc.next();
		
		File path = new File(strPath);
		
		System.out.println("Nome do arquivo: "+path.getName());
		System.out.println("Só o caminho: "+path.getParent());
		System.out.println("Pegat todo o caminho com nome: "+path.getAbsolutePath());
		
		sc.close();
	}

}

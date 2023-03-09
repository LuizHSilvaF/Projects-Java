package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double n1, n2, media;
        do
        {
            System.out.println("Digite a nota 1: ");
            n1 = sc.nextInt();
            if (n1<0)
            {
            	System.out.println("Digite um número maior que 0.");
            }
            else if(n1>10)
            {
            	System.out.println("Digite um número menor que 10.");
            }
        }while(n1 > 10 || n1 < 0);
        do
        {
            System.out.println("Digite a nota 2: ");
            n2 = sc.nextInt();
            if (n2<0)
            {
            	System.out.println("Digite um número maior que 0.");
            }
            else if(n2>10)
            {
            	System.out.println("Digite um número menor que 10.");
            }
            media = (n1 + n2)/2;
        }while(n2 > 10 || n2 < 0 );
        System.out.println("Média: "+ media);
        sc.close();

	}

}

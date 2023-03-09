package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Students> set = new HashSet<>();
		
		System.out.println("How many students for course A?");
		int num = sc.nextInt();
		for(int c =1; c <= num; c++) {
			System.out.print("Student " +c+ ": ");
			int id = sc.nextInt();
			set.add(new Students(id));
		}

		System.out.println("How many students for course B?");
		num = sc.nextInt();
		for(int c =1; c <= num; c++) {
			System.out.print("Student " +c+ ": ");
			int id = sc.nextInt();
			set.add(new Students(id));
		}
		
		System.out.println("How many students for course C?");
		num = sc.nextInt();
		for(int c =1; c <= num; c++) {
			System.out.print("Student " +c+ ": ");
			int id = sc.nextInt();
			set.add(new Students(id));
		}
		
		System.out.println("Total students: "+set.size());
	}

}

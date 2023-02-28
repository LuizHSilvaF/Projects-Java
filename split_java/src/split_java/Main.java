package split_java;

public class Main {

	public static void main(String[] args) {

		String s = "Potato Lemon Apple";
		
		String [] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}

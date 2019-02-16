import java.util.*;
public class HomeWork1{
	public static void main(String[] args){
		//read a string from the standard input, and print it on the standard output
		String input;
		Scanner scan = new Scanner(System.in);		
		System.out.println("Please enter a word:");
		input=scan.nextLine();
		System.out.println(input);		
		System.out.println();
		//read two numbers from stdin, and print their sum
		int a,b,sum;
		System.out.println("Enter a number");
		a=scan.nextInt();
		System.out.println("Enter a number");
		b=scan.nextInt();
		sum = a+b;
		System.out.println("The Total is:"+sum);	    		
			
		scan.close();
	
	}
}
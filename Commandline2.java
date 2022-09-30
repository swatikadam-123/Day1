package javahello;
import java.util.Scanner;
public class Commandline2 {
  
	public static void main(String[] args) {
		System.out.println("enter a String:");
		var Scanner =new Scanner(System.in);
		String inputstring=Scanner.nextLine();
		System.out.println("String read from console is:\n"+inputstring);
	}

}

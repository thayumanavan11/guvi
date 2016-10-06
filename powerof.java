import java.io.*;
import java.util.Scanner;
public class Power
{
		public static void main(String[] atm) 
		{
		  Scanner sc=new Scanner(System.in);
		  int number=sc.nextInt();
		  int power=sc.nextInt();
		  System.out.println(Math.pow(number,power));
		  sc.close();
	  }
}

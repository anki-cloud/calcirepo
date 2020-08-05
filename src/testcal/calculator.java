package testcal;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int n1,n2;
		int out;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first no.1: ");
		n1=s.nextInt();
		System.out.println("enter second no.2: ");
		n2=s.nextInt();
		System.out.println(" enter the  operator( + ,-) : ");
		char operator =s.next().charAt(0);
		switch(operator)
		{
		case'+' :
			out= n1+n2;
			break;
			
		case'-' :
			out=n1-n2;
			break;
			
			default:
				System.out.println("This is not a valid operator");
				return;
			
		}
		System.out.println(n1+" "+operator+" "+n2+": "+out);
	}      

}

package package1;
import java.util.*;
public class ArithmaticCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the two numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Enter the operator ");
		char op=sc.next().charAt(0);
		double result=0;

		switch(op) {
		case '+': result=n1+n2;
		          break;
		case '-': result=n1-n2;
		          break;
		case '*': result=n1*n2;
	           	  break;
		case '/':result=n1/n2;
		          break;
		}
		System.out.println("the answer is " +result);
	}
}

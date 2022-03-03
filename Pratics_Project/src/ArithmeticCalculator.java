import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args)
	{
		//	double Ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter the operator ");
		char op=sc.next().charAt(0);
		double res=0;
		switch(op){
		case '+': res=num1+num2;
		break;
		case '-': res=num1-num2;
		break;
		case '*': res=num1*num2;
		break;
		case '/': try {
			res=num1/num2;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		break;
		}
		System.out.println("the answer is " +res);
	}
}

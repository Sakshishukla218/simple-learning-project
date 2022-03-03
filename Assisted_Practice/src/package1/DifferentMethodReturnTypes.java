package package1;
public class DifferentMethodReturnTypes 
{
	public int multipynumbers(int a,int b)
	{
		int z=a*b;
		return z;
	}
	public static void main(String[] args) 
	{
		DifferentMethodReturnTypes b=new DifferentMethodReturnTypes();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
	}
}

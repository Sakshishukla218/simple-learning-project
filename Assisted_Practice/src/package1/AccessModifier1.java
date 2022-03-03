package package1;
public class AccessModifier1
{
	public void Dis1() 
	{
		AccessModifier acc = new AccessModifier();
		//System.out.println("a "+acc.a);  // private 
		System.out.println("b "+acc.b);	// default 
		System.out.println("c "+acc.c);    // protected 			
		System.out.println("d "+acc.d);	
	}
}


public class TestVariable 
{
	static int a=7;
	
void m1()
{
	int b=9;
	System.out.println(a);
	System.out.println(b);
}




public static void main(String[] args) 
{
	TestVariable t=new TestVariable();
	t.m1();
	System.out.println(a);
	//System.out.println(b);/// error bcz it is local variable
}
}

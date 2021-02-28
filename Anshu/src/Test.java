import java.util.Scanner;

public class Test 
{
	public static void main(String[] args)
	{
		Scanner sss=new Scanner(System.in);
			
	Scooty s=new Scooty();	//object creation
	System.out.println("no of wheels = "+s.noOfWheels);
	
	TV t=new TV();
	System.out.println("size of tv = "+t.size);
	
	Mobile m=new Mobile();
	m.Mno="7204662463";
	System.out.println("Mobile no "+m.Mno);
	
	AreaOfRectangle a=new AreaOfRectangle();
	
	System.out.println("Enter length");
	int length=sss.nextInt();
	System.out.println("Enter breadth");
	int breadth=sss.nextInt();
	
	a.CalculateArea(length,breadth);
	
	int x;//primitive
	float b;// primitive
	TV y;// non primitive 
	String cs;//non primitive
}
}

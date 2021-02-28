
public class Ant 
{
	int antSize;
	String color;
	
	public Ant(int a,String s)
	{
		this.antSize=a;
		this.color=s;
	}
	
	void LivingPlace(String c)
	{
		if(c.equals("red"))
		{
			System.out.println("she lives on land");
		}
		else
			System.out.println("she lives inside River");
	}
	
}

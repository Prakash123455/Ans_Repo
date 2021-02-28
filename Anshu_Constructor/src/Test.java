
public class Test {
	public static void main(String[] args) 
	{
		Ant a1=new Ant(5,"red");
		System.out.println(a1.antSize+"," +a1.color);
		a1.LivingPlace(a1.color);
		
		System.out.println("--------------------------------");
		
		Ant a2=new Ant(5,"black");
		System.out.println(a2.antSize+"," +a2.color);
		a2.LivingPlace(a2.color);
	}

}

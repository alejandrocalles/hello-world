package ch.gabriel.miniTest01;

public class Ellipse {
	
	public static void main(String[] args)
	{
		
	}
	
	static void display(String a, String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void display(String... messages)
	{
		for (int i = 0; i < messages.length; ++i)
		{
			System.out.println(messages[i]);
		}
	}
}

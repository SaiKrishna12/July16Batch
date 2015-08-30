package day7;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("QTP");
		try
		{
		   System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("selenium");

	}
}



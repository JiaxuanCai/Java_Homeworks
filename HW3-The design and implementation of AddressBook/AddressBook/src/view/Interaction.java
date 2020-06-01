package view;
import java.io.IOException;
import control.*;
public class Interaction
{
	public static void main(String[] args) throws IOException 
	{	
		System.out.println("|*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-|");
		System.out.println("|FileIn/out Address Book System|");
		System.out.println("|*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-|");
		
		System.out.println("\nStart Creating controller");
		Manipulate controller=new Manipulate();
		System.out.println("Creating controller succeeded");
		
		System.out.println("\nStart Reading data");
		controller.read();
		System.out.println("Reading data succeeded");
		
		System.out.println("\nStart Quering data");
		controller.query();
		System.out.println("Quering data succeeded");
		
		System.out.println("\nQuering finished, please see the refreshed file! ");
    }  
}

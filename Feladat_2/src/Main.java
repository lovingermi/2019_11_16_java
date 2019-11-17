
public class Main {

	public static void main(String[] args) 
	{
		try 
		{
			Haromszog h= new Haromszog(4, 6, 8);
			System.out.println("A háromszög szerkeszthető!");
		} 
		catch (NemSzerkeszthetoException e) 
		{
			System.err.println(e.getMessage());
		}

	}

}

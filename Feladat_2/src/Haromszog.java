
public class Haromszog 
{
	private double a;
	private double b;
	private double c;
	public Haromszog(double a, double b, double c)throws NemSzerkeszthetoException {
		
		if(a+b>c && a+c>b && b+c>a) 
		{
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else
		{
			throw new NemSzerkeszthetoException("Nem szerkeszthető");
		}
	}
	
}

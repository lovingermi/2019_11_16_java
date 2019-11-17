
public class Haromszog extends Sikidom
{
	float a,b,c,ma;

	public Haromszog(float a, float b, float c, float ma) throws
	NemSzerkeszthetoHaromszogException
	{
		
		super();
		if(a+b>c && a+c>b && b+c>a)
		{
			this.a = a;
			this.b = b;
			this.c = c;
			this.ma = ma;
		}
		else
		{
			throw new NemSzerkeszthetoHaromszogException("Nem szerkeszthető a háromszög!");
		}
		
	}
	protected float teruletSzamol()
	{
		return (a*ma)/2;
	}
	protected float keruletSzamol()
	{
		return a+b+c;
	}
	public void kiir()
	{
		System.out.println("A háromszög");
		super.kiir();
	}
}

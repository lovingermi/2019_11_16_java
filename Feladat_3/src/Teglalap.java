
public class Teglalap extends Negyszog
{
	
	
	public Teglalap(float a, float b)throws NemSzerkeszthetoHaromszogException
	{
		super(a,b);
		if(a>0 && b>0)
		{
			this.a=a;
			this.b=b;
		}
		else
		{
			throw new NemSzerkeszthetoHaromszogException("A téglalap oldala nem lehet 0  vagy negatív!");
		}
		
		
	}
	protected float teruletSzamol()
	{
		return a*b;
	}
	public void kiir()
	{
		System.out.println("A téglalap:");
		super.kiir();
	}
	
}

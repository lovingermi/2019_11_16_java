
public abstract class Negyszog extends Sikidom 
{
	protected float a, b;

	public Negyszog(float a, float b) 
	{
		super();
		this.a = a;
		this.b = b;
		
	}
	
	protected float keruletSzamol()
	{
		return 2*(a+b);
	}
	protected abstract float teruletSzamol();
	
	
	
}

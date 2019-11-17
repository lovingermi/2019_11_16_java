
public abstract class Sikidom 
{
	protected float ker,ter;

	/*public Sikidom(float ker, float ter) {
		
		this.ker = ker;
		this.ter = ter;
	}*/
	protected abstract float keruletSzamol();
	protected abstract float  teruletSzamol();
	protected void kiir()
	{
		System.out.println("kerület: "+keruletSzamol());
		System.out.println("terület: "+teruletSzamol());
	}
}

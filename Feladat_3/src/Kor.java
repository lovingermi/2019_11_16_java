
public class Kor extends Sikidom
{
	protected float r;

	public Kor(float r) {
		super();
		this.r = r;
	}
	public float keruletSzamol()
	{
		return 2*r*(float)Math.PI;
	}
	public float teruletSzamol()
	{
		return (float)Math.pow(r, 2)*(float)Math.PI;
	}
	public void kiir()
	{
		System.out.println("A kör");
		super.kiir();
	}
}

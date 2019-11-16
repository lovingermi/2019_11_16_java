
public class Tanulo 
{
	protected String nev;
	protected int kor;
	protected char osztaly;
	public Tanulo(String nev, int kor, char osztaly) {
		//super();
		this.nev = nev;
		this.kor = kor;
		this.osztaly = osztaly;
	}
	public char getOsztaly()
	{
		return osztaly;
	}
	public int getKor()
	{
		return kor;
	}
}

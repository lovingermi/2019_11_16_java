
public class Tanulo 
{
	protected String nev;
	protected int kor;
	protected char osztaly;
	private int evesOsztalypenz = 10000;
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
	public int szamolHaviOsztalypenz() {
        return evesOsztalypenz / 10;  
    } 
}

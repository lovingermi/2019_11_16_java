
public class Main {

	public static void main(String[] args) 
	{
		try 
		{
			Teglalap t = new Teglalap(0, 5);
			t.keruletSzamol();
			t.teruletSzamol();
			t.kiir();
			
		} catch (NemSzerkeszthetoHaromszogException e) 
		{
			System.err.println(e.getMessage());
		}
		
		
		try 
		{
			Haromszog h = new Haromszog(2,5,7,(float) 4.333);
			h.keruletSzamol();
			h.teruletSzamol();
			h.kiir();
		} 
		catch (NemSzerkeszthetoHaromszogException e) 
		{
			System.err.println(e.getMessage());
		}
		
		Kor k = new Kor(6);
		k.keruletSzamol();
		k.teruletSzamol();
		k.kiir();
		
	}

}

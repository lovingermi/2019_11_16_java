
public class VegzosTanulo extends Tanulo
{
	private double erettsegiAtlag;
	
	public VegzosTanulo(String nev, int kor,char osztaly,double eretsegAtlag)
	{
		super(nev,kor,osztaly);//gyermekosztály konstruktorából meghívhatjuk a szülőosztály konstruktorát a super kulcsszó használatával.
		this.nev=nev;
		this.kor=kor;
		this.osztaly=osztaly;
		erettsegiAtlag=eretsegAtlag;
		
	}
	public VegzosTanulo(String nev, char osztaly) { 
        super(nev, 13, osztaly);
    } 

}

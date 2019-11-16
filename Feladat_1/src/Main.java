
public class Main {

	public static void main(String[] args) 
	{
		VegzosTanulo vtan = new VegzosTanulo("Miki",45,'a',4.325);
		Tanulo tan=new Tanulo("Ircsi", 40, 'c');
		tan=vtan;
		vtan=(VegzosTanulo)tan;
		Tanulo t1= new Tanulo("Tóth B", 12, 'B');
		Tanulo t2= new Tanulo("Kovács Z", 12, 'B');
		VegzosTanulo vt1 = new VegzosTanulo("Nagy B",'B');
		
		boolean b = Iskola.egyOsztalybanJarnak(t1, t2);
		System.out.println(b);
		b=Iskola.egyOsztalybanJarnak(t1, vt1);
		System.out.println(b);
	}

}

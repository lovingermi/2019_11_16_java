
public class Iskola 
{
	static boolean egyOsztalybanJarnak(Tanulo tan1,Tanulo tan2)
	{
		return(tan1.getKor()==tan2.getKor()&&
				tan1.getOsztaly()==tan2.getOsztaly());
	}
}

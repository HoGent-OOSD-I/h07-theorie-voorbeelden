package cui;

import domein.Duif;
import domein.Hond;
import domein.Huisdier;
import domein.Kat;

public class HuisdierApplicatieMet3Subklasses 
{
	public static void main()
	{
		HuisdierApplicatieMet3Subklasses app = new HuisdierApplicatieMet3Subklasses();
		app.doeIetsMetHuisdieren();
	}	
		
	private void doeIetsMetHuisdieren()
	{
		Huisdier hd = new Huisdier("Nijntje");
		Kat k = new Kat("Musti");
		Hond h = new Hond("Rintje");
		Duif d = new Duif("Wittekop", 20201234567L); // <.>
		
		IO.println("Dit zijn de huisdieren:");
		IO.println(hd);
		IO.println(k);
		IO.println(h);
		IO.println(d); 	// <.>
		IO.println();
	}
}

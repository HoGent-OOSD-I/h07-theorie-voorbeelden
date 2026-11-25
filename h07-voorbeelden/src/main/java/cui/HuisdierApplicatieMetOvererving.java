package cui;

import domein.Hond;
import domein.Huisdier;
import domein.Kat;

public class HuisdierApplicatieMetOvererving 
{
	public static void main()
	{
		HuisdierApplicatieMetOvererving app = new HuisdierApplicatieMetOvererving();
		app.doeIetsMetHuisdieren();
	}
		
	private void doeIetsMetHuisdieren()
	{
		// <.>
		Huisdier hd = new Huisdier("Nijntje");
		Kat k = new Kat("Musti");
		Hond h = new Hond("Rintje");

		// <.>
		IO.println("Dit zijn de huisdieren:");
		IO.println(hd);
		IO.println(k);
		IO.println(h);
		IO.println();
		
		// <.>
		IO.println("Ze kunnen ook allemaal een soort van geluid maken...");
		IO.println(String.format("%s maakt geluid %s", hd.getNaam(), hd.maakGeluid()));
		IO.println(String.format("%s maakt geluid %s", k.getNaam(), k.maakGeluid()));
		IO.println(String.format("%s maakt geluid %s", h.getNaam(), h.maakGeluid()));
		IO.println();
		
		// <.>
		IO.println("En de kat en de hond kunnen tenslotte nog iets bijzonders:");
		IO.println(String.format("Het bijzondere wat een %s kan, is %s", k.getClass().getSimpleName(), k.spin()));
		IO.println(String.format("Het bijzondere wat een %s kan, is %s", h.getClass().getSimpleName(), h.kwispel()));
	}
}

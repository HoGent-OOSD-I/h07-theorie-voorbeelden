package cui;

import domein.DomeinController;

public class HuisdierApplicatieMetPolymorfisme 
{
	public static void main()
	{
		HuisdierApplicatieMetPolymorfisme app = new HuisdierApplicatieMetPolymorfisme();
		app.doeIetsMetHuisdieren();
	}
	
	private void doeIetsMetHuisdieren()
	{
		// <.>
		DomeinController dc = new DomeinController();
		
		// <.>
		dc.initialiseerDierenWinkel();
		
		// <.>
		String[] overzicht = dc.stelDierenVoor();
		for (String eenDier : overzicht)
			IO.println(eenDier);
		IO.println();
		
		// <.>
		IO.println(dc.geefSpuitjes());
	}
}

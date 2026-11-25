package cui;

import domein.Rekening;
import domein.ZichtRekening;

public class OverridingSetter {

	public static void main()
	{
		OverridingSetter app = new OverridingSetter();
		app.doeIetsMetRekening();
	}
	
	private void doeIetsMetRekening()
	{
		Rekening rek1 = new Rekening();
		IO.println(rek1);

		ZichtRekening rek2 = new ZichtRekening(123456789911L,0,"Jan",0);
		IO.println(rek2);
		
		ZichtRekening rek3 = new ZichtRekening(123123456784L,-1000,"An",-1000);
		IO.println(rek3);

	}

}

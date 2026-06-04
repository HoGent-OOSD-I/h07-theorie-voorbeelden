package cui;

import domein.Rekening;
import domein.ZichtRekening;

public class OverridingSetter {

	public static void main(String[] args) 
	{
		OverridingSetter app = new OverridingSetter();
		app.doeIetsMetRekening();
	}
	
	private void doeIetsMetRekening()
	{
		//tag::vb[]
		Rekening rek1 = new Rekening();
		System.out.println(rek1);

		ZichtRekening rek2 = new ZichtRekening(123456789911L,0,"Jan",0);
		System.out.println(rek2);
		
		ZichtRekening rek3 = new ZichtRekening(123123456784L,-1000,"An",-1000);
		System.out.println(rek3);
		//end::vb[]

	}

}

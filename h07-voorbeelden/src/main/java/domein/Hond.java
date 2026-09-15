package domein;

public class Hond extends Huisdier{
	public Hond(String naam){
		super(naam);
	}

	@Override 
	public String maakGeluid() // deze methode bestaat al in de superklasse, maar krijgt hier een nieuwe definitie (specialisatie) 
	{
		return String.format("waf waf%s", super.maakGeluid());
	}
	
	public String kwispel() // deze methode is nieuw tov de superklasse (uitbreiding)
	{
		return "kwispel-kwispel-kwispel";
	}
}

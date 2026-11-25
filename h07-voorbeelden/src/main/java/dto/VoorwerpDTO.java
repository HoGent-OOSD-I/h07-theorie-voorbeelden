package dto;

public record VoorwerpDTO(String naam, double gewicht, int niveau, int kracht, boolean gebruikt, int deur, int aantalInOmloop, char soort)
{
	public VoorwerpDTO(String naam, double gewicht, int niveau, int kracht, boolean gebruikt)
	{
		this(naam, gewicht, niveau, kracht, gebruikt, 0, 0, 'W');
	}
	
	public VoorwerpDTO(String naam, double gewicht, int niveau, int deur, int aantalInOmloop)
	{
		this(naam, gewicht, niveau, 0, false, deur, aantalInOmloop, 'S');
	}
}
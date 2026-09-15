package domein;

import java.util.ArrayList;
import java.util.List;

public class DierenWinkel 
{
	private List<Huisdier> lijstHuisdieren;
	
	public DierenWinkel()
	{
		lijstHuisdieren = new ArrayList<>();
	}
	
	public String[] stelDierenVoor()
	{
		String[] voorstelling = new String[lijstHuisdieren.size()];
		int index = 0;
		for (Huisdier dier : lijstHuisdieren)
		{
			voorstelling[index] = String.format("%s zegt %s", dier.toString(), dier.maakGeluid());
			index++;
		}
		return voorstelling;
	}
	
	public String geefSpuitje(Huisdier dier){
		return String.format("Awwwwww... dat doet pijn! %s", dier.maakGeluid());
	}
	
	public void voegHuisdierToe (Huisdier dier)
	{
		if (dier != null)
			lijstHuisdieren.add(dier);
	}

	public Huisdier geefDierOpIndex(int index) 
	{
		return lijstHuisdieren.get(index);
	}
	
	public int geefAantalDieren() 
	{
		return lijstHuisdieren.size();
	}
}
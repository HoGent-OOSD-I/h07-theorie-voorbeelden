package domein;
public class ZichtRekening extends Rekening
{
	private double maxKredietOnderNul;
	
	public ZichtRekening(long rekeningNr, double saldo,String houder, double maxKredietOnderNul){
		super(rekeningNr, saldo, houder);
		setMaxKredietOnderNul(maxKredietOnderNul);
	}
	
	public final void setSaldo(double saldo) { // <.>
		if(saldo >= maxKredietOnderNul) // <.>
			super.setSaldo(saldo);
		else 
			throw new IllegalArgumentException(
					String.format("Saldo mag niet onder maxKredietOnderNul (= %.1f)",maxKredietOnderNul)); 		
	}
	public double getMaxKredietOnderNul()
	{
		return maxKredietOnderNul;
	}

	public final void setMaxKredietOnderNul(double maxKredietOnderNul)
	{
		if (maxKredietOnderNul > 0 || maxKredietOnderNul > getSaldo())
			throw new IllegalArgumentException("Maxkrediet moet negatief zijn en "
					+ "lager liggen dan of gelijk zijn aan ons huidig saldo!");
		this.maxKredietOnderNul = maxKredietOnderNul;
	}

	@Override
	public boolean haalAf(double bedrag)
	{
		if (getSaldo() - bedrag >= maxKredietOnderNul)
			return super.haalAf(bedrag); // kan alleen nog mislukken omdat bedrag <= 0 is
		// else - bedrag te hoog!
		return false;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s. Max krediet onder nul = %.2f", 
				super.toString(), maxKredietOnderNul);
	}

}

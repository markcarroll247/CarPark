
public class ProteinBar {
	private String flavour;
	private double priceInEuro;
	private int gramsOfSugar;
	private int gramsOfProtein;
	
	public ProteinBar(String flavour, double priceInEuro, int gramsOfSugar, int gramsOfProtein) {
		super();
		this.flavour = flavour;
		this.priceInEuro = priceInEuro;
		this.gramsOfSugar = gramsOfSugar;
		this.gramsOfProtein = gramsOfProtein;
	}

	public String getFlavour() {
		return flavour;
	}

	

	public double getPriceInEuro() {
		return priceInEuro;
	}


	public int getGramsOfSugar() {
		return gramsOfSugar;
	}


	public int getGramsOfProtein() {
		return gramsOfProtein;
	}


}

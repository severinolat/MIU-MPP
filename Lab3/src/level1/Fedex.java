package level1;



public class Fedex implements Carrier{
	
	private Zone zone;
	private double weight;
	private String name;
	
	


	public Fedex(Zone zone, double weight, String name) {
		super();
		this.zone = zone;
		this.weight = weight;
		this.name = name;
	}


	@Override
	public double getRate() {
		
		return zone.getPrice() * weight;
		
	}

}

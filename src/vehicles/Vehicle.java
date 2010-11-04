package vehicles;

import vehicles.enums.*;

public abstract class Vehicle {

	protected int priceForSale;
	protected int purchasePrice;
	
	protected Brand brand = null;
	protected Model model = null;
	protected EngineModel engine = null;
	protected Color color = null;
	protected Boolean sold = false;
	

	public Vehicle(VehicleDetail vehicleDetails) {
		this.engine = vehicleDetails.engine;
		this.color = vehicleDetails.color;
		this.model = vehicleDetails.model;
		this.priceForSale =(int) (vehicleDetails.purchasePrice * 1.2);
		this.purchasePrice = vehicleDetails.purchasePrice;
	}

	
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public EngineModel getEngine() {
		return engine;
	}

	public void setEngine(EngineModel engine) {
		this.engine = engine;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Boolean getSold() {
		return sold;
	}

	protected void setSold(Boolean sold) {
		this.sold = sold;
	}
	
	public void sell()
	{
		setSold(true);
	}
	
	
	
	public int getPriceForSale() {
		return priceForSale;
	}


	public void setPriceForSale(int priceForSale) {
		this.priceForSale = priceForSale;
	}


	public int getPurchasePrice() {
		return purchasePrice;
	}


	public abstract void checkOil();
	public abstract void wash();
	public abstract void polish();


	@Override
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Cena: ");
		sb.append(priceForSale);
		sb.append(" zł \n");
		
		sb.append(brand + " " + model + " " + engine);
		sb.append('\n');
		sb.append("Kolor: " + color);
		
		
		return sb.toString();
	}
	
	
}

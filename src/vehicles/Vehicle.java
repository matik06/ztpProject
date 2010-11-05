package vehicles;

import java.util.ArrayList;

import db.VehicleMapper;
import vehicles.enums.*;

public abstract class Vehicle {

	protected int id = -1;	
	
	protected int priceForSale;
	protected int purchasePrice;
	
	protected Brand brand = null;
	protected Model model = null;
	protected EngineModel engine = null;
	protected Color color = null;
	protected Boolean sold = false;
	
	protected static VehicleMapper vm = null;
	

	public Vehicle(VehicleDetail vehicleDetails) {
		this.engine = vehicleDetails.engine;
		this.color = vehicleDetails.color;
		this.model = vehicleDetails.model;
		this.priceForSale =(int) (vehicleDetails.purchasePrice * 1.2);
		this.purchasePrice = vehicleDetails.purchasePrice;
		this.id = vehicleDetails.id;
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
	
	
	protected static VehicleMapper getVehicleMapper() {
		
		if (vm == null) {
			vm = new VehicleMapper();
		}
		return vm;
	}
	
	public static Vehicle getVehicleById(int id) {
		
		return getVehicleMapper().getSingle(id);
	}
	
	public static ArrayList<Vehicle> getAll() {
		
		return getVehicleMapper().getAll();
	}
	
	public static void deleteVehicleById(int id) {
		
		getVehicleMapper().delete(id);
	}
	
	public static void addVehicle(Vehicle v)
	{
		getVehicleMapper().addNew(v);
	}


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

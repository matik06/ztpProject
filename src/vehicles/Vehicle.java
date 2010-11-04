package vehicles;

import vehicles.enums.*;

public abstract class Vehicle {

	public Brand brand = null;
	public Model model = null;
	private EngineModel engine = null;
	private Color color = null;
	public Boolean sold = false;
	

	public Vehicle(VehicleDetail vehicleDetails) {
		this.engine = vehicleDetails.engine;
		this.color = vehicleDetails.color;
		this.model = vehicleDetails.model;
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

	public void setSold(Boolean sold) {
		this.sold = sold;
	}
	
	public abstract void checkOil();
	public abstract void wash();
	public abstract void polish();
	
	
}

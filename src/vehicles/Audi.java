package vehicles;

import vehicles.enums.Brand;

public abstract class Audi extends Car {

	public Audi(VehicleDetail vehicleDetails) {
		
		super(vehicleDetails);
		this.brand = Brand.AUDI;
	}
	

}

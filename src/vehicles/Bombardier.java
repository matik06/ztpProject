package vehicles;

import vehicles.enums.Brand;

public abstract class Bombardier extends Quad {

	public Bombardier(VehicleDetail vehicleDetails) {
		
		super(vehicleDetails);
		this.brand = Brand.BOMBARDIER;
	}

}

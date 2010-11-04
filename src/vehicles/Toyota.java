package vehicles;

import vehicles.enums.Brand;

public class Toyota extends Car {

	public Toyota(VehicleDetail vehicleDetails) {
		
		super(vehicleDetails);
		this.brand = Brand.TOYOTA;
	}

}

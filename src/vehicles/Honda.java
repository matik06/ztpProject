package vehicles;

import vehicles.enums.Brand;

public abstract class Honda extends Motorbike {

	public Honda(VehicleDetail vehicleDetails) {
		
		super(vehicleDetails);
		this.brand = Brand.HONDA;
	}

}

package vehicles;

import vehicles.enums.Brand;

public abstract class Seat extends Car {

	public Seat(VehicleDetail vehicleDetails) {
		
		super(vehicleDetails);
		this.brand = Brand.SEAT;
	}

}

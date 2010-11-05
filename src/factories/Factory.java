package factories;

import vehicles.Vehicle;
import vehicles.VehicleDetail;
import vehicles.enums.Brand;

public class Factory {
	
	public static Vehicle createVehicle(VehicleDetail vehicleDetails) {
		
		if (vehicleDetails.brand == Brand.AUDI) {
			return new AudiFactory().createVehicle(vehicleDetails);
		}
		else if (vehicleDetails.brand == Brand.HONDA) {
			return new HondaFactory().createVehicle(vehicleDetails);
		}
		else if (vehicleDetails.brand == Brand.SEAT) {
			return new SeatFactory().createVehicle(vehicleDetails);
		}
		else if (vehicleDetails.brand == Brand.TOYOTA) {
			return new ToyotaFactory().createVehicle(vehicleDetails);
		}
		else if (vehicleDetails.brand == Brand.BOMBARDIER) {
			return new BombardierFactory().createVehicle(vehicleDetails);
		}
		else {
		return null;
		}
	}
	
	public static Vehicle prepareVehicle(VehicleDetail vehicleDetails) {
		
		if (vehicleDetails.brand == Brand.AUDI) {
			return new AudiFactory().prepareVehicle(vehicleDetails);
		}
		else if (vehicleDetails.brand == Brand.HONDA) {
			return new HondaFactory().prepareVehicle(vehicleDetails);
		}
		else if (vehicleDetails.brand == Brand.SEAT) {
			return new SeatFactory().prepareVehicle(vehicleDetails);
		}
		else if (vehicleDetails.brand == Brand.TOYOTA) {
			return new ToyotaFactory().createVehicle(vehicleDetails);
		}
		else if (vehicleDetails.brand == Brand.BOMBARDIER) {
			return new BombardierFactory().prepareVehicle(vehicleDetails);
		}
		else {
		return null;
		}
	}

}

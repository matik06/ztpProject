package factories;

import vehicles.enums.*;

import vehicles.SeatCordoba;
import vehicles.SeatLeon;
import vehicles.SeatToledo;
import vehicles.Vehicle;
import vehicles.VehicleDetail;

public class SeatFactory extends CarFactory {

	@Override
	public Vehicle createVehicle(VehicleDetail vehicleDetails) {
		
		if (vehicleDetails.model == Model.TOLEDO) {
		return new SeatToledo(vehicleDetails);
		} 
		else if (vehicleDetails.model == Model.LEON) {
			return new SeatLeon(vehicleDetails);
		}
		else if (vehicleDetails.model == Model.CORDOBA) {
			return new SeatCordoba(vehicleDetails);
		}
		else {
			return null;
		}
	}
}

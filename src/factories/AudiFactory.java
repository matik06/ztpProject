package factories;

import vehicles.enums.*;

import vehicles.AudiA3;
import vehicles.AudiA4;
import vehicles.AudiA6;
import vehicles.Vehicle;
import vehicles.VehicleDetail;


public class AudiFactory extends CarFactory {

	@Override
	public Vehicle createVehicle(VehicleDetail vehicleDetails) {
		
		if (vehicleDetails.model == Model.A3) {
		return new AudiA3(vehicleDetails);
		} 
		else if (vehicleDetails.model == Model.A4) {
			return new AudiA4(vehicleDetails);
		}
		else if (vehicleDetails.model == Model.A6) {
			return new AudiA6(vehicleDetails);
		}
		else {
			return null;
		}
	}
}

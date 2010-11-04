package factories;

import vehicles.HondaCBR600;
import vehicles.HondaCBR900;
import vehicles.Vehicle;
import vehicles.VehicleDetail;
import vehicles.enums.Model;

public class HondaFactory extends MotorbikeFactory {

	@Override
	public Vehicle createVehicle(VehicleDetail vehicleDetails) {

		if (vehicleDetails.model == Model.CBR600) {
			return new HondaCBR600(vehicleDetails);
		} 
		else if (vehicleDetails.model == Model.CBR900) {
			return new HondaCBR900(vehicleDetails);
		}
		else {
			return null;
		}
	}
}

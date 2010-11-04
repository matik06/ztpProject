package factories;

import vehicles.enums.*;

import vehicles.ToyotaAvensis;
import vehicles.ToyotaCorolla;
import vehicles.ToyotaYaris;
import vehicles.Vehicle;
import vehicles.VehicleDetail;

public class ToyotaFactory extends CarFactory {
	
	@Override
	public Vehicle createVehicle(VehicleDetail vehicleDetails) {
		
		if (vehicleDetails.model == Model.AVENSIS) {
		return new ToyotaAvensis(vehicleDetails);
		} 
		else if (vehicleDetails.model == Model.COROLLA) {
			return new ToyotaCorolla(vehicleDetails);
		}
		else if (vehicleDetails.model == Model.YARIS) {
			return new ToyotaYaris(vehicleDetails);
		}
		else {
			return null;
		}
	}

}

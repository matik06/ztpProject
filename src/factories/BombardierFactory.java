package factories;

import vehicles.BombardierOutlander500;
import vehicles.Vehicle;
import vehicles.VehicleDetail;
import vehicles.enums.Model;

public class BombardierFactory extends QuadFactory {

	@Override
	public Vehicle createVehicle(VehicleDetail vehicleDetails) {
		
		if (vehicleDetails.model == Model.OUTLANDER500) {
			return new BombardierOutlander500(vehicleDetails);
		} 
		else {
			return null;
		}
	}

}

package factories;

import vehicles.Vehicle;
import vehicles.VehicleDetail;

public abstract class MotorbikeFactory implements VehicleFactory {

	@Override
	public Vehicle prepareVehicle(VehicleDetail vehicleDetails) {
		
		Vehicle vehicle = createVehicle(vehicleDetails);
		
		vehicle.checkOil();
		vehicle.wash();
		vehicle.polish();
		
		return vehicle;	
	}

}

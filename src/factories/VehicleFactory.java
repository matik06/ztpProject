package factories;

import vehicles.Vehicle;
import vehicles.VehicleDetail;

public interface VehicleFactory {
	Vehicle createVehicle(VehicleDetail vehicleDetails);
	Vehicle prepareVehicle(VehicleDetail vehicleDetails);
}

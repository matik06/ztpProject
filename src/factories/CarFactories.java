package factories;

import vehicles.*;
import vehicles.enums.Model;;

 public class CarFactories {
	 
	public static Vehicle createVehicle(VehicleDetail vehicleDetails)
	{
    	 if (vehicleDetails.model == Model.A3) {
    		 return new AudiA3(vehicleDetails);
		 }
		 else if (vehicleDetails.model == Model.A4) {
			 return new AudiA4(vehicleDetails);
		 }
		 else if (vehicleDetails.model == Model.A6) {
			 return new AudiA6(vehicleDetails);
		 }
    	 //reszta samochodów, motocykli i quadów...
		 else {
			 return null;
		 }	
	 }
	 
	public Vehicle prepare(VehicleDetail vehicleDetails) {
		
		Vehicle vehicle = createVehicle(vehicleDetails);
		
		vehicle.checkOil();
		vehicle.wash();
		vehicle.polish();
		
		return vehicle;
	}

}

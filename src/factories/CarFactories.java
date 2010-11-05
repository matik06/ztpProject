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
		 else if (vehicleDetails.model == Model.TOLEDO) {
			 return new SeatToledo(vehicleDetails);
		 }
		 else if (vehicleDetails.model == Model.CORDOBA) {
			 return new SeatCordoba(vehicleDetails);
		 }
		 else if (vehicleDetails.model == Model.LEON) {
			 return new SeatLeon(vehicleDetails);
		 }
		 else if (vehicleDetails.model == Model.YARIS) {
			 return new ToyotaYaris(vehicleDetails);
		 }
		 else if (vehicleDetails.model == Model.AVENSIS) {
			 return new ToyotaAvensis(vehicleDetails);
		 }
		 else if (vehicleDetails.model == Model.COROLLA) {
			 return new ToyotaCorolla(vehicleDetails);
		 }
		 else if (vehicleDetails.model == Model.CBR600) {
			 return new HondaCBR600(vehicleDetails);
		 }
		 else if (vehicleDetails.model == Model.CBR900) {
			 return new HondaCBR900(vehicleDetails);
		 }
		 else if (vehicleDetails.model == Model.OUTLANDER500) {
			 return new BombardierOutlander500(vehicleDetails);
		 }
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

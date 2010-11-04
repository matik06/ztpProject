package factories;

import vehicles.enums.*;

import vehicles.Car;
import vehicles.SeatCordoba;
import vehicles.SeatLeon;
import vehicles.SeatToledo;

public class SeatFactory extends CarFactory {

	@Override
	public Car createCar(Model model,EngineModel engine, Color color,BodyType bType, int nrOfDoors) {
		
		if (model == Model.TOLEDO) {
			return new SeatToledo(engine,color,bType,nrOfDoors);
		} 
		else if (model == Model.LEON) {
			return new SeatLeon(engine,color,bType,nrOfDoors);
		}
		else if (model == Model.CORDOBA) {
			return new SeatCordoba(engine,color,bType,nrOfDoors);
		}
		else {
			return null;
		}
	}

}

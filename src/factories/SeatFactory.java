package factories;

import vehicles.enums.*;

import vehicles.Car;
import vehicles.SeatCordoba;
import vehicles.SeatLeon;
import vehicles.SeatToledo;

public class SeatFactory extends CarFactory {

	@Override
	public Car createCar(CarModels model,EngineModels engine, Colors color,BodyType bType, int nrOfDoors) {
		
		if (model == CarModels.TOLEDO) {
			return new SeatToledo(engine,color,bType,nrOfDoors);
		} 
		else if (model == CarModels.LEON) {
			return new SeatLeon(engine,color,bType,nrOfDoors);
		}
		else if (model == CarModels.CORDOBA) {
			return new SeatCordoba(engine,color,bType,nrOfDoors);
		}
		else {
			return null;
		}
	}

}

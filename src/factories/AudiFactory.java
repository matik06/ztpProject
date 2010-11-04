package factories;

import vehicles.enums.*;

import vehicles.AudiA3;
import vehicles.AudiA4;
import vehicles.AudiA6;
import vehicles.Car;


public class AudiFactory extends CarFactory {

	@Override
	public Car createCar(CarModels model ,EngineModels engine, Colors color,BodyType bType, int nrOfDoors ) {
		
		if (model == CarModels.A3) {
			return new AudiA3(engine,color,bType,nrOfDoors);
		} 
		else if (model == CarModels.A4) {
			return new AudiA4(engine,color,bType,nrOfDoors);
		}
		else if (model == CarModels.A6) {
			return new AudiA6(engine,color,bType,nrOfDoors);
		}
		else {
			return null;
		}
			
	}

}

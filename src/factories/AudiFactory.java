package factories;

import vehicles.enums.*;

import vehicles.AudiA3;
import vehicles.AudiA4;
import vehicles.AudiA6;
import vehicles.Car;


public class AudiFactory extends CarFactory {

	@Override
	public Car createCar(Model model ,EngineModel engine, Color color,BodyType bType, int nrOfDoors ) {
		
		if (model == Model.A3) {
			return new AudiA3(engine,color,bType,nrOfDoors);
		} 
		else if (model == Model.A4) {
			return new AudiA4(engine,color,bType,nrOfDoors);
		}
		else if (model == Model.A6) {
			return new AudiA6(engine,color,bType,nrOfDoors);
		}
		else {
			return null;
		}
			
	}

}

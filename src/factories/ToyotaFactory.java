package factories;

import vehicles.enums.*;

import vehicles.Car;
import vehicles.ToyotaAvensis;
import vehicles.ToyotaCorolla;
import vehicles.ToyotaYaris;

public class ToyotaFactory extends CarFactory {
	
	@Override
	public Car createCar(Model model,EngineModel engine, Color color,BodyType bType, int nrOfDoors) {
		
		if (model == Model.AVENSIS) {
			return new ToyotaAvensis(engine,color,bType,nrOfDoors);
		} 
		else if (model == Model.COROLLA) {
			return new ToyotaCorolla(engine,color,bType,nrOfDoors);
		}
		else if (model == Model.YARIS) {
			return new ToyotaYaris(engine,color,bType,nrOfDoors);
		}
		else {
			return null;
		}
	}

}

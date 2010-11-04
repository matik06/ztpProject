package factories;

import vehicles.enums.*;

import vehicles.Car;
import vehicles.ToyotaAvensis;
import vehicles.ToyotaCorolla;
import vehicles.ToyotaYaris;

public class ToyotaFactory extends CarFactory {
	
	@Override
	public Car createCar(CarModels model,EngineModels engine, Colors color,BodyType bType, int nrOfDoors) {
		
		if (model == CarModels.AVENSIS) {
			return new ToyotaAvensis(engine,color,bType,nrOfDoors);
		} 
		else if (model == CarModels.COROLLA) {
			return new ToyotaCorolla(engine,color,bType,nrOfDoors);
		}
		else if (model == CarModels.YARIS) {
			return new ToyotaYaris(engine,color,bType,nrOfDoors);
		}
		else {
			return null;
		}
	}

}

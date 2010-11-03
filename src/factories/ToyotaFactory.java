package factories;

import vehicles.Car;
import vehicles.CarModels;
import vehicles.ToyotaAvensis;
import vehicles.ToyotaCorolla;
import vehicles.ToyotaYaris;

public class ToyotaFactory extends CarFactory {
	
	@Override
	public Car buyCar(CarModels model) {
		
		if (model == CarModels.AVENSIS) {
			return new ToyotaAvensis();
		} 
		else if (model == CarModels.COROLLA) {
			return new ToyotaCorolla();
		}
		else if (model == CarModels.YARIS) {
			return new ToyotaYaris();
		}
		else {
			return null;
		}
	}

}

package factories;

import vehicles.AudiA3;
import vehicles.AudiA4;
import vehicles.AudiA6;
import vehicles.Car;
import vehicles.CarModels;

public class AudiFactory extends CarFactory {

	@Override
	public Car buyCar(CarModels model) {
		
		if (model == CarModels.A3) {
			return new AudiA3();
		} 
		else if (model == CarModels.A4) {
			return new AudiA4();
		}
		else if (model == CarModels.A6) {
			return new AudiA6();
		}
		else {
			return null;
		}
			
	}

}

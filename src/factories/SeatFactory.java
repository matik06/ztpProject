package factories;

import vehicles.Car;
import vehicles.CarModels;
import vehicles.SeatCordoba;
import vehicles.SeatLeon;
import vehicles.SeatToledo;

public class SeatFactory extends CarFactory {

	@Override
	public Car buyCar(CarModels model) {
		
		if (model == CarModels.TOLEDO) {
			return new SeatToledo();
		} 
		else if (model == CarModels.LEON) {
			return new SeatLeon();
		}
		else if (model == CarModels.CORDOBA) {
			return new SeatCordoba();
		}
		else {
			return null;
		}
	}

}

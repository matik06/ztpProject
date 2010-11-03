package factories;

import vehicles.Car;
import vehicles.CarModels;

public abstract class CarFactory {
	
	public abstract Car buyCar(CarModels model);
	
	public Car prepare(CarModels model) {
	
		Car car = buyCar(model);
		
		car.checkOil();
		car.wash();
		car.polish();
		
		return car;
	}
}

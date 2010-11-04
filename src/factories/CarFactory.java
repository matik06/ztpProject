package factories;

import vehicles.enums.*;
import vehicles.Car;


public abstract class CarFactory {
	
	public abstract Car createCar(CarModels model,EngineModels engine, Colors color,BodyType bType, int nrOfDoors);
	
	public Car prepare(CarModels model,EngineModels engine, Colors color,BodyType bType, int nrOfDoors) {
	
		Car car = createCar(model,engine,color,bType,nrOfDoors);
		
		car.checkOil();
		car.wash();
		car.polish();
		
		return car;
	}
}

package factories;

import vehicles.enums.*;
import vehicles.Car;


public abstract class CarFactory {
	
	public abstract Car createCar(Model model,EngineModel engine, Color color,BodyType bType, int nrOfDoors);
	
	public Car prepare(Model model,EngineModel engine, Color color,BodyType bType, int nrOfDoors) {
	
		Car car = createCar(model,engine,color,bType,nrOfDoors);
		
		car.checkOil();
		car.wash();
		car.polish();
		
		return car;
	}
}

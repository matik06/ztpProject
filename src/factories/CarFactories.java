package factories;

import vehicles.*;
import vehicles.enums.Model;;

 public class CarFactories {
	 
//	public static Car buyCar(CarModels model)
//	{
//		if (model == CarModels.A3) {
//			return new AudiA3();
//		} 
//		else if (model == CarModels.A4) {
//			return new AudiA4();
//		}
//		else if (model == CarModels.A6) {
//			return new AudiA6();
//		}
//		else if (model == CarModels.TOLEDO) {
//			return new SeatToledo();
//		} 
//		else if (model == CarModels.LEON) {
//			return new SeatLeon();
//		}
//		else if (model == CarModels.CORDOBA) {
//			return new SeatCordoba();
//		}
//		if (model == CarModels.AVENSIS) {
//			return new ToyotaAvensis();
//		} 
//		else if (model == CarModels.COROLLA) {
//			return new ToyotaCorolla();
//		}
//		else if (model == CarModels.YARIS) {
//			return new ToyotaYaris();
//		}
//		else {
//			return null;
//		}
//	 
//		
//	}
	 
	public Car prepare(Model model) {
		
		Car car = null;//buyCar(model);
		
		car.checkOil();
		car.wash();
		car.polish();
		
		return car;
	}

}

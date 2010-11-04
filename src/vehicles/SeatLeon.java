package vehicles;

import vehicles.enums.*;

public class SeatLeon extends Car {
	public SeatLeon(EngineModels engine, Colors color,BodyType bType, int nrOfDoors)
	{
		super(engine,color,bType,nrOfDoors);
		brand  = "Seat";
		model = "Leon";
	}

}

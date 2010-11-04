package vehicles;

import vehicles.enums.*;

public class SeatToledo extends Car{
	public SeatToledo(EngineModels engine, Colors color,BodyType bType, int nrOfDoors)
	{
		super(engine,color,bType,nrOfDoors);
		brand  = "Seat";
		model = "Toledo";
	}
}

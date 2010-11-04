package vehicles;

import vehicles.enums.*;

public class SeatCordoba extends Car
{
	public SeatCordoba(EngineModels engine, Colors color,BodyType bType, int nrOfDoors)
	{
		super(engine,color,bType,nrOfDoors);
		brand  = "Seat";
		model = "Cordoba";
	}
}

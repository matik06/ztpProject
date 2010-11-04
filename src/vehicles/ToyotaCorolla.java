package vehicles;

import vehicles.enums.*;

public class ToyotaCorolla extends Car{
	public ToyotaCorolla(EngineModels engine, Colors color,BodyType bType, int nrOfDoors)
	{
		super(engine,color,bType,nrOfDoors);
		brand  = "Toyota";
		model = "Corolla";
	}
}

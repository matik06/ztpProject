package vehicles;

import vehicles.enums.*;

public class ToyotaAvensis extends Car {
	public ToyotaAvensis(EngineModels engine, Colors color,BodyType bType, int nrOfDoors)
	{
		super(engine,color,bType,nrOfDoors);
		brand  = "Toyota";
		model = "Avensis";
	}
}

package vehicles;

import vehicles.enums.*;

public class ToyotaYaris extends Car {
	public ToyotaYaris(EngineModels engine, Colors color,BodyType bType, int nrOfDoors)
	{
		super(engine,color,bType,nrOfDoors);
		brand  = "Toyota";
		model = "Yaris";
	}
}

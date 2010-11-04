package vehicles;

import vehicles.enums.*;

public class AudiA3 extends Car 
{
	public AudiA3(EngineModels engine, Colors color,BodyType bType, int nrOfDoors)
	{
		super(engine,color,bType,nrOfDoors);
		brand  = "Audi";
		model = "A3";
	}
}

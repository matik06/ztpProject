package vehicles;

import vehicles.enums.*;

public class AudiA4 extends Car 
{
	public AudiA4(EngineModels engine, Colors color,BodyType bType, int nrOfDoors)
	{
		super(engine,color,bType,nrOfDoors);
		brand  = "Audi";
		model = "A4";
	}
}

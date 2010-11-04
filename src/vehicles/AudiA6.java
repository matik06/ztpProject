package vehicles;

import vehicles.enums.*;

public class AudiA6 extends Car 
{
	public AudiA6(EngineModels engine, Colors color,BodyType bType, int nrOfDoors)
	{
		super(engine,color,bType,nrOfDoors);
		brand  = "Audi";
		model = "A6";
	}
}

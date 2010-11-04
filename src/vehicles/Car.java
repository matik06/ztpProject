package vehicles;

import vehicles.enums.*;

public abstract class Car {	

	public String brand;
	public String model;
	public Boolean sold;
	private EngineModels engine;
	private int nrOfDoors;
	private Colors ccolor;
	private BodyType bType;
	
	public Car(EngineModels engine, Colors color,BodyType bType, int nrOfDoors)
	{
		setColor(color);
		setEngine(engine);
		setBody(bType);
		setNumberOfDoors(nrOfDoors);
	}
	
	public void setBody(BodyType body)
	{
		bType = body;
	}
	
	public BodyType getBodyType()
	{
		return bType;
	}
	
	public void setColor(Colors c)
	{
		ccolor = c;
	}
	
	public void setNumberOfDoors(int nr)
	{
		nrOfDoors = nr;
	} 
	
	public void setEngine(EngineModels eng)
	{
		engine = eng;
	}
	
	
	public Colors getColor()
	{
		return ccolor;
	}
	
	public int getNumberOfDoors()
	{
		return nrOfDoors;
	}
	public EngineModels getEngine()
	{
		return engine;
	}
	
	public void checkOil()
	{
		System.out.println("Sprawdzanie stanu oleju..");
	}
	
	public void wash()
	{
		System.out.println("Mycie samochodu..");
		System.out.println("Samochód wygląda na czysty :)");
	}
	
	public void polish()
	{
		System.out.println("Nabłyszczanie samochodu..");
		System.out.println("Samochód błyszczy :)");
	}
	
}


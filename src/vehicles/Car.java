package vehicles;

public abstract class Car {	

	public String brand;
	public String model;
	//reszta pól...
	
	public void checkOil()
	{
		System.out.println("Sprawdzanie stanu oleju..");
	}
	
	public void wash()
	{
		System.out.println("Washing car..");
		System.out.println("Car looks clean :)");
	}
	
	public void polish()
	{
		System.out.println("Polishing car..");
		System.out.println("The car shines");
	}
	
	
}


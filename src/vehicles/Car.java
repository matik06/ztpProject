package vehicles;

import vehicles.enums.*;

public abstract class Car extends Vehicle{	

	private BodyType bodyType = null;
	
	public Car(VehicleDetail vehicleDetails)
	{
		super(vehicleDetails);
		this.setBodyType(vehicleDetails.bodyType);
	}
	
	
	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}

	public BodyType getBodyType() {
		return bodyType;
	}

	public void checkOil()
	{
		System.out.println("Sprawdzanie stanu oleju w samochodzie");
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


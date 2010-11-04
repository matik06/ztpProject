package vehicles;

public abstract class Quad extends Vehicle {

	public Quad(VehicleDetail vehicleDetails) {
		
		super(vehicleDetails);
	}
	
	
	public void checkOil()
	{
		System.out.println("Sprawdzanie stanu oleju w quadzie");
	}
	
	public void wash()
	{
		System.out.println("Mycie quada..");
		System.out.println("Quad wygląda na czysty :)");
	}
	
	public void polish()
	{
		System.out.println("Nabłyszczanie quada..");
		System.out.println("Quad błyszczy :)");
	}

}

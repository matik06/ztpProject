package vehicles;

public abstract class Motorbike extends Vehicle{

	public Motorbike(VehicleDetail vehicleDetails) {
		
		super(vehicleDetails);
	}
	
	
	public void checkOil()
	{
		System.out.println("Sprawdzanie stanu oleju w motocyklu");
	}
	
	public void wash()
	{
		System.out.println("Mycie motocykla..");
		System.out.println("Motocykl wygląda na czysty :)");
	}
	
	public void polish()
	{
		System.out.println("Nabłyszczanie Motocykla..");
		System.out.println("Motocykl błyszczy :)");
	}

}

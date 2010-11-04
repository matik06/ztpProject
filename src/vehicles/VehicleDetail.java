package vehicles;

import vehicles.enums.*;

public class VehicleDetail {
	
	protected int id = -1;
	
	public Brand brand = null;
	public Model model = null;	
	public EngineModel engine = null;
	public BodyType bodyType = null;
	public Color color = null;
	public int purchasePrice = 0;
	
	
	public VehicleDetail(Model model, EngineModel engine, BodyType body,
						 Color color, int purchasePrice, Brand brand, int id) {
		
		this.model = model;
		this.engine = engine;
		this.bodyType = body;
		this.color = color;
		this.purchasePrice = purchasePrice;
		this.brand = brand;
		this.id = id;
	}
}

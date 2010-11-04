package vehicles;

import vehicles.enums.*;

public class VehicleDetail {
	
	public Model model = null;	
	public EngineModel engine = null;
	public BodyType bodyType = null;
	public Color color = null;
	
	public VehicleDetail(Model model, EngineModel engine, BodyType body,
						 Color color) {
		
		this.model = model;
		this.engine = engine;
		this.bodyType = body;
		this.color = color;
	}
}

package buildACar;

public class Chassis extends BuildACar
{
	public String chassisType; // Truck frame / car frame
	public int wheelCount; // 4 or 6, 6 only available with truck frame
	public String vehicleSubFrame; // If gap, car, choose sport, hatchback, or sedan
								   // If truck, choose flatbed, van, or SUV 
	
	
	// Accessor Methods
	public String getChassisType()
	{
		return chassisType;
	}
	
	public int getWheelCount()
	{
		return wheelCount;
	}
	
	public String getVehicleSubString()
	{
		return vehicleSubFrame;
	}
}

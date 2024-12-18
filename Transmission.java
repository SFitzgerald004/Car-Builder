package buildACar;

public class Transmission extends BuildACar
{
	public int gearCount; //1-10
	public String transmissionType; // Le Manuele or Autotragic
	public String gearType; // Long or Short
	
	// Accessor Methods
	// Get gear count
	public int getGearCount()
	{
		return gearCount;
	}
	
	// Get transmission type
	public String getTransmissionType()
	{
		return transmissionType;
	}
	
	// Get gear type
	public String getGearType()
	{
		return gearType;
	}
}

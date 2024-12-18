package buildACar;

public class Engine extends BuildACar
{
	public String engineType; // Inline, V, W, Boxer
	public int cylinderCount; // 4, 6, 8, 10, 12, 16
	public boolean turbocharged = false;
	public int numberOfTurbos; // 1, 2, 3, 4
	
	
	
	// Accessor Methods
	// Get Engine
	public String getEngine()
	{
		return engineType;
	}
	
	// Get cylinders
	public int getCylinders()
	{
		return cylinderCount;
	}
	
	// Get turbo boolean
	public boolean getTurboCheck()
	{
		return turbocharged;
	}
	
	// Get num of turbos
	public int getTurbos()
	{
		return numberOfTurbos;
	}
}

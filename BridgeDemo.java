interface Switch
{
	public void on();
	public void off();
}
class Fan implements Switch
{
	public void on()
	{	
		System.out.println("Fan got switched on.....");
	}
	public void off()
	{
		System.out.println("Fan got switched off.....");
	}
}
class Bulb implements Switch
{
	public void on()
	{
		System.out.println("Bulb started glowing.....");
	}
	public void off()
	{
		System.out.println("Bulb stopped glowing.....");
	}
}

abstract class ElectronicComponent 
{
	public static Switch getComponent(String comp)
	{
		if(comp.equalsIgnoreCase("Bulb"))
			return new Bulb();
		if(comp.equalsIgnoreCase("Fan"))
			return new Fan();
		return null;
	}
}	

public class BridgeDemo
{
	public static void main(String args[])
	{
		Switch sw = ElectronicComponent.getComponent(args[0]);
		sw.on();
		sw.off();
	}
}
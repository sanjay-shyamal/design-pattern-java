package FactoryEx;

public class TataTrucks implements TataMotors{

	@Override
	public void getEngineType() {
		System.out.println("Truck Engine");
		
	}

	@Override
	public void getWheeels() {
		System.out.println("10 wheelers");
		
	}

	@Override
	public void getFuelsType() {
		System.out.println("Diesel");
		
	}

	
}

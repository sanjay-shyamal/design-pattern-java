package FactoryEx;

public class TataCars implements TataMotors{

	@Override
	public void getEngineType() {
		System.out.println("Car Engine");
		
	}

	@Override
	public void getWheeels() {
		System.out.println("4 wheelers");
		
	}

	@Override
	public void getFuelsType() {
		System.out.println("Petrol");
		
	}

}

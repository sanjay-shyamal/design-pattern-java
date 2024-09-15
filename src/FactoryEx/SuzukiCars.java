package FactoryEx;

public class SuzukiCars implements TataMotors{

	@Override
	public void getEngineType() {
		System.out.println("Tata Car Engine");
		
	}

	@Override
	public void getWheeels() {
		System.out.println("Suzuki 4 wheelers");
		
	}

	@Override
	public void getFuelsType() {
		System.out.println("Suzuki Petrol");
		
	}
	

}

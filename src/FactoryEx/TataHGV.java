package FactoryEx;

public class TataHGV implements TataMotors{

	@Override
	public void getEngineType() {
		System.out.println("Lorry Engine");
		
	}

	@Override
	public void getWheeels() {
		System.out.println("4 Wheeler");
		
	}

	@Override
	public void getFuelsType() {
		System.out.println("CNG Fuel");
		
	}

}

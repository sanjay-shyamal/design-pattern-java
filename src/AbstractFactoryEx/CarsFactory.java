package AbstractFactoryEx;


public class CarsFactory extends TataMotorsAbstractFactory{

	@Override
	public TataMotors createVehicle() {
		return  new TataCars(); 
		
	}
	
}

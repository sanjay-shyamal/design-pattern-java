package AbstractFactoryEx;


public class TrucksFactory extends TataMotorsAbstractFactory {

	@Override
	public TataMotors createVehicle() {
		return new TataTrucks();
		
	}
	
}

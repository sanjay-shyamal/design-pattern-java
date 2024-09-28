package AbstractFactoryEx;

public class HGVFactory extends TataMotorsAbstractFactory{

	@Override
	public TataMotors createVehicle() {
		// TODO Auto-generated method stub
		return new TataHGV();
	}

}

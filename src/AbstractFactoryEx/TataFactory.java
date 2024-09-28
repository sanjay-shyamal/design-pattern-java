package AbstractFactoryEx;

public class TataFactory {

	public static TataMotors getTataMotors(TataMotorsAbstractFactory tataAbstractFactory) {
		return tataAbstractFactory.createVehicle();
	}

}

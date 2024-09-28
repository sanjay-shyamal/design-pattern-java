package AbstractFactoryEx;

public class SuzukiFactory {
	public TataMotors createVehicle() {
		// TODO Auto-generated method stub
		return new SuzukiCars();
	}
}

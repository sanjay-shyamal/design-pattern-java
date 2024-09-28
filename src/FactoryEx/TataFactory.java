package FactoryEx;

public class TataFactory {

	public static TataMotors getTataMotors(String tataMotorsType) {
		TataMotors tataMotors;
		switch (tataMotorsType) {
		case "Cars":
			tataMotors = new TataCars();
			break;
		case "Trucks":
			tataMotors = new TataTrucks();
			break;
		case "Lorry":
			tataMotors = new TataHGV();
			break;
		default:
			return null;
		}
		return tataMotors;
	}

}

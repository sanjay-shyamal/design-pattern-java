package FactoryEx;

public class TataFactory {

	public static TataMotors getTataMotors(String tataMotorsType) {
		TataMotors tataMotors;
		switch (tataMotorsType) {
		case "TataCars":
			tataMotors = new TataCars();
			break;
		case "TataTrucks":
			tataMotors = new TataTrucks();
			break;
		default:
			return null;
		}
		return tataMotors;
	}

}

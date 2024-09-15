package FactoryEx;

public class FactoryMainEx {

	public static void main(String[] args) {
//Loose coupled	
		System.out.println("-------------------TataCars---------------------");
		TataMotors tataCarsObj = TataFactory.getTataMotors("TataCars");
		tataCarsObj.getEngineType();
		tataCarsObj.getFuelsType();
		tataCarsObj.getWheeels();
//Loose coupled
		System.out.println("\n-------------------TataTrucks---------------------");
		TataMotors tataTrucksObj = TataFactory.getTataMotors("TataTrucks");
		tataTrucksObj.getEngineType();
		tataTrucksObj.getFuelsType();
		tataTrucksObj.getWheeels();
		
		
//Tight coupled
		System.out.println("-------------------SuzukiCars---------------------");
		SuzukiCars suzukiCarsObj = new SuzukiCars();
		suzukiCarsObj.getEngineType();
		suzukiCarsObj.getFuelsType();
		suzukiCarsObj.getWheeels();		
		
//Loose coupled
		/*
		System.out.println("-------------------TataCars---------------------");
		TataMotors tataMotors = TataFactory.getTataMotors("TataCars");
		tataMotors.getEngineType();
		tataMotors.getFuelsType();
		tataMotors.getWheeels();
		
		System.out.println("\n-------------------TataTrucks---------------------");
		tataMotors = TataFactory.getTataMotors("TataTrucks");
		tataMotors.getEngineType();
		tataMotors.getFuelsType();
		tataMotors.getWheeels();
		*/
	}

}

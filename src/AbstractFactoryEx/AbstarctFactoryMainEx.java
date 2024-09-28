package AbstractFactoryEx;


public class AbstarctFactoryMainEx {

	public static void main(String[] args) {
//Loose coupled	
				System.out.println("-------------------TataCars---------------------");
				TataMotors tataCarsObj = TataFactory.getTataMotors(new CarsFactory());
				tataCarsObj.getEngineType();
				tataCarsObj.getFuelsType();
				tataCarsObj.getWheeels();
//Loose coupled
				System.out.println("\n-------------------TataTrucks---------------------");
				TataMotors tataTrucksObj = TataFactory.getTataMotors(new TrucksFactory());
				tataTrucksObj.getEngineType();
				tataTrucksObj.getFuelsType();
				tataTrucksObj.getWheeels();
				
//Loose coupled
				System.out.println("\n-------------------Lorry---------------------");
				TataMotors tataLorryObj = TataFactory.getTataMotors(new HGVFactory());
				tataLorryObj.getEngineType();
				tataLorryObj.getFuelsType();
				tataLorryObj.getWheeels();
				
//Illegal Approach
/*
				System.out.println("-------------------SuzukiCars---------------------");
				SuzukiCars suzukiCarsObj = TataFactory.getTataMotors(new SuzukiFactory());
				suzukiCarsObj.getEngineType();
				suzukiCarsObj.getFuelsType();
				suzukiCarsObj.getWheeels();
*/

	}

}

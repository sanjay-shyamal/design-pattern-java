package SingletonEx;

public class SingletonSample {
	
	private static SingletonSample singletonSample;
	
	private SingletonSample()
	{
//Overcome reflection issue
		if(singletonSample!=null) {
			throw new RuntimeException("Object createtion not allowed");
		}
	}
	
	public static SingletonSample getInstance() {
		System.out.println("getInstance starred ---------------------------- ");
		if(singletonSample == null) {
			System.out.println("New SingletonSample ----------------------------");
			singletonSample = new SingletonSample();
		}
		return singletonSample;
	}

}

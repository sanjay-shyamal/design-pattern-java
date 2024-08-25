package SingletonEx;

import java.lang.reflect.Constructor;

public class MainClass {

	public static void main(String[] args) {
		SingletonSample obj1 = SingletonSample.getInstance();
		SingletonSample obj2 = SingletonSample.getInstance();
		SingletonSample obj3 = SingletonSample.getInstance();
		System.out.println("obj1 : " +obj1);
//		System.out.println("obj2 : "+ obj2);
//		System.out.println("obj3 : "+ obj3);
		
		SingletonSample obj4 = null;
		SingletonSample obj5 = null;
		
		try {
//Reflection API, Class level			
			Constructor<SingletonSample> constructor = SingletonSample.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			obj4 = constructor.newInstance();
			obj5 = constructor.newInstance();
			System.out.println("obj4 : "+ obj4);
			System.out.println("obj5 : "+ obj5);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

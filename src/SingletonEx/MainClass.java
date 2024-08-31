package SingletonEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class MainClass implements Serializable, Cloneable {

	public static void main(String[] args) throws Exception {
		SingletonSample obj1 = SingletonSample.getInstance();
		SingletonSample obj2 = SingletonSample.getInstance();
		SingletonSample obj3 = SingletonSample.getInstance();
		System.out.println("obj1 : " +obj1);
//		System.out.println("obj2 : "+ obj2);
//		System.out.println("obj3 : "+ obj3);
		
		SingletonSample obj4 = null;
		SingletonSample obj5 = null;
/*		
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
*/
		
/*
		SingletonEnum obj6 = SingletonEnum.INSTANCE;
		SingletonEnum obj7 = null;
		System.out.println("obj6 : "+ obj6);
		try {
//Reflection API, Class level			
			Constructor<SingletonEnum> constructor = SingletonEnum.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			obj7 = constructor.newInstance();
			System.out.println("obj7 : "+ obj7);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		
//De-Serializable
		SingletonSample obj8 = SingletonSample.getInstance();
		SingletonSample obj9 = null;
		//Serilzation
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("cc.txt"));
		out.writeObject(obj8);
		out.close();
		//De-Serilzation
		ObjectInput in = new ObjectInputStream(new FileInputStream("cc.txt"));
		obj9 = (SingletonSample) in.readObject();
		in.close();
//		System.out.println("obj8 : " + obj8);
//		System.out.println("obj9 : " + obj9);
		
//Cloning
		SingletonSample obj10 = SingletonSample.getInstance();
		SingletonSample obj11 = (SingletonSample) obj10.clone();
		
		System.out.println("obj10 : " + obj10);
		System.out.println("obj11 : " + obj11);
		
		
		
		

	}

}

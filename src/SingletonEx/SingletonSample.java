package SingletonEx;

import java.io.Serializable;

public class SingletonSample implements Serializable, Cloneable{
	
	private static SingletonSample singletonSample ;
	
	private SingletonSample()
	{
//Overcome reflection issue
		if(singletonSample!=null) {
			throw new RuntimeException("Object createtion not allowed");
		}
	}
//double-checked locking to ensure thread safety.	
	public static SingletonSample getInstance() {
		System.out.println("getInstance starred ---------------------------- ");
		if(singletonSample == null) {
//thread safety
			synchronized (SingletonSample.class) {
                if (singletonSample == null) {
                	singletonSample = new SingletonSample();
                }
			}
		}
		return singletonSample;
	}

//Overcome the de-serialiazable issue
	protected Object readResolve() {
		return singletonSample;
	} 
	
// the Cloning issue
/*	
	@Override
    protected Object clone()throws CloneNotSupportedException
    {
		return super.clone();
    }
*/
//Overcome the Cloning issue
	@Override
    protected Object clone()throws CloneNotSupportedException
    {
		return singletonSample;
    }

}

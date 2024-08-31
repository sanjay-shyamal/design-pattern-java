package SingletonEx;

public enum SingletonEnum {
	INSTANCE;
	
	public void display() {
		System.out.println("display() executed");
	}
	
	public void show() {
		System.out.println("show() executed");
	}
}

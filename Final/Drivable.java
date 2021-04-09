interface testInterface {
	public void run();
	public static void walk() {
		System.out.println("walk");
	}
	
}

class Car implements testInterface {
	public void run() {
		System.out.println("car is running");
	}
}


public class Drivable {
	public static void main(String[] args) {

	}
}
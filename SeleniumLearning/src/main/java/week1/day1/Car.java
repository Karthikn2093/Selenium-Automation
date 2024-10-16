package week1.day1;

public class Car {
	String carColor = "Red";
	int numWheels = 4;
	
	
	public void driveCar() {
		System.out.println("Drive Car");
		
	}
	public void applyBrake() {
		System.out.println("Apply Brake");

	}

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.driveCar();
		myCar.applyBrake();

	}

}

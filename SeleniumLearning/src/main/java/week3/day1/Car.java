package week3.day1;

public class Car extends Vehicle {
	public void switchOnAc() {
		System.out.println("Switch AC");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.switchOnAc();
		myCar.applyBrake();
		myCar.soundHorn();
	}
}

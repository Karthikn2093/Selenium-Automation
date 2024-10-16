package week3.day1;

public class BMW extends Car {
	
	public void airBags() {
		System.out.println("Airbags");
	}

	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.airBags();bmw.switchOnAc();bmw.applyBrake();bmw.soundHorn();

	}

}

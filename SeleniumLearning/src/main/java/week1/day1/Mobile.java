package week1.day1;

public class Mobile {
	
	long mobileNumber = 912082212 ;
	String mobColor = "Grey";
	double mobWeight = 2.30;
	boolean isRefurbished = false;
	
	public void makeCall() {
		System.out.println("Make Call");
	}
	public void sendMessage() {
		System.out.println("Send Message");
	}
	public void takePhoto() {
		System.out.println("Take Photo");
	}

	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendMessage();
		mob.takePhoto();
		System.out.println("Mobile Number: "+ mob.mobileNumber + "\n" + "Mobile Color: "+ mob.mobColor + "\n" + "Mobile Weight: " + mob.mobWeight + "\n" + "Mobile Refurbished: " + mob.isRefurbished );

	}

}

package Week3;

public class Car extends Vehicle {
	
	public void turnOnAc() {
		System.out.println("Ac is on");
	}
	public void sunRoof() {
		System.out.println("sunRoof is visible");
	}
	private void applyBrake() {
		System.out.println("Break appilied");
	}
	
	public static void main(String [] args) {
		Car ca=new Car();
		ca.applyBrake();
		ca.soundHorn();

		

	}
	
		
		
	}



package Week3;

public class Auto extends Vehicle {
	
	public void turnOnMeter() {
		System.out.println("turnOnMeter");
	}
	
	public void handStart() {
		System.out.println("handStart");
	}
	
	public static void main(String[] args) {
		
		Auto ac=new Auto();
		ac.applyBreak();
		ac.soundHorn();
	}

}
